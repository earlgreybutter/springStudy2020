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
		System.out.println("�̸��� �����մϴ�. ");
	}
	
	@Before("execution(* set*(java.util.GregorianCalendar))")
	public void confirmBirthday() {
		System.out.println("������ �����մϴ�. ");
	}
	
	@Before("execution(* set*(int))")
	public void confrimAge() {
		System.out.println("���̸� �����ϱ� ���Դϴ�. ");
	}
	
	@After("execution(* set*(int))")
	public void confirmAge2() {
		System.out.println("���̸� ������ �����Դϴ�. ");
	}
	
	@Before("execution(* getAge(..))")
	public void confirmBeforeSettingAge() {
		System.out.println("���̸� ��ȯ�ϱ� �����Դϴ�. ");
	}
	
	@AfterReturning(returning = "age", value = "execution(* getAge(..))")
	public void confirmBeforeSettingAge2(int age) {
		System.out.println("��ȯ�� �����Դϴ�. 1 : "+age);
	}
	
	@After("execution(* getAge(..))")
	public void confirmBeforesettingAge3() {
		System.out.println("��ȯ�� �����Դϴ�. 2 : ");
	}
	
	@AfterReturning(returning = "name", value = "execution(* getName(..))")
	public void confirmBeforeSettingName(String name) {
		System.out.println("���� �̸��� : "+name);
	}
	
	@AfterReturning(returning = "date", value = "execution(* getBirthday(..))")
	public void confirmBeforeSettingDate(GregorianCalendar date) {
		System.out.println("���� ������ : "+date.getTime());
	}
}
