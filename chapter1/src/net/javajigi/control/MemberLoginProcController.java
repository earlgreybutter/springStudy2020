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
			//�𵨿� �α��� �۾��� �����Ѵ�.
			UserService service = UserServiceHelper.getUserService(ctx);
			service.login(userId, password);

			User user = service.findUser(userId);
			
			//���������� �α��� �Ǿ��� ��� ���ǿ� ����� ���̵� ����.
			
			HttpSession session = req.getSession();
			session.setAttribute("user", user); // user�� ���� ������ user��� �̸����� session������ ����

		
		
			mav = new ModelAndView("login_action");
			mav.addObject("admin", user.isAdmin());

			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		return mav;
	}

}
