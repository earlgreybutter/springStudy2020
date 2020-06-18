package com.mysite.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BoardService {

	@Autowired
	private BoardMapper boardMapper;
	
	// 서비스 메서드 정의 기술 
}
