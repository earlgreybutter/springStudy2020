package test.aspectj.spring.aop;

import java.util.GregorianCalendar;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFirstAOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BeanFactory bf = new ClassPathXmlApplicationContext(
				"test/aspectj/spring/aop/aopAppContext.xml"
				);
		Hero hero = (Hero)bf.getBean("jgs");
		
		System.out.println("나이를 처리 후 화면에 리턴된 나이 : " + hero.getAge());
		System.out.println(hero.getBirthday().getTime());
		System.out.println(hero.getName());
		
		hero.setAge(35);
		hero.setBirthday(new GregorianCalendar(1669, 7, 15));
		hero.setName("이순신");
		System.out.println(hero);
	}

}
