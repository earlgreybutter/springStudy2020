package test.aspectj.aop.animal;

public class Cat implements Animal {
	
	public Cat() {
		System.out.println("Cat");
	}

	@Override
	public void getName() {
		// TODO Auto-generated method stub
		System.out.println("ล่");

	}

}
