package com.mysite.beans;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BoardService {

	@Autowired
	private BoardMapper boardMapper;
	
	// ���� �޼��� ���� ��� 
	public void insertBoard(BoardBean boardBean) {
		boardMapper.insertBoard(boardBean);
	}
	
	// �۰���
	public int getTotalCnt() {
		int nCnt = 0; 
		nCnt = this.boardMapper.getTotalCnt();
		return nCnt;
	}
	
	// �۸��
	public ArrayList<BoardBean> getList(int nStartPage, int list_num) {
		return this.boardMapper.getList(nStartPage, list_num);
	}
	
	public BoardBean getSpecificRow (String id) {
		return this.boardMapper.getSpecificRow(id);
	}
}
