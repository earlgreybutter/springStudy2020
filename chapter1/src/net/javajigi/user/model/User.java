/**
 * �� �ҽ��� Spring �����ӿ�ũ ��ũ�Ͽ��� ����� ���� �ҽ��Դϴ�. 
 * �� �ҽ��� ��� �����ڵ��� �����Ӱ� ���� �� ������ �� �ֽ��ϴ�. 
 * ��, �� �ҽ��� ������� ���ο� ���ø����̼��� ������ ��� ��ó�� ����� �ֽø� �˴ϴ�. 
 */
package net.javajigi.user.model;

/**
 * ����� ������ ���Ͽ� �ʿ��� ������ Ŭ����. 
 * USERINFO ���̺��� �� Į���� �ش��ϴ� setter�� getter�� ������.
 * 
 * @author ���缺(�ڹ����� - javajigi@gmail.com)
 */
public class User extends BaseObject {
    private String userId = null;

    private String password = null;

    private String name = null;

    private String email = null;
    
    private boolean isAdmin = false;

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * ��й�ȣ�� ��ġ�ϴ��� ���θ� �����ϴ� �޽��.
     */
    public boolean isMatchPassword(String inputPassword) {
        if (getPassword().equals(inputPassword)) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("[\n");
        sb.append("userId=");
        sb.append(getUserId());
        sb.append("\n");
        sb.append("name=");
        sb.append(getName());
        sb.append("\n");
        sb.append("email=");
        sb.append(getEmail());
        sb.append("\n");
        sb.append("]\n");

        return sb.toString();
    }
}
