/**
 * �� �ҽ��� Spring �����ӿ�ũ ��ũ�Ͽ��� ����� ���� �ҽ��Դϴ�. 
 * �� �ҽ��� ��� �����ڵ��� �����Ӱ� ���� �� ������ �� �ֽ��ϴ�. 
 * ��, �� �ҽ��� ������� ���ο� ���ø����̼��� ������ ��� ��ó�� ����� �ֽø� �˴ϴ�. 
 */
package net.javajigi.user.dao;

import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.dbcp.BasicDataSource;

import net.javajigi.db.ConnectionManager;
import net.javajigi.user.model.User;

public class MySQLUserDAO implements UserDAO {
    protected static final Log logger = LogFactory.getLog(MySQLUserDAO.class);
    
    /*
     * (non-Javadoc)
     * 
     * @see net.javajigi.user.dao.UserDAO#create(net.javajigi.user.model.User)
     */
    private DataSource dataSource = null;
    
    public void setDataSource(DataSource dataSource) {
    	this.dataSource = dataSource ;
    }
    
    public int insert(User user) throws DataAccessException {
    	if( logger.isDebugEnabled() ) {
    		logger.debug("insert() ����");
    		logger.debug("User : " + user);
    	}
        
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            StringBuffer insertQuery = new StringBuffer();
            insertQuery.append("INSERT INTO USERINFO VALUES ");
            insertQuery.append("(?, ?, ?, ?, ?)");

            con = dataSource.getConnection();
            pstmt = con.prepareStatement(insertQuery.toString());
            pstmt.setString(1, user.getUserId());
            pstmt.setString(2, user.getPassword());
            pstmt.setString(3, user.getName());
            pstmt.setString(4, user.getEmail());
            pstmt.setBoolean(5, user.isAdmin());

            int result = pstmt.executeUpdate();
            
        	if( logger.isDebugEnabled() ) {
        		logger.debug("insert() ����");
        	}            

            return result;
        } catch (SQLException e) {
            throw new DataAccessException(e.getMessage(), e);
        } finally {
            close(con, pstmt);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see net.javajigi.user.dao.UserDAO#update(net.javajigi.user.model.User)
     */
    public int update(User user) throws DataAccessException{
    	if( logger.isDebugEnabled() ) {
    		logger.debug("update() ����");
    		logger.debug("User : " + user);
    	}       
        
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            StringBuffer updateQuery = new StringBuffer();
            updateQuery.append("UPDATE USERINFO SET ");
            updateQuery.append("password=?, name=?, email=?, adminYN=? ");
            updateQuery.append("WHERE userid=? ");

            con = ConnectionManager.getConnection();
            pstmt = con.prepareStatement(updateQuery.toString());
            pstmt.setString(1, user.getPassword());
            pstmt.setString(2, user.getName() );
            pstmt.setString(3, user.getEmail());
            pstmt.setBoolean(4, user.isAdmin());
            pstmt.setString(5, user.getUserId());

            int result = pstmt.executeUpdate();

        	if( logger.isDebugEnabled() ) {
        		logger.debug("update() ����");
        	} 
            
            return result;
        } catch (SQLException e) {
            throw new DataAccessException(e.getMessage(), e);
        } finally {
            close(con, pstmt);
        }
		
    }

