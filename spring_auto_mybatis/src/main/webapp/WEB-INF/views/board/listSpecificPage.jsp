<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ page session="false" %>
<%@ page import = "com.mysite.beans.BoardBean" %>
<%@ page import="com.mysite.beans.PageNumberingManager" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Properties" %>
<%@ page import="java.io.IOException" %>
<%@ page import="java.io.FileInputStream" %>


<html>
<head>
<meta charset="EUC-KR">
<title>���</title>
</head>
<body>
<c:set var="current_page" value="${current_page}"/>
<c:set var="total_cnt" value="${totalCnt}"/>
<%
int c_page = Integer.parseInt((String) (pageContext.getAttribute("current_page")));
pageContext.setAttribute("c_page", c_page);
%>
<table cellspacing="1" width="700" border="0">
	<tr>
		<td>�� �Խù� �� : <c:out value="${total_cnt}"/></td>
		<td><p align="right">������ : <c:out value="${current_page}"/></p></td>
	</tr>
</table>

<table cellspacing="1" width="700" border="1">
	<tr>
		<td width="50"><p align="center">��ȣ</p></td>
		<td width="100"><p align="center">�̸�</p></td>
		<td width="320"><p align="center">����</p></td>
		<td width="100"><p align="center">�����</p></td>
		<td width="100"><p align="center">��ȸ��</p></td>
	</tr>
	
	<c:forEach var="board" items="${boardList}">
	<tr>
		<td width="50"><p align="center">${board.getId()}</p></td>
		<td width="100"><p align="center">${board.getName()}</p></td>
		<td width="320"><p align="center">
			<a href="viewWork.do?memo_id=${board.getId()}&current_pgae=<c:out value="${current_page}"/>&searchStr=None" title="${board.getMemo()}"><c:out value="${board.getSubject()}"/>
		</p></td>
		<td width="100"><p align="center"><c:out value="${board.getCreated_date()}"/></p></td>
		<td width="100"><p align="center"><c:out value="${board.getHits()}"/></p></td>
	</tr>
	</c:forEach>
	<%
	int rowsPerPage = 2;
	int total_cnt = ((Integer)(pageContext.getAttribute("total_cnt"))).intValue();
	
	// ��ü ������
	int total_pages = PageNumberingManager.getInstance().getTotalPage(total_cnt, rowsPerPage);
	pageContext.setAttribute("t_pages", total_pages);
	%>
</table>

<table cellspacing="1" width="700" border="1">
<tr>
	<td>
		<c:forEach var="i" begin="1" end="${t_pages}">
		<a href="listSpecificPageWork.do?current_page=${i}">
		[
		<c:if test="${i == c_page}"><b></c:if>
		${i}
		<c:if test="${i == c_page}"></b></c:if>
		]
		</c:forEach>
	</td>
</tr>
</table>

<table width="700">
<tr>
	<td><input type="button" value="�۾���" onclick="window.location='show_write_form.do'"></td>
	<td>
		<form name="searchf" method="post" action="searchWithSubject.do">
		<p align="right"><input type="text" name="searchStr" size="50" maxlength="50"><input type="submit" value="��ã��"></p>
	</td>
</tr>
</table>

</body>
</html>