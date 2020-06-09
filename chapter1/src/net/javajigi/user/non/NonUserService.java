/**
 * 이 소스는 Spring 프레임워크 워크북에서 사용한 예제 소스입니다. 
 * 이 소스는 모든 개발자들이 자유롭게 수정 및 배포할 수 있습니다. 
 * 단, 이 소스를 기반으로 새로운 애플리케이션을 개발할 경우 출처를 명시해 주시면 됩니다. 
 */
package net.javajigi.user.non;

import java.util.List;

import net.javajigi.user.ExistedUserException;
import net.javajigi.user.PasswordMismatchException;
import net.javajigi.user.UserNotFoundException;
import net.javajigi.user.dao.UserDAO;
import net.javajigi.user.dao.UserDAOFactory;
import net.javajigi.user.model.User;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 주석을 넣어 주세요. 배가 고파요.
 * 
 * @author 박재성(자바지기 - javajigi@gmail.com)
 */
public class NonUserService {
    protected static final Log logger = LogFactory.getLog(NonUserService.class);
   
    // Singleton 인스턴스
    private static NonUserService instance = null;

    static {
        instance = new NonUserService();
    }

    private NonUserService() {
    }

    public static NonUserService getInstance() {
        return instance;
    }

    public int addUser(User user) throws ExistedUserException {
        if (getUserDAO().existedUser(user.getUserId())) {
            throw new ExistedUserException(user.getUserId() + "는 존재하는 아이디입니다.");
        }

        return getUserDAO().insert(user);
    }

    public int updateUser(User user) {
        return getUserDAO().update(user);
    }

    public int removeUser(String userId) {
        return getUserDAO().delete(userId);
    }

    public User findUser(String userId) throws UserNotFoundException {
        User user = getUserDAO().findUser(userId);

        if (user == null) {
            throw new UserNotFoundException(userId + "는 존재하지 않는 아이디입니다.");
        }

        return user;
    }

    public List findUserList() {
        return getUserDAO().findUserList();
    }

    public boolean login(String userId, String password)
            throws UserNotFoundException, PasswordMismatchException {
        User user = findUser(userId);

        if (!user.isMatchPassword(password)) {
            throw new PasswordMismatchException("비밀번호가 일치하지 않습니다.");
        }

        return true;
    }

    private UserDAO getUserDAO() {
        return UserDAOFactory.getUserDAO(UserDAOFactory.MYSQL_DB);
    }
}
