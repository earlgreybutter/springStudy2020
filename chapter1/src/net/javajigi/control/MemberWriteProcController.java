package net.javajigi.control;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import net.javajigi.user.model.User;
import net.javajigi.user.service.UserService;
import net.javajigi.user.service.UserServiceHelper;

public class MemberWriteProcController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		// TODO Auto-generated method stub
		
		String userId = req.getParameter("userId");
		String password = req.getParameter("password");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String admin = req.getParameter("admin");
		
		User user = new User();
		user.setUserId(userId);
		user.setPassword(password);
		user.setName(name);
		user.setEmail(email);
		if ( (admin!=null) && (admin.length()>0) ) {
			user.setAdmin(new Boolean(admin).booleanValue());
		}
		
		ServletContext ctx = req.getServletContext();
		
		UserService service = UserServiceHelper.getUserService(ctx);
		service.addUser(user);

		
		String url = "user_write_action";
		// user.isAdmin();
		ModelAndView mav = new ModelAndView(url);
		mav.addObject("result", user.isAdmin());
		return mav;
		
	}

}
