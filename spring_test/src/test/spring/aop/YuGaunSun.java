package test.spring.aop;

public class YuGaunSun implements Human {

	@Override
	public String sayName(String name) {
		// TODO Auto-generated method stub
		System.out.println(name+"�̶�� �մϴ�. ");
		return "�� ~~~ ������ ȶ�� "+name+"�̴�. ";
	}
}