/**
 * 이 소스는 Spring 프레임워크 워크북에서 사용한 예제 소스입니다. 
 * 이 소스는 모든 개발자들이 자유롭게 수정 및 배포할 수 있습니다. 
 * 단, 이 소스를 기반으로 새로운 애플리케이션을 개발할 경우 출처를 명시해 주시면 됩니다. 
 */
package net.javajigi.user.dao;
 
/**
 * 주석을 넣어 주세요. 배가 고파요.
 * 
 * @author 박재성(자바지기, javajigi@gmail.com)
 */
public class DataAccessException extends RuntimeException {

    /**
     * 
     */
    public DataAccessException() {
        super();
    }

    /**
     * @param message
     */
    public DataAccessException(String message) {
        super(message);
    }

    /**
     * @param cause
     */
    public DataAccessException(Throwable cause) {
        super(cause);
    }

    /**
     * @param message
     * @param cause
     */
    public DataAccessException(String message, Throwable cause) {
        super(message, cause);
    }

}
