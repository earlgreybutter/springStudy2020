package guestbook.dao;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import guestbook.vo.GuestbookVo;

public class GuestbookDaoImpl extends SqlMapClientDaoSupport implements GuestbookDao {

	@Override
	public List getContents() {
		// TODO Auto-generated method stub
		return (List)getSqlMapClientTemplate().queryForList("getContents");
	}

	@Override
	public GuestbookVo getContent(String idx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int setContent(GuestbookVo guestbookVo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateContent(GuestbookVo guestbookVo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteContent(String no) {
		// TODO Auto-generated method stub
		return 0;
	}

}
