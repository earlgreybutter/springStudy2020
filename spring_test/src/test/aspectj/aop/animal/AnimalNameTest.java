package test.aspectj.aop.animal;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalNameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory bf = new ClassPathXmlApplicationContext("test/aspectj/aop/animal/aopAppContext.xml");
		
		Animal animal = (Animal)bf.getBean("dog");
		animal.getName();
		
		animal =(Animal)bf.getBean("cat");
		animal.getName();

	}

}
