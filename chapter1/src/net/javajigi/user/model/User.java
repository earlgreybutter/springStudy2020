/**
 * 이 소스는 Spring 프레임워크 워크북에서 사용한 예제 소스입니다. 
 * 이 소스는 모든 개발자들이 자유롭게 수정 및 배포할 수 있습니다. 
 * 단, 이 소스를 기반으로 새로운 애플리케이션을 개발할 경우 출처를 명시해 주시면 됩니다. 
 */
package net.javajigi.user.model;

/**
 * 사용자 관리를 위하여 필요한 도메인 클래스. 
 * USERINFO 테이블의 각 칼럼에 해당하는 setter와 getter를 가진다.
 * 
 * @author 박재성(자바지기 - javajigi@gmail.com)
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
     * 비밀번호가 일치하는지 여부를 결정하는 메써드.
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
