package test.aspectj.spring.aop;

import java.util.GregorianCalendar;

public interface Hero {

	public int getAge();
	public void setAge(int age);
	public GregorianCalendar getBirthday();
	public void setBirthday(GregorianCalendar birthday);
	public String getName();
	public void setName(String name);
}
