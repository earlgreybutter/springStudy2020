/**
 * �� �ҽ��� Spring �����ӿ�ũ ��ũ�Ͽ��� ����� ���� �ҽ��Դϴ�. 
 * �� �ҽ��� ��� �����ڵ��� �����Ӱ� ���� �� ������ �� �ֽ��ϴ�. 
 * ��, �� �ҽ��� ������� ���ο� ���ø����̼��� ������ ��� ��ó�� ����� �ֽø� �˴ϴ�. 
 */
package net.javajigi.db;

/**
 * �ּ��� �־� �ּ���. �谡 ���Ŀ�.
 * 
 * @author ���缺(�ڹ�����, javajigi@gmail.com)
 */
public class DBNotSupportedException extends RuntimeException {

    public DBNotSupportedException() {
        super();
        // TODO Auto-generated constructor stub
    }

    public DBNotSupportedException(String message, Throwable cause) {
        super(message, cause);
        // TODO Auto-generated constructor stub
    }

    public DBNotSupportedException(String message) {
        super(message);
        // TODO Auto-generated constructor stub
    }

    public DBNotSupportedException(Throwable cause) {
        super(cause);
        // TODO Auto-generated constructor stub
    }

}
