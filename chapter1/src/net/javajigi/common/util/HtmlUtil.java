/**
 * �� �ҽ��� Spring �����ӿ�ũ ��ũ�Ͽ��� ����� ���� �ҽ��Դϴ�. 
 * �� �ҽ��� ��� �����ڵ��� �����Ӱ� ���� �� ������ �� �ֽ��ϴ�. 
 * ��, �� �ҽ��� ������� ���ο� ���ø����̼��� ������ ��� ��ó�� ����� �ֽø� �˴ϴ�. 
 */
package net.javajigi.common.util;

/**
 * �ּ��� �־� �ּ���. �谡 ���Ŀ�.
 * 
 * @author ���缺(�ڹ�����, javajigi@gmail.com)
 */
public class HtmlUtil {
    /*
     * \r\n �� html�� <br>�� conver�Ѵ�
     */
    public static String convertHtmlBr(String comment) {
        // **********************************************************************
        if (comment == null)
            return "";
        int length = comment.length();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < length; i++) {
            String tmp = comment.substring(i, i + 1);
            if ("\r".compareTo(tmp) == 0) {
                tmp = comment.substring(++i, i + 1);
                if ("\n".compareTo(tmp) == 0)
                    buffer.append("<br>\r");
                else
                    buffer.append("\r");
            }
            buffer.append(tmp);
        }
        return buffer.toString();
    }
}