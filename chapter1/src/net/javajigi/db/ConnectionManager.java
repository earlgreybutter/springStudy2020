/**
 * 이 소스는 Spring 프레임워크 워크북에서 사용한 예제 소스입니다. 
 * 이 소스는 모든 개발자들이 자유롭게 수정 및 배포할 수 있습니다. 
 * 단, 이 소스를 기반으로 새로운 애플리케이션을 개발할 경우 출처를 명시해 주시면 됩니다. 
 */
package net.javajigi.db;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ConnectionManager {
    protected static final Log logger = LogFactory
            .getLog(ConnectionManager.class);

    public static Connection getConnection() {
        try {
            Context ctx = new InitialContext();
            // Tomcat Server에서 DataSource를 Lookup
            DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/SpringDS");
           
            // JBoss Server에서 DataSource를 Lookup
            //DataSource ds = (DataSource) ctx.lookup("java:/jdbc/SpringDS");            

            return ds.getConnection();
        } catch (NamingException e) {
            if (logger.isErrorEnabled()) {
                logger.error(e.getMessage(), e);
            }

            throw new DBNotConnectedException(e.getMessage(), e);
        } catch (SQLException e) {
            if (logger.isErrorEnabled()) {
                logger.error(e.getMessage(), e);
            }
            
            throw new DBNotConnectedException(e.getMessage(), e);
        }
    }
}