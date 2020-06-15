package ex1;

import java.io.Reader;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import ex1.vo.Employee;

public class EmployeeTest {

	public static Reader reader;
	public static SqlMapClient sqlMapper;
	
	static {
		try {
			reader = Resources.getResourceAsReader("ex1/sqlMapConfig.xml");
			sqlMapper = SqlMapClientBuilder.buildSqlMapClient(reader);
			reader.close();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static List<Employee> getSearchJob(String n) throws Exception {
		return sqlMapper.queryForList("searchJob",n);
	}
	
	public static void main(String[] args) throws Exception {
		List<Employee> list = getSearchJob("ANALYST");
		for(Employee e : list)
			System.out.println(e.getEmpno());
	}
	
}
