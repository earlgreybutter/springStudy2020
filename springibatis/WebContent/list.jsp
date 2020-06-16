<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
    가져온 목록은 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href="write.html">글쓰기</a><p>
    
    <c:forEach var="contentsList" items="${contentsList}">
    <div>
    <a href="read.guest?key=r&idx=${contentsList.idx}">
    	번호 : ${contentsList.idx}
    	이름 : ${contentsList.name}
    	제목 : ${contentsList.subject}
    	내용 : ${contentsList.content}
    	작성일 : ${contentsList.write_date}
    </a>
    </div>
    <hr/>
    </c:forEach>
