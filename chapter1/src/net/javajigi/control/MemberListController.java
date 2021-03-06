package net.javajigi.control;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import net.javajigi.user.service.UserService;
import net.javajigi.user.service.UserServiceHelper;

public class MemberListController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		// TODO Auto-generated method stub
		
		// 받는다 
		
		ServletContext ctx = req.getServletContext();
		// application은 servletcontext로 만든 것 
		
		// 핵심 처리
		UserService service = UserServiceHelper.getUserService(ctx);
		List userList = service.findUserList();
		
		
		ModelAndView mav = new ModelAndView("user_list");
		mav.addObject("userList", userList); // 이부분을 뷰에서 el과 jstl로 작업   
		return mav;
	}

}
