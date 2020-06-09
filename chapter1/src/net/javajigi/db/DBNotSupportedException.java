/**
 * 이 소스는 Spring 프레임워크 워크북에서 사용한 예제 소스입니다. 
 * 이 소스는 모든 개발자들이 자유롭게 수정 및 배포할 수 있습니다. 
 * 단, 이 소스를 기반으로 새로운 애플리케이션을 개발할 경우 출처를 명시해 주시면 됩니다. 
 */
package net.javajigi.db;

/**
 * 주석을 넣어 주세요. 배가 고파요.
 * 
 * @author 박재성(자바지기, javajigi@gmail.com)
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
