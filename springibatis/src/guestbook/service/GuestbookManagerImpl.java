package guestbook.service;

import java.util.List;

import guestbook.dao.GuestbookDao;
import guestbook.vo.GuestbookVo;

public class GuestbookManagerImpl implements GuestbookManager {

	GuestbookDao guestbookDao;
	
	public void setGuestbookDao(GuestbookDao guestbookDao) {
		this.guestbookDao = guestbookDao;
	}
	
	@Override
	public List getContents() {
		// TODO Auto-generated method stub
		return guestbookDao.getContents();
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
	public int deleteContent(String idx) {
		// TODO Auto-generated method stub
		return 0;
	}

}
