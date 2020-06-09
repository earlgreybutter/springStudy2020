/**
 * �� �ҽ��� Spring �����ӿ�ũ ��ũ�Ͽ��� ����� ���� �ҽ��Դϴ�. 
 * �� �ҽ��� ��� �����ڵ��� �����Ӱ� ���� �� ������ �� �ֽ��ϴ�. 
 * ��, �� �ҽ��� ������� ���ο� ���ø����̼��� ������ ��� ��ó�� ����� �ֽø� �˴ϴ�. 
 */
package net.javajigi.user.dao;

import java.util.List;

import net.javajigi.user.model.User;

/**
 * ����� �������� �����ͺ��̽����� �۾��� �����ϴ� Ŭ����.
 * UserInfo ���̺� ����ڸ� �߰�, ����, ����, �˻����� �۾��� �Ѵ�. 
 * 
 * @author ���缺(�ڹ����� - javajigi@gmail.com)
 */
public interface UserDAO {
	/**
	 * ����� ���� ���̺� ���ο� ����� ����.
	 */
	public int insert(User user) throws DataAccessException;

	/**
	 * ������ ����� ����� ������ ����.
	 */
	public int update(User user) throws DataAccessException;
	
	/**
	 * ����� ���̵� �ش��ϴ� ����ڸ� ����.
	 */
	public int delete(String userId) throws DataAccessException;
	
	/**
	 * ����� ���̵� ������ �����ͺ��̽����� ã�� User ������ Ŭ������ 
	 * �����Ͽ� ��ȯ.
	 */
	public User findUser(String userId) throws DataAccessException;
	
	/**
	 * ����� ����Ʈ�� ����� ���� �κ����� ���� �������� 
	 * �������� ī��Ʈ���� �̿��Ͽ� �ش�κ��� ����ڸ��� List�ݷ��ǿ�
	 * �����Ͽ� ��ȯ.
	 */
	public List findUserList() throws DataAccessException;
	
	/**
	 * ���ڷ� ���޵Ǵ� ���̵� ������ ����ڰ� �����ϴ����� 
	 * ������ �Ǻ�. 
	 */
	public boolean existedUser(String userId) throws DataAccessException;
	
}
