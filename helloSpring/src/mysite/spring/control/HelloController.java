package mysite.spring.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView("hello"); // 뷰 이름 
		
		mav.addObject("hello", "안녕하세요. 저는 너굴맨입니다. "); // 뷰에서 사용할 데이터
		
		return mav;
	}

}
