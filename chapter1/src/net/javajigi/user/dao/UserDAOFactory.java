/**
 * �� �ҽ��� Spring �����ӿ�ũ ��ũ�Ͽ��� ����� ���� �ҽ��Դϴ�. 
 * �� �ҽ��� ��� �����ڵ��� �����Ӱ� ���� �� ������ �� �ֽ��ϴ�. 
 * ��, �� �ҽ��� ������� ���ο� ���ø����̼��� ������ ��� ��ó�� ����� �ֽø� �˴ϴ�. 
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
                logger.error("���� ���� ������ �����ͺ��̽��� MySQL �����ͺ��̽� �Դϴ�."
                        + "�̿��� �����ͺ��̽��� �������� �ʽ��ϴ�.");
            }

            throw new DBNotSupportedException(
                    "���� ���� ������ �����ͺ��̽��� MySQL �����ͺ��̽� �Դϴ�."
                            + "�̿��� �����ͺ��̽��� �������� �ʽ��ϴ�.");
        }
    }
}
