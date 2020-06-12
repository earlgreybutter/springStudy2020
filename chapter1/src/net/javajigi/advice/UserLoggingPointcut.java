package net.javajigi.advice;

import java.lang.reflect.Method;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

import net.javajigi.user.dao.MySQLUserDAO;
import net.javajigi.user.service.UserServiceImpl;

public class UserLoggingPointcut extends StaticMethodMatcherPointcut {

	public boolean matches(Method method, Class cls) {
		System.out.println("222222222222222메소드 대조");
		return true;
	}
	
	public ClassFilter getClassFilter() {
		return new ClassFilter() {
			public boolean matches(Class cls) {
				System.out.println("11111111111클래스 대조");
				return (cls == UserServiceImpl.class) || (cls == MySQLUserDAO.class);
			}
		};
	}
}
