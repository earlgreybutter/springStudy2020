package test.aspectj.spring.aop;

import java.util.GregorianCalendar;

public class JangGilSan implements Hero {

	String name; 
	int age;
	GregorianCalendar birthday;
	
	private JangGilSan() {
		name = "����";
		age = 16;
		birthday = new GregorianCalendar(1588, 7, 15);
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		System.out.println("���� ��ȯ �� ");
		return age;
	}

	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
		this.age = age ;
		System.out.println("���̰� ���õǰ� �ֽ��ϴ�. ");
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
