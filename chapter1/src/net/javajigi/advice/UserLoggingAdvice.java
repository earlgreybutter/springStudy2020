package net.javajigi.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class UserLoggingAdvice implements MethodInterceptor {

	protected final Log logger = LogFactory.getLog(getClass());
	
	public Object invoke(MethodInvocation invocation) throws Throwable {
		String className = invocation.getThis().getClass().getName();
		
		if(logger.isDebugEnabled()) {
			System.out.println("33333333333333 �޼ҵ� ���� �� ");
			logger.debug(className +"." + invocation.getMethod().getName()+"()"+" ����!!");
			
			Object[] args = invocation.getArguments();
			if((args!=null)&&(args.length>0)) {
				for(int i=0; i<args.length; i++) {
					logger.debug("Argument["+i+"] : " + args[i]);
				}
			}
		}
		
		Object retVal = invocation.proceed();
		
		if(logger.isDebugEnabled()) {
			logger.debug(className+"."+invocation.getMethod().getName()+"()"+" ����! ");
		}
		System.out.println("444444444444444444444444 �޼ҵ� ���� ��");
		return retVal;
	}
}
