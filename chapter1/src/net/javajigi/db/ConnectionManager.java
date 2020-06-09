/**
 * �� �ҽ��� Spring �����ӿ�ũ ��ũ�Ͽ��� ����� ���� �ҽ��Դϴ�. 
 * �� �ҽ��� ��� �����ڵ��� �����Ӱ� ���� �� ������ �� �ֽ��ϴ�. 
 * ��, �� �ҽ��� ������� ���ο� ���ø����̼��� ������ ��� ��ó�� ����� �ֽø� �˴ϴ�. 
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
            // Tomcat Server���� DataSource�� Lookup
            DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/SpringDS");
           
            // JBoss Server���� DataSource�� Lookup
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