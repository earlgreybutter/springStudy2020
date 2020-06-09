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
		System.out.println("전에 동작함");
		
		Object name = pjp.proceed();
		
		System.out.println("후에 동작함");
		
		return name;
	}
	
	@Around("execution(* set*(..))")
	public void validate(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("setXXX 에서 동작함");
		
		pjp.proceed();
	}
}
