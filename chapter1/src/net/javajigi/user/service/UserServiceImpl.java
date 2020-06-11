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
import net.javajigi.user.dao.DataAccessException;
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
	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context ; 
	}

	
	
	
	@Override
	public int addUser(User user) throws ExistedUserException {
		// TODO Auto-generated method stub
		
		if(logger.isDebugEnabled()) {
			logger.debug("addUser() 시작");
			logger.debug("User : " + user);
		}
		
		if(userDAO.existedUser(user.getUserId())) {
			throw new ExistedUserException(context.getMessage("user.existed.exception", new Object[] {user.getUserId()}, null));
		}
		
		int result = 0;
		
		try {
			result = userDAO.insert(user);
		}
		catch (DataAccessException e) {
			// TODO: handle exception
			throw e; 
		}
		
		if(logger.isDebugEnabled()) {
			logger.debug("Added " + user.getUserId() + " in User System!!");
		}
		
		if(logger.isDebugEnabled()) {
			logger.debug("addUser() 종료");
		}
		
		return result;
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		
		if(logger.isDebugEnabled()) {
			logger.debug("updateUser() 시작");
			logger.debug("User : " + user);
		}
		
		int result = 0;
		
		try {
			result = userDAO.update(user);
		}
		catch (DataAccessException e) {
			// TODO: handle exception
			throw e;
		}
		
		if(logger.isDebugEnabled()) {
			logger.debug("Updated " + user.getUserId() + " in User System !! ");
		}
		
		if(logger.isDebugEnabled()) {
			logger.debug("UpdateUser() 종료"); 
		}
		
		return result;
	}

	@Override
	public int removeUser(String userId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User findUser(String userId) throws UserNotFoundException {
		// TODO Auto-generated method stub
		
		if(logger.isDebugEnabled()) {
			logger.debug("findUser() 시작");
			logger.debug("User ID : " + userId);
		}
		
		User user = null;
		
		try {
			
			user = userDAO.findUser(userId);
			
		}catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
		
		if(user == null) {
			throw new UserNotFoundException(context.getMessage("user.notfound.exception", new Object[] {userId}, null));
		}
		
		if(logger.isDebugEnabled()) {
			logger.debug(userId + " 사용자 정보 : " + user);
		}
		
		if(logger.isDebugEnabled()) {
			logger.debug("findUser() 종료");
		}
		
		return user;
	}

	@Override
	public List findUserList() {
		// TODO Auto-generated method stub
		
		if(logger.isDebugEnabled()) {
			logger.debug("findUserList() 시작"); 
		}
		
		List userList = null;
		
		try {
			userList = userDAO.findUserList();
		}
		catch (DataAccessException e) {
			// TODO: handle exception
			throw e;
		}
		
		if(logger.isDebugEnabled()) {
			if(userList != null) {
				logger.debug("User System 사용자 수 : " + userList.size());
			}
			else { 
				logger.debug("User System 사용자 수 : 0 " );
			}
		}
		
		if(logger.isDebugEnabled()) {
			logger.debug("findUserList() 종료");
		}
		
		return userList;
	}

	@Override
	public boolean login(String userId, String password) throws PasswordMismatchException, UserNotFoundException {
		// TODO Auto-generated method stub
		
		if(logger.isDebugEnabled()) {
			logger.debug("login() 시작");
			logger.debug("User Id : " + userId);
		}
		
		User user = findUser(userId);
		
		if(!user.isMatchPassword(password)) {
			throw new PasswordMismatchException(context.getMessage("passoword.mismatch.exception", new Object[] {userId}, null));
		} 
		
		if(logger.isDebugEnabled()) {
			logger.debug("login() 종료"); 
		}
		
		return true;
	}
}
