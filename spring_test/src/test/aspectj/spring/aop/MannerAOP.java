package test.aspectj.spring.aop;

import java.util.GregorianCalendar;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MannerAOP {

	@Before("execution(* set*(String))")
	public void confirmName() {
		System.out.println("이름을 세팅합니다. ");
	}
	
	@Before("execution(* set*(java.util.GregorianCalendar))")
	public void confirmBirthday() {
		System.out.println("생일을 세팅합니다. ");
	}
	
	@Before("execution(* set*(int))")
	public void confrimAge() {
		System.out.println("나이를 세팅하기 전입니다. ");
	}
	
	@After("execution(* set*(int))")
	public void confirmAge2() {
		System.out.println("나이를 세팅한 이후입니다. ");
	}
	
	@Before("execution(* getAge(..))")
	public void confirmBeforeSettingAge() {
		System.out.println("나이를 반환하기 이전입니다. ");
	}
	
	@AfterReturning(returning = "age", value = "execution(* getAge(..))")
	public void confirmBeforeSettingAge2(int age) {
		System.out.println("반환된 나이입니다. 1 : "+age);
	}
	
	@After("execution(* getAge(..))")
	public void confirmBeforesettingAge3() {
		System.out.println("반환된 나이입니다. 2 : ");
	}
	
	@AfterReturning(returning = "name", value = "execution(* getName(..))")
	public void confirmBeforeSettingName(String name) {
		System.out.println("원래 이름은 : "+name);
	}
	
	@AfterReturning(returning = "date", value = "execution(* getBirthday(..))")
	public void confirmBeforeSettingDate(GregorianCalendar date) {
		System.out.println("원래 생일은 : "+date.getTime());
	}
}
