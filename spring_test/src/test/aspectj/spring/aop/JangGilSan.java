package test.aspectj.spring.aop;

import java.util.GregorianCalendar;

public class JangGilSan implements Hero {

	String name; 
	int age;
	GregorianCalendar birthday;
	
	private JangGilSan() {
		name = "장길산";
		age = 16;
		birthday = new GregorianCalendar(1588, 7, 15);
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		System.out.println("나이 반환 중 ");
		return age;
	}

	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
		this.age = age ;
		System.out.println("나이가 세팅되고 있습니다. ");
	}

	@Override
	public GregorianCalendar getBirthday() {
		// TODO Auto-generated method stub
		return birthday;
	}

	@Override
	public void setBirthday(GregorianCalendar birthday) {
		// TODO Auto-generated method stub
		this.birthday = birthday;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}
	
	
	
}
