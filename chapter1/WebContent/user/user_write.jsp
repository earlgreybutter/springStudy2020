<%@page contentType="text/html; charset=euc-kr" %>
<%@page import="net.javajigi.user.model.User" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Chapter1 사용자 관리</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel=stylesheet href="../css/user.css" type="text/css">
<script language="JavaScript">
function userCreate() {
	if ( f.userId.value == "" ) {
		alert("사용자 아이디를 입력하십시요.");
		f.userId.focus();
		return false;
	} 
	if ( f.password.value == "" ) {
		alert("비밀번호를 입력하십시요.");
		f.password.focus();
		return false;
	}
	if ( f.name.value == "" ) {
		alert("이름을 입력하십시요.");
		f.name.focus();
		return false;
	}
	
	f.action = "/chapter1/memberWriteProc.do";	// 폼의 위치를 바꾸어줌 
	f.submit();
}

function userList() {
	f.action = "/chapter1/userList.do";
	f.submit();
}
</script>
</head>
<body bgcolor=#FFFFFF text=#000000 leftmargin=0 topmargin=0 marginwidth=0 marginheight=0>
<br/>
<table width="600" border="0" align="center">
<tr>
	<td bgcolor="f4f4f4" height="22">&nbsp;&nbsp;<b>사용자 관리 - 회원 가입</b></td>
</tr>
<tr>
	<td>
	  <!-- write Form  -->
	  <form name="f" method="post">
	  <table border="0" cellpadding="0" cellspacing="1" width="100%" bgcolor="BBBBBB">
		  <tr>
			<td width=150 align=center bgcolor="E6ECDE" height="22">사용자 아이디</td>
			<td width=450 bgcolor="ffffff" style="padding-left:10">
				<input type="text" style="width:200" name="userId">
			</td>
		  </tr>
		  <tr>
			<td width=150 align=center bgcolor="E6ECDE" height="22">비밀번호</td>
			<td width=450 bgcolor="ffffff" style="padding-left:10">
				<input type="password" style="width:200" name="password">
			</td>
		  </tr>
		  <tr>
			<td width=150 align=center bgcolor="E6ECDE" height="22">이름</td>
			<td width=450 bgcolor="ffffff" style="padding-left:10">
				<input type="text" style="width:300" name="name">
			</td>
		  </tr>
		  <tr>
			<td width=150 align=center bgcolor="E6ECDE" height="22">이메일 주소</td>
			<td width=450 bgcolor="ffffff" style="padding-left:10">
				<input type="text" style="width:300" name="email">
			</td>
		  </tr>	
	<c:if test="${admin}">
	 	<tr>
			<td width=150 align=center bgcolor="E6ECDE" height="22">Admin 유무</td>
			<td width=450 bgcolor="ffffff" style="padding-left:10">
				<input type="checkbox" name="admin" value="true" />
			</td>
		 </tr>		 
	</c:if>
			  
	  </table>
	  </form>
	</td>
</tr>
<tr>
	<td align=center>
		<input type="button" value="회원 가입" onClick="userCreate()"> 

<c:if test="${admin}">
	&nbsp;
	<input type="button" value="목록" onClick="userList()">
</c:if>
	</td>
</tr>	  
</table>  

</body>
</html>