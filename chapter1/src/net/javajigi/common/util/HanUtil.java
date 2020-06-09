/**
 * �� �ҽ��� Spring �����ӿ�ũ ��ũ�Ͽ��� ����� ���� �ҽ��Դϴ�. 
 * �� �ҽ��� ��� �����ڵ��� �����Ӱ� ���� �� ������ �� �ֽ��ϴ�. 
 * ��, �� �ҽ��� ������� ���ο� ���ø����̼��� ������ ��� ��ó�� ����� �ֽø� �˴ϴ�. 
 */
package net.javajigi.common.util;

import java.io.UnsupportedEncodingException;

/**
 * �ּ��� �־� �ּ���. �谡 ���Ŀ�.
 * 
 * @author ���缺(�ڹ�����, javajigi@gmail.com)
 */
public class HanUtil {

    public static String ascToKsc(String value) {
        try {
            String strRet = new String(value.getBytes("8859_1"), "UTF-8");
            return strRet;
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }

    public static String kscToAsc(String value) {
        try {
            String strRet = new String(value.getBytes("KSC5601"), "8859_1");
            return strRet;
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

            return null;
        }
    }
}
