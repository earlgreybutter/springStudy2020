package test.spring.aop;

public class MannerAOP {

	public void beforeSaying() {
		System.out.println("당신의 이름을 말해보시오.");
	}
	
	public void afterreturnSaying() {
		System.out.println("정말 멋진 분이네요.");
	}
	
	public void afterSaying() {
		System.out.println("존경합니다. ");
	}
}
