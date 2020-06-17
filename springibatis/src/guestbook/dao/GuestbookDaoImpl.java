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

	//Read
	@Override
	public GuestbookVo getContent(String idx) {
		// TODO Auto-generated method stub
		return (GuestbookVo)getSqlMapClientTemplate().queryForObject("getContent", idx);
	}

	@Override
	public int setContent(GuestbookVo guestbookVo) {
		// TODO Auto-generated method stub
		return getSqlMapClientTemplate().delete("setContent", guestbookVo);
	}

	@Override
	public int updateContent(GuestbookVo guestbookVo) {
		// TODO Auto-generated method stub
		return getSqlMapClientTemplate().update("updateContent", guestbookVo);
	}

	@Override
	public int deleteContent(String idx) {
		// TODO Auto-generated method stub
		return getSqlMapClientTemplate().delete("deleteContent", idx);
	}

}
