package net.javajigi.control;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import net.javajigi.user.model.User;
import net.javajigi.user.service.UserService;
import net.javajigi.user.service.UserServiceHelper;

public class MemberEditFormController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		// TODO Auto-generated method stub
		String userId = req.getParameter("userId");
		
		ServletContext ctx = req.getServletContext();
		UserService service = UserServiceHelper.getUserService(ctx);
		User user = service.findUser(userId);
		
		ModelAndView mav = new ModelAndView("user_modify");
		mav.addObject("user", user);
		return mav;
	}

}
