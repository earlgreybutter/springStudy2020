/**
 * �� �ҽ��� Spring �����ӿ�ũ ��ũ�Ͽ��� ����� ���� �ҽ��Դϴ�. 
 * �� �ҽ��� ��� �����ڵ��� �����Ӱ� ���� �� ������ �� �ֽ��ϴ�. 
 * ��, �� �ҽ��� ������� ���ο� ���ø����̼��� ������ ��� ��ó�� ����� �ֽø� �˴ϴ�. 
 */
package net.javajigi.common.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * �ּ��� �־� �ּ���. �谡 ���Ŀ�.
 * 
 * @author ���缺(�ڹ�����, javajigi@gmail.com)
 */
public class StringUtil {

    public static String stackTraceToString(Throwable ex) {
        ByteArrayOutputStream b = new ByteArrayOutputStream();
        PrintStream p = new PrintStream(b);
        ex.printStackTrace(p);
        p.close();
        String stackTrace = b.toString();
        try {
            b.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        return HtmlUtil.convertHtmlBr(stackTrace);
    }
}
