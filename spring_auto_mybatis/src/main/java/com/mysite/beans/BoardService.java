package com.mysite.beans;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BoardService {

	@Autowired
	private BoardMapper boardMapper;
	
	// 서비스 메서드 정의 기술 
	public void insertBoard(BoardBean boardBean) {
		boardMapper.insertBoard(boardBean);
	}
	
	// 글갯수
	public int getTotalCnt() {
		int nCnt = 0; 
		nCnt = this.boardMapper.getTotalCnt();
		return nCnt;
	}
	
	// 글목록
	public ArrayList<BoardBean> getList(int nStartPage, int list_num) {
		return this.boardMapper.getList(nStartPage, list_num);
	}
	
	public BoardBean getSpecificRow (String id) {
		return this.boardMapper.getSpecificRow(id);
	}
}
