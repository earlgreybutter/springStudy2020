<%@page import="net.javajigi.user.service.UserServiceHelper"%>
<%@page import="net.javajigi.user.service.UserService"%>
<%@page contentType="text/html; charset=euc-kr" %>
<%@page import="java.util.List" %>
<%@page import="java.util.Iterator" %>
<%@page import="net.javajigi.user.model.User" %>
<%@page import="net.javajigi.user.non.NonUserService" %>

<%@ include file="loginCheck.jsp" %>

<%
	//모델을 이용하여 사용자 리스트를 가져온다.
	UserService service = UserServiceHelper.getUserService(application);
	List userList = service.findUserList();
%>
<html>
<head>
<title>Chapter1 사용자 관리</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel=stylesheet href="../css/user.css" type="text/css">

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
<%
	Iterator userIter = userList.iterator();
	
	//사용자 리스트를 클라이언트에게 보여주기 위하여 출력.
	while ( userIter.hasNext() ) {
		User user = (User)userIter.next();
%>		  	
  	<tr>
		<td width=20% align=center bgcolor="ffffff" height="20">
			<%= user.getUserId() %>
		</td>
		<td width=20% bgcolor="ffffff" style="padding-left:10">
			<a href="user_view.jsp?userId=<%= user.getUserId() %>" class="user">
				<%= user.getName() %>
			</a>
		</td>
		<td align=center bgcolor="ffffff">
			<%= user.getEmail() %>
		</td>
		<td width=20% align=center bgcolor="ffffff">
<%
		if( user.isAdmin() ) {
			out.println("Y");
		} else {
			out.println("N");
		}		
%>
		</td>		
  	</tr>
<%
	}
%>		  	
	</table>
	<!-- /list -->	 
	</td>
</tr>
<tr>
	<td align="right">
		<input type="button" 
			onClick="location.href='user_write.jsp'" 
			value="사용자 추가"/>
	</td>
</tr>
</table>  
</body>
</html>