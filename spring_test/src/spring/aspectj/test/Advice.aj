package spring.aspectj.test;

public aspect Advice {

	// aspectj�� spring �� �ƴ�����, �ս��� aop�� ������ �� �ִ� 
	
	pointcut callsay(): call(* GilDong.say(..));
	
	
	// before advice 
	before() : callsay() {
		System.out.println("����� �����ʴϱ�?");
	}
	
	// after advice 
	after() : callsay() {
		System.out.println("�� �׷��ñ��� ~~~~~~");
	}
}
