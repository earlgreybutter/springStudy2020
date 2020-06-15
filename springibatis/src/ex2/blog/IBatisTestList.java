package ex2.blog;

import java.util.Iterator;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

public class IBatisTestList {

	private static SqlMapClient sqlMap = SqlMapClientManager.getSqlMapClient();
	
	public static void main(String args[]) {
		try {
			System.out.println("-------------------------------");
			System.out.println("initial");
			System.out.println("-------------------------------");
			
			BlogUser returnBlogUser = null;
			
			List list = sqlMap.queryForList("BlogUser.getBlogUserAll");
			Iterator it = list.iterator();
			
			while(it.hasNext()) {
				returnBlogUser = (BlogUser)it.next();
				
				System.out.println("UserID = " + returnBlogUser.getUserID());
				System.out.println("UserName = " + returnBlogUser.getUserName());
				System.out.println("Role = " + returnBlogUser.getRole());
				
				System.out.println("=======================\n");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
