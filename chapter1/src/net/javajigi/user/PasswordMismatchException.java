/**
 * �� �ҽ��� Spring �����ӿ�ũ ��ũ�Ͽ��� ����� ���� �ҽ��Դϴ�. 
 * �� �ҽ��� ��� �����ڵ��� �����Ӱ� ���� �� ������ �� �ֽ��ϴ�. 
 * ��, �� �ҽ��� ������� ���ο� ���ø����̼��� ������ ��� ��ó�� ����� �ֽø� �˴ϴ�. 
 */
package net.javajigi.user;

/**
 * �ּ��� �־� �ּ���. �谡 ���Ŀ�.
 * 
 * @author ���缺(�ڹ�����, javajigi@gmail.com)
 */
public class PasswordMismatchException extends Exception {

    public PasswordMismatchException() {
        super();
    }

    public PasswordMismatchException(String message) {
        super(message);
    }

    public PasswordMismatchException(Throwable cause) {
        super(cause);
    }

    public PasswordMismatchException(String message, Throwable cause) {
        super(message, cause);
    }
}
