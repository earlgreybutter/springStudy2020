package com.mysite.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PageNumberingManager {

	private static final PageNumberingManager pageNumberingManager = new PageNumberingManager();
	
	private static final Logger logger = LoggerFactory.getLogger(PageNumberingManager.class);
	
	private PageNumberingManager() {
		// TODO Auto-generated constructor stub
	}
	
	public static PageNumberingManager getInstance() {
		return pageNumberingManager;
	}
	
	public int getTotalPage(int total_cnt, int rowsPerPage) {
		
		logger.info("getTotalPage called!!");
		int total_pages = 0;
		
		if((total_cnt%rowsPerPage)==0) {
			total_pages = total_cnt/rowsPerPage;
		}
		else {
			total_pages = (total_cnt/rowsPerPage)+1;
		}
		
		return total_pages;
	}
	
	// 게시판의 block 처리 추가 필요 ( 이전 / 다음 블럭 버튼 처리 )
	public int getPageBlock(int curPage, int pagePerBlock) {
		int block = 0;
		
		if((curPage%pagePerBlock)==0) {
			block = curPage/pagePerBlock;
		}
		else {
			block = (curPage/pagePerBlock) + 1;
		}
		
		return block;
	}
	
	// block에 속한 첫번째 페이지 계산 
	public int getFirstPageInBlock(int block, int pagePerBlock) {
		return (block*pagePerBlock);
	}
}
