<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
    ������ ����� &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href="write.html">�۾���</a><p>
    
    <c:forEach var="contentsList" items="${contentsList}">
    <div>
    <a href="read.guest?key=r&idx=${contentsList.idx}">
    	��ȣ : ${contentsList.idx}
    	�̸� : ${contentsList.name}
    	���� : ${contentsList.subject}
    	���� : ${contentsList.content}
    	�ۼ��� : ${contentsList.write_date}
    </a>
    </div>
    <hr/>
    </c:forEach>
