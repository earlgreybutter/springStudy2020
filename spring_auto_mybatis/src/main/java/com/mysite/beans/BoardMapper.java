package com.mysite.beans;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardMapper {
	// sql 하고 메소드 기술 
	final String INSERT = 
			"INSERT INTO SPRING_BOARD(ID, SUBJECT, NAME, CREATED_DATE, MAIL, MEMO)"+
			"VALUES(SEQ_ID.NEXTVAL, #{subject}, #{name}, SYSDATE, #{mail}, #{memo})";
	
	@Insert(INSERT)
	void insertBoard(BoardBean boardBean);
	
	final String SELECT_CNT_ALL = "SELECT count(1) FROM SPRING_BOARD";
	
	// 전체 글 갯수를 조회
	@Select(SELECT_CNT_ALL)
	int getTotalCnt();
	
	
	
	final String SELECT_PAGE = 
			"SELECT * FROM (SELECT ID, SUBJECT, NAME, CREATED_DATE, MAIL, MEMO, HITS, ceil(rownum/#{rowsPerPage}) as page "+
			"FROM SPRING_BOARD ORDER BY ID DESC) WHERE page=#{page}";
	
	@Select(SELECT_PAGE)
	@Results(value= {
			@Result(property = "id", column = "ID"),
			@Result(property = "subject", column = "SUBJECT"),
			@Result(property = "name", column = "NAME"),
			@Result(property = "created_date", column = "CREATED_DATE"),
			@Result(property = "mail", column = "MAIL"),
			@Result(property = "memo", column = "MEMO"),
			@Result(property = "hits", column = "HITS"),
	})
	ArrayList<BoardBean> getList(@Param("page")int page, @Param("rowsPerPage")int rowsPerPage);
	
	
	
	final String SELECT_BY_ID = 
			"SELECT ID, SUBJECT, NAME, CREATED_DATE, MAIL, MEMO, HITS "+
			"FROM SPRING_BOARD WHERE ID = #{id}";
	
	@Select(SELECT_BY_ID)
	@Results(value= {
			@Result(property = "id", column = "ID"), 
			@Result(property = "subject", column = "SUBJECT"), 
			@Result(property = "name", column = "NAME"), 
			@Result(property = "created_date", column = "CREATED_DATE"), 
			@Result(property = "mail", column = "MAIL"), 
			@Result(property = "memo", column = "MEMO"), 
			@Result(property = "hits", column = "HITS")
	})
	BoardBean getSpecificRow (@Param("id") String id);
	
}
