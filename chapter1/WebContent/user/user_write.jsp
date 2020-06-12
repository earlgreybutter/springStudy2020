<%@page contentType="text/html; charset=euc-kr" %>
<%@page import="net.javajigi.user.model.User" %>
<%
	User user = (User)session.getAttribute("user");
	
	boolean isAdmin =false;
	if( (user!=null) && (user.isAdmin()) ) {
		isAdmin = true;
	}
%>
<html>
<head>
<title>Chapter1 ����� ����</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel=stylesheet href="../css/user.css" type="text/css">
<script language="JavaScript">
function userCreate() {
	if ( f.userId.value == "" ) {
		alert("����� ���̵� �Է��Ͻʽÿ�.");
		f.userId.focus();
		return false;
	} 
	if ( f.password.value == "" ) {
		alert("��й�ȣ�� �Է��Ͻʽÿ�.");
		f.password.focus();
		return false;
	}
	if ( f.name.value == "" ) {
		alert("�̸��� �Է��Ͻʽÿ�.");
		f.name.focus();
		return false;
	}
	
	f.action = "user_write_action.jsp";
	f.submit();
}

function userList() {
	f.action = "user_list.jsp";
	f.submit();
}
</script>
</head>
<body bgcolor=#FFFFFF text=#000000 leftmargin=0 topmargin=0 marginwidth=0 marginheight=0>
<br/>
<table width="600" border="0" align="center">
<tr>
	<td bgcolor="f4f4f4" height="22">&nbsp;&nbsp;<b>����� ���� - ȸ�� ����</b></td>
</tr>
<tr>
	<td>
	  <!-- write Form  -->
	  <form name="f" method="post">
	  <table border="0" cellpadding="0" cellspacing="1" width="100%" bgcolor="BBBBBB">
		  <tr>
			<td width=150 align=center bgcolor="E6ECDE" height="22">����� ���̵�</td>
			<td width=450 bgcolor="ffffff" style="padding-left:10">
				<input type="text" style="width:200" name="userId">
			</td>
		  </tr>
		  <tr>
			<td width=150 align=center bgcolor="E6ECDE" height="22">��й�ȣ</td>
			<td width=450 bgcolor="ffffff" style="padding-left:10">
				<input type="password" style="width:200" name="password">
			</td>
		  </tr>
		  <tr>
			<td width=150 align=center bgcolor="E6ECDE" height="22">�̸�</td>
			<td width=450 bgcolor="ffffff" style="padding-left:10">
				<input type="text" style="width:300" name="name">
			</td>
		  </tr>
		  <tr>
			<td width=150 align=center bgcolor="E6ECDE" height="22">�̸��� �ּ�</td>
			<td width=450 bgcolor="ffffff" style="padding-left:10">
				<input type="text" style="width:300" name="email">
			</td>
		  </tr>	
<%
	if( isAdmin ) {
%>			  
		  <tr>
			<td width=150 align=center bgcolor="E6ECDE" height="22">Admin ����</td>
			<td width=450 bgcolor="ffffff" style="padding-left:10">
				<input type="checkbox" name="admin" value="true" />
			</td>
		  </tr>		  	  
<%
	}
%>			  
	  </table>
	  </form>
	</td>
</tr>
<tr>
	<td align=center>
		<input type="button" value="ȸ�� ����" onClick="userCreate()"> 
<%
	if( isAdmin ) {
%>		
		&nbsp;
		<input type="button" value="���" onClick="userList()">
<%
	}
%>		
	</td>
</tr>	  
</table>  

</body>
</html>