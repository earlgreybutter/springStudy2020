package test.spring.aop;

public class MannerAOP {

	public void beforeSaying() {
		System.out.println("����� �̸��� ���غ��ÿ�.");
	}
	
	public void afterreturnSaying() {
		System.out.println("���� ���� ���̳׿�.");
	}
	
	public void afterSaying() {
		System.out.println("�����մϴ�. ");
	}
}
