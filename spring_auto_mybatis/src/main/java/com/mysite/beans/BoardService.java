package com.mysite.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BoardService {

	@Autowired
	private BoardMapper boardMapper;
	
	// ���� �޼��� ���� ��� 
}
