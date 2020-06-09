package test.aspectj.aop.animal;

public class Dog implements Animal {

	public Dog() {
		System.out.println("Dog");
	}
	
	@Override
	public void getName() {
		// TODO Auto-generated method stub
		System.out.println("ºù°í");
	}

}
