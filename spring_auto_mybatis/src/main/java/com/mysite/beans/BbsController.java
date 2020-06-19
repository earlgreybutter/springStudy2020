package com.mysite.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BbsController {

	@Autowired
	BoardService boardService;
	
	private static final Logger logger = LoggerFactory.getLogger(BbsController.class);
	
	// 여기에 @를 이용한 컨트롤 매핑 기술이 들어감 
	@RequestMapping(value = "/show_write_form.do", method = {RequestMethod.GET})
	public String show_write_form(Model model) {
		
		logger.info("show_write_form called!!");
		// 객제를 전달해서 값을 얻어와야 함 
		model.addAttribute("boardBeanObjToWrite", new BoardBean());
		
		return "board/writeBoard";
	}
	
	@RequestMapping(value = "/DoWriteBoard.do", method = {RequestMethod.POST})
	public String DoWriteBoard(BoardBean boardBeanObjToWrite, Model model) {
		
		logger.info("DoWriteBoard called!!");
		logger.info("memo = ["+ boardBeanObjToWrite.getMemo() +"]");
		boardService.insertBoard(boardBeanObjToWrite);
		
		model.addAttribute("totalCnt", new Integer(boardService.getTotalCnt()));
		model.addAttribute("current_page", "1");
		model.addAttribute("boardList", boardService.getList(1, 2));
		
		return "board/listSpecificPage";
	}
	
	@RequestMapping(value = "/listSpecificPageWork.do", method = RequestMethod.GET)
	public String listSpecificPageWork(@RequestParam("current_page") String pageForView, Model model)
	{
		System.out.println("-----------------------------");
		logger.info("listSpecificPageWork called!!");
		logger.info("current_page=[" + pageForView + "]");
		model.addAttribute("totalCnt", new Integer(boardService.getTotalCnt()));
		model.addAttribute("current_page", pageForView);
		model.addAttribute("boardList", boardService.getList(Integer.parseInt(pageForView), 2)); 
		System.out.println("---------------------------------listSpecificPage");
		
		return "board/listSpecificPage";
	}
	
	// 개별 목록 조회 
	@RequestMapping(value = "/viewWork.do", method = RequestMethod.GET)
	public String viewWork(
				@RequestParam("memo_id") String memo_id,
				@RequestParam("current_page") String current_page,
				@RequestParam("searchStr") String searchStr,
				Model model
 			)
	{
		logger.info("viewWork called!!");
		logger.info("memo id = [ " + memo_id + " ]  current_page = [ " + current_page + " ]  searchStr = [ " + searchStr + " ]");
		
		model.addAttribute("memo_id", memo_id);
		model.addAttribute("current_page", current_page);
		model.addAttribute("searchStr", searchStr);
		model.addAttribute("boardData", boardService.getSpecificRow(memo_id));
		
		return "board/viewMemo";
	}
	
}
