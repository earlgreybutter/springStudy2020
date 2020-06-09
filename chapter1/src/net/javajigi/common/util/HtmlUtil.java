/**
 * 이 소스는 Spring 프레임워크 워크북에서 사용한 예제 소스입니다. 
 * 이 소스는 모든 개발자들이 자유롭게 수정 및 배포할 수 있습니다. 
 * 단, 이 소스를 기반으로 새로운 애플리케이션을 개발할 경우 출처를 명시해 주시면 됩니다. 
 */
package net.javajigi.common.util;

/**
 * 주석을 넣어 주세요. 배가 고파요.
 * 
 * @author 박재성(자바지기, javajigi@gmail.com)
 */
public class HtmlUtil {
    /*
     * \r\n 을 html의 <br>로 conver한다
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