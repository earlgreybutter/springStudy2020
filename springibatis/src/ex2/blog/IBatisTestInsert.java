package ex2.blog;

import com.ibatis.sqlmap.client.SqlMapClient;

public class IBatisTestInsert {
	
	private static SqlMapClient sqlMap = SqlMapClientManager.getSqlMapClient();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			BlogUser paramBlogUser = new BlogUser();
			
			paramBlogUser.setUserID("kkjae");
			paramBlogUser.setUserName("�����");
			paramBlogUser.setRole("user");
			paramBlogUser.setPassword("kkjae");
			
			sqlMap.insert("BlogUser.regUser", paramBlogUser);
			
			System.out.println("---------------------------");
			System.out.println("������ �Է¿Ϸ�");
			System.out.println("---------------------------");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
