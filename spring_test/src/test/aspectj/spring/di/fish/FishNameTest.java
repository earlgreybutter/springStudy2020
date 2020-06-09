package test.aspectj.spring.di.fish;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FishNameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory bf = new ClassPathXmlApplicationContext(
				"test/aspectj/spring/di/fish/aopAppContext.xml"
				);
		
		Fish fish1 = (Fish)bf.getBean("gamulchi");
		Fish fish2 = (Fish)bf.getBean("gumbung");
		
		System.out.println("이름1 : "+ fish1.getName());
		System.out.println("이름2 : "+ fish2.getName() );
		
		fish1.setName("가물가물");
		fish2.setName("붕어붕어");
		
		System.out.println("바뀐 이름1 : " + fish1.getName());
		System.out.println("바뀐 이름2 : " + fish2.getName());

	}

}
