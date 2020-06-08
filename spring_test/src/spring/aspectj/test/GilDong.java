package spring.aspectj.test;

public class GilDong {

	// 코드 : 종단 
	// 이 클래스는 변경없이 
	// 전 : 당신은 누구십니까? 
	// 후 : 아 그러시군요 ~~~ 기능을 추가하시오 
	private void say(){
		System.out.println("난 홍길동이라고 합니다. ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new GilDong().say();
		
		
	}	
}
