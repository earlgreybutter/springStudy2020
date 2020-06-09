/**
 * 이 소스는 Spring 프레임워크 워크북에서 사용한 예제 소스입니다. 
 * 이 소스는 모든 개발자들이 자유롭게 수정 및 배포할 수 있습니다. 
 * 단, 이 소스를 기반으로 새로운 애플리케이션을 개발할 경우 출처를 명시해 주시면 됩니다. 
 */
package net.javajigi.user.dao;

import java.util.List;

import net.javajigi.user.model.User;

/**
 * 사용자 관리에서 데이터베이스와의 작업을 전담하는 클래스.
 * UserInfo 테이블에 사용자를 추가, 수정, 삭제, 검색등의 작업을 한다. 
 * 
 * @author 박재성(자바지기 - javajigi@gmail.com)
 */
public interface UserDAO {
	/**
	 * 사용자 관리 테이블에 새로운 사용자 생성.
	 */
	public int insert(User user) throws DataAccessException;

	/**
	 * 기존의 사용자 사용자 정보를 수정.
	 */
	public int update(User user) throws DataAccessException;
	
	/**
	 * 사용자 아이디에 해당하는 사용자를 삭제.
	 */
	public int delete(String userId) throws DataAccessException;
	
	/**
	 * 사용자 아이디 정보를 데이터베이스에서 찾아 User 도메인 클래스에 
	 * 저장하여 반환.
	 */
	public User findUser(String userId) throws DataAccessException;
	
	/**
	 * 사용자 리스트를 만들기 위한 부분으로 현재 페이지와 
	 * 페이지당 카운트수를 이용하여 해당부분의 사용자만을 List콜렉션에
	 * 저장하여 반환.
	 */
	public List findUserList() throws DataAccessException;
	
	/**
	 * 인자로 전달되는 아이디를 가지는 사용자가 존재하는지의 
	 * 유무를 판별. 
	 */
	public boolean existedUser(String userId) throws DataAccessException;
	
}
