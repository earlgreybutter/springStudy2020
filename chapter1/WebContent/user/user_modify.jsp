<%@page import="net.javajigi.user.service.UserServiceHelper"%>
<%@page import="net.javajigi.user.service.UserService"%>
<%@page contentType="text/html; charset=euc-kr" %>
<%@page import="net.javajigi.user.model.User" %>
<%@page import="net.javajigi.user.non.NonUserService" %>
<%@ include file="loginCheck.jsp" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<title>Chapter1 ����� ����</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel=stylesheet href="/chapter1/css/user.css" type="text/css">
<script language="JavaScript">
function userModify() {
	f.action = "/chapter1/memberEditProc.do";
	f.submit();
}

function userList() {
	f.action = "/chapter1/memberList.do";	// user_list.jsp
	f.submit();
}
</script>
</head>
<body bgcolor=#FFFFFF text=#000000 leftmargin=0 topmargin=0 marginwidth=0 marginheight=0>
<br>
<table width="600" border="0" align="center">
<tr>
	<td bgcolor="f4f4f4" height="22">&nbsp;&nbsp;<b>����� ���� - ȸ�� ���� ����</b></td>
</tr>
<tr>
	<td>
	  <!-- modify Form  -->
	  <form name="f" method="post">
	  <input type="hidden" name="userId" value="${user.userId}"/>	 
	  <table border="0" cellpadding="0" cellspacing="1" width="100%" bgcolor="BBBBBB">
		  <tr>
			<td width=150 align=center bgcolor="E6ECDE" height="22">����� ���̵�</td>
			<td width=450 bgcolor="ffffff" style="padding-left:10">
				${user.userId}
			</td>
		  </tr>
		  <tr>
			<td width=150 align=center bgcolor="E6ECDE" height="22">��й�ȣ</td>
			<td width=450 bgcolor="ffffff" style="padding-left:10">
				<input type="password" style="width:200" name="password" value="${user.password}">
			</td>
		  </tr>
		  <tr>
			<td width=150 align=center bgcolor="E6ECDE" height="22">�̸�</td>
			<td width=450 bgcolor="ffffff" style="padding-left:10">
				<input type="text" style="width:300" name="name" value="${user.name}">
			</td>
		  </tr>
		  <tr>
			<td width=150 align=center bgcolor="E6ECDE" height="22">�̸��� �ּ�</td>
			<td width=450 bgcolor="ffffff" style="padding-left:10">
				<input type="text" style="width:300" name="email" value="${user.email}">
			</td>
		  </tr>	
		  <tr>
			<td width=150 align=center bgcolor="E6ECDE" height="22">Admin ����</td>
			<td width=450 bgcolor="ffffff" style="padding-left:10">

<c:if test="${user.admin}">
	<input type="checkbox" name="admin" value="true" checked />
</c:if>
<c:if test="${!user.admin}">
	<input type="checkbox" name="admin" value="true"/>
</c:if>
			</td>
		  </tr>		  	  
	  </table>
	  </form>
	</td>
</tr>	  
<tr>
	<td align=center>
		<input type="button" value="����" onClick="userModify()"> &nbsp;
		<input type="button" value="���" onClick="userList()">
	</td>
</tr>
</table>  

</body>
</html>