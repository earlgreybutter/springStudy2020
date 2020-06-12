package net.javajigi.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import net.javajigi.user.model.User;

public class MemberWriteController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		// TODO Auto-generated method stub
		
		User user = (User)req.getSession().getAttribute("user");
		
		boolean isAdmin =false;
		if( (user!=null) && (user.isAdmin()) ) {
			isAdmin = true;
		}
		
		ModelAndView mav = new ModelAndView("user_write");
		mav.addObject("admin", isAdmin);
		return mav;
	}

}
