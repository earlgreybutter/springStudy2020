/**
 * �� �ҽ��� Spring �����ӿ�ũ ��ũ�Ͽ��� ����� ���� �ҽ��Դϴ�. 
 * �� �ҽ��� ��� �����ڵ��� �����Ӱ� ���� �� ������ �� �ֽ��ϴ�. 
 * ��, �� �ҽ��� ������� ���ο� ���ø����̼��� ������ ��� ��ó�� ����� �ֽø� �˴ϴ�. 
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
 * �ּ��� �־� �ּ���. �谡 ���Ŀ�.
 * 
 * @author ���缺(�ڹ����� - javajigi@gmail.com)
 */
public class NonUserService {
    protected static final Log logger = LogFactory.getLog(NonUserService.class);
   
    // Singleton �ν��Ͻ�
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
            throw new ExistedUserException(user.getUserId() + "�� �����ϴ� ���̵��Դϴ�.");
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
            throw new UserNotFoundException(userId + "�� �������� �ʴ� ���̵��Դϴ�.");
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
            throw new PasswordMismatchException("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
        }

        return true;
    }

    private UserDAO getUserDAO() {
        return UserDAOFactory.getUserDAO(UserDAOFactory.MYSQL_DB);
    }
}
