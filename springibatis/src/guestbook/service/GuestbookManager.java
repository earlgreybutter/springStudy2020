package guestbook.service;

import java.util.List;

import guestbook.vo.GuestbookVo;

public interface GuestbookManager {

	public List getContents();
	
	public GuestbookVo getContent(String idx);
	
	public int setContent(GuestbookVo guestbookVo);
	
	public int updateContent(GuestbookVo guestbookVo);
	
	public int deleteContent(String idx);
}
