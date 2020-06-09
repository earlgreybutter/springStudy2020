/**
 * 이 소스는 Spring 프레임워크 워크북에서 사용한 예제 소스입니다. 
 * 이 소스는 모든 개발자들이 자유롭게 수정 및 배포할 수 있습니다. 
 * 단, 이 소스를 기반으로 새로운 애플리케이션을 개발할 경우 출처를 명시해 주시면 됩니다. 
 */
package net.javajigi.common.util;

import java.util.Properties;

import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 주석을 넣어 주세요. 배가 고파요.
 * 
 * @author 박재성(자바지기, javajigi@gmail.com)
 */
public class MailUtil {
    protected static final Log logger = LogFactory.getLog(MailUtil.class);

    private static final String DEFAULT_EMAIL_HOST = "localhost";

    private static final String SEND_EMAIL_ADDRESS = "javajigi@javajigi.net";

    private static final String RECEIVE_EMAIL_ADDRESS = "javajigi@gmail.com";

    public static void sendHtmlMessage(String subject, String content) {
        sendHtmlMessage(DEFAULT_EMAIL_HOST, SEND_EMAIL_ADDRESS,
                RECEIVE_EMAIL_ADDRESS, subject, content);
    }

    /**
     * host : smtp 서버주소 from : 보내는 사람 email to : 받는 사람 email subject : 제목
     * content : 본문내용
     */
    public static void sendHtmlMessage(String host, String from, String to,
            String subject, String content) {
        // Get system properties
        Properties props = System.getProperties();
        // Setup mail server
        props.put("mail.smtp.host", host);
        // Get session
        Session session = Session.getDefaultInstance(props, null);

        // Create the message
        Message message = new MimeMessage(session);

        // Fill its headers
        try {
            System.out.println("subject : " + subject);
            message.setSubject(subject);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(
                    to));

            // Create your new message part
            BodyPart messageBodyPart = new MimeBodyPart();
            String htmlText = HanUtil.ascToKsc(content);
            messageBodyPart.setContent(htmlText, "text/html");

            // Create a related multi-part to combine the parts
            MimeMultipart multipart = new MimeMultipart("related");
            multipart.addBodyPart(messageBodyPart);

            // Associate multi-part with message
            message.setContent(multipart);

            Transport.send(message);
        } catch (MessagingException e) {
            if (logger.isErrorEnabled()) {
                logger.error(e.getMessage(), e);
            }
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
