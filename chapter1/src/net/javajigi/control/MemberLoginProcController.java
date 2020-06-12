package net.javajigi.control;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import net.javajigi.user.model.User;
import net.javajigi.user.service.UserService;
import net.javajigi.user.service.UserServiceHelper;

public class MemberLoginProcController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mav = null;
		
		try {
			String userId = req.getParameter("userId");
			String password = req.getParameter("password");
			
			ServletContext ctx = req.getServletContext();
			//모델에 로그인 작업을 위임한다.
			UserService service = UserServiceHelper.getUserService(ctx);
			service.login(userId, password);

			User user = service.findUser(userId);
			
			//정상적으로 로그인 되었을 경우 세션에 사용자 아이디 저장.
			
			HttpSession session = req.getSession();
			session.setAttribute("user", user); // user에 대한 정보를 user라는 이름으로 session영역에 저장

		
		
			mav = new ModelAndView("login_action");
			mav.addObject("admin", user.isAdmin());

			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		return mav;
	}

}
