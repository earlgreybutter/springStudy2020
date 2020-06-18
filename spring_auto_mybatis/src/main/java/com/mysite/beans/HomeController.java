package com.mysite.beans;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
// com.mysite.beans 아래 어노테이션이 붙은 클래스는 자동으로 빈으로 생성됩니다. 
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	// @RequestMapping 은 핸들러 매핑이 하던 역할을 대신합니다. 
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		// Model model 은 뷰에서 사용할 데이터를 저장한다 
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		// addAttribute() 뷰에서 사용할 데이터를 키:벨류 형태로 저장함 
		model.addAttribute("serverTime", formattedDate );
		// 뷰값을 리턴함 
		return "home";
	}
	
}
