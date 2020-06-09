package test.aspectj.aop.animal;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AnimalAOP {
	@Pointcut("this(Animal)")
	public void sayGoodBye() {
		
	}
	
	/*
	@Pointcut("whitin(Dog)||within(Cat)")
	public void sayGoodBye() {
		
	}
	*/
	
	@AfterReturning("sayGoodBye()")
	public void say() {
		System.out.println("¾È³ç~");
	}
}
