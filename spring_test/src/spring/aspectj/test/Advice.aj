package spring.aspectj.test;

public aspect Advice {

	// aspectj는 spring 이 아니지만, 손쉽게 aop를 구현할 수 있다 
	
	pointcut callsay(): call(* GilDong.say(..));
	
	
	// before advice 
	before() : callsay() {
		System.out.println("당신은 누구십니까?");
	}
	
	// after advice 
	after() : callsay() {
		System.out.println("아 그러시군요 ~~~~~~");
	}
}
