/**
 * �� �ҽ��� Spring �����ӿ�ũ ��ũ�Ͽ��� ����� ���� �ҽ��Դϴ�. 
 * �� �ҽ��� ��� �����ڵ��� �����Ӱ� ���� �� ������ �� �ֽ��ϴ�. 
 * ��, �� �ҽ��� ������� ���ο� ���ø����̼��� ������ ��� ��ó�� ����� �ֽø� �˴ϴ�. 
 */
package net.javajigi.db;

/**
 * �ּ��� �־� �ּ���. �谡 ���Ŀ�.
 * 
 * @author ���缺(�ڹ����� - javajigi@gmail.com)
 */
public class DBNotConnectedException extends RuntimeException {

	public DBNotConnectedException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DBNotConnectedException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public DBNotConnectedException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public DBNotConnectedException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