    /*
     * (non-Javadoc)
     * 
     * @see net.javajigi.user.dao.UserDAO#remove(java.lang.String)
     */
    public int delete(String userId) throws DataAccessException {
    	if( logger.isDebugEnabled() ) {
    		logger.debug("delete() ����");
    		logger.debug("User ID : " + userId);
    	}        
        
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            StringBuffer removeQuery = new StringBuffer();
            removeQuery.append("DELETE FROM USERINFO ");
            removeQuery.append("WHERE userid=? ");

            con = ConnectionManager.getConnection();
            pstmt = con.prepareStatement(removeQuery.toString());
            pstmt.setString(1, userId);

            int result = pstmt.executeUpdate();
            
        	if( logger.isDebugEnabled() ) {
        		logger.debug("delete() ����");
        	}            

            return result;
        } catch (SQLException e) {
            throw new DataAccessException(e.getMessage(), e);
        } finally {
            close(con, pstmt);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see net.javajigi.user.dao.UserDAO#findUser(java.lang.String)
     */
    public User findUser(String userId) throws DataAccessException {
    	if( logger.isDebugEnabled() ) {
    		logger.debug("findUser() ����");
    		logger.debug("User ID : " + userId);
    	}        
        
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            StringBuffer findQuery = new StringBuffer();
            findQuery.append("SELECT ");
            findQuery.append("password, name, email, adminYN ");
            findQuery.append("FROM USERINFO ");
            findQuery.append("WHERE userid=? ");

            con = ConnectionManager.getConnection();
            pstmt = con.prepareStatement(findQuery.toString());
            pstmt.setString(1, userId);

            rs = pstmt.executeQuery();

            User user = null;
            if (rs.next()) {
                user = new User();

                user.setUserId(userId);
                user.setPassword(rs.getString("password"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setAdmin(rs.getBoolean("adminYN"));
            }
            
        	if( logger.isDebugEnabled() ) {
        		logger.debug("findUser() ����");
        	}            

            return user;
        } catch (SQLException e) {
            throw new DataAccessException(e.getMessage(), e);
        } finally {
            close(con, pstmt, rs);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see net.javajigi.user.dao.UserDAO#findUserList()
     */
    public List findUserList() throws DataAccessException {
    	if( logger.isDebugEnabled() ) {
    		logger.debug("findUserList() ����");
    	}       
        
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            StringBuffer findQuery = new StringBuffer();
            findQuery.append("SELECT ");
            findQuery.append("userid, name, email, adminYN ");
            findQuery.append("FROM USERINFO");

            con = ConnectionManager.getConnection();
            pstmt = con.prepareStatement(findQuery.toString(),
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);

            rs = pstmt.executeQuery();

            List userList = new ArrayList();

            while (rs.next()) {
                User user = new User();
                user.setUserId(rs.getString("userid"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setAdmin(rs.getBoolean("adminYN"));

                userList.add(user);
            }
            
        	if( logger.isDebugEnabled() ) {
        		logger.debug("findUserList() ����");
        	}            

            return userList;
        } catch (SQLException e) {
            throw new DataAccessException(e.getMessage(), e);
        } finally {
            close(con, pstmt, rs);
        }

    }

    /*
     * (non-Javadoc)
     * 
     * @see net.javajigi.user.dao.UserDAO#existedUser(java.lang.String)
     */
    public boolean existedUser(String userId) throws DataAccessException {
    	if( logger.isDebugEnabled() ) {
    		logger.debug("existedUser() ����");
    		logger.debug("User ID : " + userId);
    	}        
        
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            StringBuffer existedQuery = new StringBuffer();
            existedQuery.append("SELECT count(*) FROM USERINFO ");
            existedQuery.append("WHERE userid=? ");

            con = ConnectionManager.getConnection();
            pstmt = con.prepareStatement(existedQuery.toString());
            pstmt.setString(1, userId);

            rs = pstmt.executeQuery();

            int count = 0;
            if (rs.next()) {
                count = rs.getInt(1);
            }
            
        	if( logger.isDebugEnabled() ) {
        		logger.debug("existedUser() ����");
        	}            

            if (count == 1) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            throw new DataAccessException(e.getMessage(), e);
        } finally {
            close(con, pstmt, rs);
        }
    }

    private void close(Connection con, PreparedStatement pstmt)
            throws DataAccessException {
        close(con, pstmt, null);
    }

    private void close(Connection con, PreparedStatement pstmt, ResultSet rs)
            throws DataAccessException {
        try {
            if (rs != null) {
                rs.close();
            }

            if (pstmt != null) {
                pstmt.close();
            }

            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            throw new DataAccessException(e.getMessage(), e);
        }
    }
}
