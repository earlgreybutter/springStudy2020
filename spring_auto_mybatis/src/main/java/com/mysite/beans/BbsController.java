package com.mysite.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BbsController {

	@Autowired
	BoardService boardService;
	
	private static final Logger logger = LoggerFactory.getLogger(BbsController.class);
	
	// ���⿡ @�� �̿��� ��Ʈ�� ���� ����� �� 
}
