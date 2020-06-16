package guestbook.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import guestbook.service.GuestbookManager;
import guestbook.vo.GuestbookVo;

public class GuestbookController implements Controller {

	private GuestbookManager guestbookManager;
	private GuestbookVo guestbookVo;
	
	public GuestbookController() {
		// TODO Auto-generated constructor stub
		System.out.println("11111111111111111111111");
	}
	
	public void setGuestbookManager(GuestbookManager guestbookManager) {
		System.out.println("222222222222222222222222");
		this.guestbookManager = guestbookManager;
	}
	
	public void setGuestbookVo(GuestbookVo guestbookVo) {
		System.out.println("33333333333333333333333333");
		this.guestbookVo = guestbookVo;
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("444444444444444444444444444");
		
		String path = request.getRequestURI();
		System.out.println("path : " + path);
		
		String idx = "";
		if(request.getParameter("idx")!=null) {
			idx = request.getParameter("idx");
		}
		
		List contentsList = guestbookManager.getContents();
		return new ModelAndView("list", "contentsList", contentsList);
	}

}
