<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="str_aid" value="${memo_id}"/>
<c:set var="str_c_page" value="${current_page}"/>
<c:set var="searchString" value="${searchStr}"/>
<html>
<head>
<meta charset="EUC-KR">
<title>글보기</title>
</head>
<%
String searchString = (String) (pageContext.getAttribute("searchString"));
%>
<script type="text/javascript">

function boardlist() {
	var s = "<%=searchString%>";
	if(s=="None"){
		location.href = 'listSpecificPageWork.do?current_page=${current_page}';
	}
	else{
		location.href = 'listSearchedSpecificPageWork.do?pageForView=${current_page}&searchStr=${searchStr}';
	}
}

function boardmodify() {
	location.href = 'listSpecificPageWork_to_update.do?memo_id=${memo_id}&current_page=${current_page}';
}

function boarddelelte() {
	location.href = 'DeleteSpecificRow.do?memo_id=${memo_id}&current_page=${current_page}';
}
</script>

<body>
<table cellspacing="0" cellpadding="5" border="1" width="500">
<tr>
	<td><b>조회수</b></td>
	<td><c:out value="${boardData.getHits()}"/></td>
</tr>
<tr>
	<td><b>이름</b></td>
	<td><c:out value="${boardData.getName()}"/></td>
</tr>
<tr>
	<td><b>이메일</b></td>
	<td><c:out value="${boardData.getMail()}"/></td>
</tr>
<tr>
	<td><b>제목</b></td>
	<td><c:out value="${boardData.getSubject()}"/></td>
</tr>
<tr>
	<td><b>내용</b></td>
	<td width="350"><c:out value="${boardData.getMemo()}"/></td>
</tr>
</table>

<table cellspacing="0" cellpadding="0" border="0" width="500">
<tr><td>
	<input type="button" value="수정" onclick="boardmodify()"/>
	<input type="button" value="목록" onclick="boardlist()"/>
	<input type="button" value="삭제" onclick="boarddelete()"/>
</td></tr>
</table>
</body>
</html>