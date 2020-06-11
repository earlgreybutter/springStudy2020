<%@page import="net.javajigi.user.service.UserServiceHelper"%>
<%@page import="net.javajigi.user.service.UserService"%>
<%@page contentType="text/html; charset=euc-kr" %>
<%@page import="net.javajigi.user.model.User" %>
<%@page import="net.javajigi.user.non.NonUserService" %>
<%@ include file="loginCheck.jsp" %>
<%
	String userId = request.getParameter("userId");
	
	UserService service = UserServiceHelper.getUserService(application);
	User user = service.findUser(userId);
%>
<html>
<head>
<title>Chapter1 사용자 관리</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel=stylesheet href="../css/user.css" type="text/css">
<script language="JavaScript">
function userModify() {
	f.action = "user_modify_action.jsp";
	f.submit();
}

function userList() {
	f.action = "user_list.jsp";
	f.submit();
}
</script>
</head>
<body bgcolor=#FFFFFF text=#000000 leftmargin=0 topmargin=0 marginwidth=0 marginheight=0>
<br>
<table width="600" border="0" align="center">
<tr>
	<td bgcolor="f4f4f4" height="22">&nbsp;&nbsp;<b>사용자 관리 - 회원 정보 수정</b></td>
</tr>
<tr>
	<td>
	  <!-- modify Form  -->
	  <form name="f" method="post">
	  <input type="hidden" name="userId" value="<%= user.getUserId() %>"/>	 
	  <table border="0" cellpadding="0" cellspacing="1" width="100%" bgcolor="BBBBBB">
		  <tr>
			<td width=150 align=center bgcolor="E6ECDE" height="22">사용자 아이디</td>
			<td width=450 bgcolor="ffffff" style="padding-left:10">
				<%= user.getUserId() %>
			</td>
		  </tr>
		  <tr>
			<td width=150 align=center bgcolor="E6ECDE" height="22">비밀번호</td>
			<td width=450 bgcolor="ffffff" style="padding-left:10">
				<input type="password" style="width:200" name="password" value="<%= user.getPassword() %>">
			</td>
		  </tr>
		  <tr>
			<td width=150 align=center bgcolor="E6ECDE" height="22">이름</td>
			<td width=450 bgcolor="ffffff" style="padding-left:10">
				<input type="text" style="width:300" name="name" value="<%= user.getName() %>">
			</td>
		  </tr>
		  <tr>
			<td width=150 align=center bgcolor="E6ECDE" height="22">이메일 주소</td>
			<td width=450 bgcolor="ffffff" style="padding-left:10">
				<input type="text" style="width:300" name="email" value="<%= user.getEmail() %>">
			</td>
		  </tr>	
		  <tr>
			<td width=150 align=center bgcolor="E6ECDE" height="22">Admin 유무</td>
			<td width=450 bgcolor="ffffff" style="padding-left:10">
<%
	if( user.isAdmin() ) {
%>							
				<input type="checkbox" name="admin" value="true" checked />
<%
	} else {
%>
				<input type="checkbox" name="admin" value="true"/>
<%
	}
%>			
			</td>
		  </tr>		  	  
	  </table>
	  </form>
	</td>
</tr>	  
<tr>
	<td align=center>
		<input type="button" value="수정" onClick="userModify()"> &nbsp;
		<input type="button" value="목록" onClick="userList()">
	</td>
</tr>
</table>  

</body>
</html>