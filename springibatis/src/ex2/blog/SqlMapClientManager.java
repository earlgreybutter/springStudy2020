package ex2.blog;

import java.io.Reader;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class SqlMapClientManager {

	private static final SqlMapClient sqlMap;
	
	static {
		try {
			String resource = "ex2/blog/SqlMapClientManager.xml";
			Reader reader = Resources.getResourceAsReader(resource);
			sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	private SqlMapClientManager() {}
	
	public static SqlMapClient getSqlMapClient() {
		return sqlMap;
	}
}
