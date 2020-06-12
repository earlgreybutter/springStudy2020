<%@page import="net.javajigi.user.service.UserServiceHelper"%>
<%@page import="net.javajigi.user.service.UserService"%>
<%@page contentType="text/html; charset=euc-kr" %>
<%@page import="java.util.List" %>
<%@page import="java.util.Iterator" %>
<%@page import="net.javajigi.user.model.User" %>
<%@page import="net.javajigi.user.non.NonUserService" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ include file="loginCheck.jsp" %>

<%
	//모델을 이용하여 사용자 리스트를 가져온다.

%>
<html>
<head>
<title>Chapter1 사용자 관리</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel=stylesheet href="/chapter1/css/user.css" type="text/css">

</head>
<body bgcolor=#FFFFFF text=#000000 leftmargin=0 topmargin=0 marginwidth=0 marginheight=0>
<br>
<table width="600" border="0" align="center">
<tr>
	<td bgcolor="f4f4f4" height="22">&nbsp;&nbsp;<b>사용자 관리 - 리스트</b></td>
</tr>
<tr>
	<td>
  	<!-- list -->
	<table border="0" width="100%" cellpadding="0" cellspacing="1" bgcolor="BBBBBB">
  	<tr>
		<td width=20% align=center bgcolor="E6ECDE" height="22">사용자 아이디</td>
		<td width=20% align=center bgcolor="E6ECDE">이름</td>
		<td align=center bgcolor="E6ECDE">이메일</td>
		<td width=20% align=center bgcolor="E6ECDE">관리자 유무</td>
  	</tr>
<c:forEach var="user" items="${userList}">
  	<tr>
		<td width=20% align=center bgcolor="ffffff" height="20">
			<c:out value="${user.userId}"/>
		</td>
		<td width=20% bgcolor="ffffff" style="padding-left:10">
			<a href="/chapter1/memberView.do?userId=${user.userId}" class="user">
				<c:out value="${user.name}"/>
			</a>
		</td>
		<td align=center bgcolor="ffffff">
			<c:out value="${user.email}"/>
		</td>
		<td width=20% align=center bgcolor="ffffff">
		<c:if test="${user.admin}">
		Y
		</c:if>
		<c:if test="${!user.admin}">
		N
		</c:if>
		</td>		
  	</tr>
</c:forEach>
	</table>
	<!-- /list -->	 
	</td>
</tr>
<tr>
	<td align="right">
		<input type="button" 
			onClick="location.href='/chapter1/memberWriteForm.do'" 
			value="사용자 추가"/>
	</td>
</tr>
</table>  
</body>
</html>