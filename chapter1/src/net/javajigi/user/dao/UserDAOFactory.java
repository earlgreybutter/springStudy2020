/**
 * 이 소스는 Spring 프레임워크 워크북에서 사용한 예제 소스입니다. 
 * 이 소스는 모든 개발자들이 자유롭게 수정 및 배포할 수 있습니다. 
 * 단, 이 소스를 기반으로 새로운 애플리케이션을 개발할 경우 출처를 명시해 주시면 됩니다. 
 */
package net.javajigi.user.dao;

import net.javajigi.db.DBNotSupportedException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class UserDAOFactory {
    protected static final Log logger = LogFactory.getLog(UserDAOFactory.class);

    public static int MYSQL_DB = 0;

    private UserDAOFactory() {
    }

    public static UserDAO getUserDAO(int useDB) {
        if (useDB == MYSQL_DB) {
            return new MySQLUserDAO();
        } else {
            if (logger.isErrorEnabled()) {
                logger.error("현재 지원 가능한 데이터베이스는 MySQL 데이터베이스 입니다."
                        + "이외의 데이터베이스는 지원하지 않습니다.");
            }

            throw new DBNotSupportedException(
                    "현재 지원 가능한 데이터베이스는 MySQL 데이터베이스 입니다."
                            + "이외의 데이터베이스는 지원하지 않습니다.");
        }
    }
}
