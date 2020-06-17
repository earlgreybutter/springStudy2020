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
		request.setCharacterEncoding("EUC-KR");
		// TODO Auto-generated method stub
		System.out.println("444444444444444444444444444");
		
		String path = request.getRequestURI();
		System.out.println("path : " + path);
		
		String idx = "";
		if(request.getParameter("idx")!=null) {
			idx = request.getParameter("idx");
		}
		
		// 경로 분석 로직, 매니저 메소도 호출 추가 
		
		
		if(path.equals("/springibatis/create.guest")) {	// 글넣기
			guestbookVo.setName(request.getParameter("name"));
			guestbookVo.setSubject(request.getParameter("subject"));
			guestbookVo.setContent(request.getParameter("content"));
			guestbookVo.setWrite_date(request.getParameter("write_date"));
			
			int result = guestbookManager.setContent(guestbookVo);
			return new ModelAndView("create", "result", result);
		}
		
		if(path.equals("/springibatis/read.guest")) {
			GuestbookVo guestbookVo = guestbookManager.getContent(idx);
			return new ModelAndView("read", "getContent", guestbookVo);
		}
		
		if(path.equals("/springibatis/edit.guest")) {
			GuestbookVo guestbookVo = guestbookManager.getContent(idx);
			return new ModelAndView("edit", "getContent", guestbookVo);
		}
		
		if(path.equals("/springibatis/update.guest")) {
			guestbookVo.setIdx(Integer.parseInt(request.getParameter("idx")));
			guestbookVo.setName(request.getParameter("name"));
			guestbookVo.setSubject(request.getParameter("subject"));
			guestbookVo.setContent(request.getParameter("content"));
			guestbookVo.setWrite_date(request.getParameter("write_date"));
			
			int result = guestbookManager.updateContent(guestbookVo);
			return new ModelAndView("update", "updateContent", result);
		}
		
		if(path.equals("/springibatis/delete.guest")) {	// 삭제하기
			// 암호 비교 후
			int result = guestbookManager.deleteContent(idx);
			return new ModelAndView("delete", "result", result);
		}
		
		// 기본동작 아래에 위치
		List contentsList = guestbookManager.getContents();
		return new ModelAndView("list", "contentsList", contentsList);
	}

}
