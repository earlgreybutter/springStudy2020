package ex2.blog;

import java.util.Iterator;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

public class iBatisTestDelete {

	private static SqlMapClient sqlMap = SqlMapClientManager.getSqlMapClient();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			BlogUser paramBlogUser = new BlogUser();
			BlogUser returnBlogUser = null;
			
			paramBlogUser.setUserID("kkjae");
			sqlMap.update("BlogUser.delUser", paramBlogUser);
			
			System.out.println("----------------------------");
			System.out.println("삭제가 되었습니다. ");
			System.out.println("----------------------------");
			
			List list = sqlMap.queryForList("BlogUser.getBlogUserAll", paramBlogUser);
			Iterator it = list.iterator();
			
			while(it.hasNext()) {
				returnBlogUser = (BlogUser)it.next();
				
				System.out.println("UserID = " + returnBlogUser.getUserID());
				System.out.println("UserName = " + returnBlogUser.getUserName());
				System.out.println("Role = " + returnBlogUser.getRole());
				
				System.out.println("=========================\n");
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
