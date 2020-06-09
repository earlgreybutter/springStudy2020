package test.aspectj.spring.di.fish;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class FishAspect {

	@Pointcut("execution(* get*(..))")
	public void sayHi() {
		
	}
	
	@Around("sayHi()")
	public Object say(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("���� ������");
		
		Object name = pjp.proceed();
		
		System.out.println("�Ŀ� ������");
		
		return name;
	}
	
	@Around("execution(* set*(..))")
	public void validate(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("setXXX ���� ������");
		
		pjp.proceed();
	}
}
