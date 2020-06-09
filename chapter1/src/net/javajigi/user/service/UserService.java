/**
 * �� �ҽ��� Spring �����ӿ�ũ ��ũ�Ͽ��� ����� ���� �ҽ��Դϴ�. 
 * �� �ҽ��� ��� �����ڵ��� �����Ӱ� ���� �� ������ �� �ֽ��ϴ�. 
 * ��, �� �ҽ��� ������� ���ο� ���ø����̼��� ������ ��� ��ó�� ����� �ֽø� �˴ϴ�. 
 */
package net.javajigi.user.service;

import java.util.List;

import org.springframework.context.ApplicationContextAware;

import net.javajigi.user.ExistedUserException;
import net.javajigi.user.PasswordMismatchException;
import net.javajigi.user.UserNotFoundException;
import net.javajigi.user.model.User;

/**
 * �ּ��� �־� �ּ���. �谡 ���Ŀ�.
 * @author       ���缺(�ڹ�����, javajigi@gmail.com)
 * @uml.dependency   supplier="net.javajigi.user.dao.UserDAOFactory" stereotypes="Omondo::Access"
 */
public interface UserService extends ApplicationContextAware {
    public int addUser(User user) throws ExistedUserException;

    public int updateUser(User user);

    public int removeUser(String userId);

    public User findUser(String userId) throws UserNotFoundException;

    public List findUserList();

    public boolean login(String userId, String password)
            throws PasswordMismatchException, UserNotFoundException;
}
