package net.javajigi.user.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;

import net.javajigi.user.ExistedUserException;
import net.javajigi.user.PasswordMismatchException;
import net.javajigi.user.UserNotFoundException;
import net.javajigi.user.dao.UserDAO;
import net.javajigi.user.model.User;

public class UserServiceImpl implements UserService, InitializingBean {

	protected final Log logger = LogFactory.getLog(getClass());
	
	private UserDAO userDAO;
	
	private ApplicationContext context;
	
	public void afterPropertiesSet() throws Exception {
		if(userDAO == null) {
			throw new Exception(context.getMessage("instance.not.init", new Object[] {"UserDAO"}, null));
		}
	}
	
	public void setUserDAO(UserDAO newUserDAO) {
		this.userDAO = userDAO;
	}
	
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context ; 
	}

	
	
	
	@Override
	public int addUser(User user) throws ExistedUserException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeUser(String userId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User findUser(String userId) throws UserNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List findUserList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean login(String userId, String password) throws PasswordMismatchException, UserNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}
}
