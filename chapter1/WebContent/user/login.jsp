<%@page contentType="text/html; charset=euc-kr" %>
<html>
<head>
<title>Chapter1 ����� ����</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel=stylesheet href="../css/user.css" type="text/css">
<script language="JavaScript">
function userCreate() {
	f.action = "user_write.jsp";
	f.submit();
}

function login() {
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
	
	f.action = "login_action.jsp";
	f.submit();
}
</script>
</head>
<body bgcolor=#FFFFFF text=#000000 leftmargin=0 topmargin=0 marginwidth=0 marginheight=0>
<br/>
<table width="600" border="0" align="center">
<tr>
	<td bgcolor="f4f4f4" height="22">&nbsp;&nbsp;<b>����� ���� - �α���</b></td>
</tr>
<tr>
	<td>
	  <!-- Login Form  -->
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
	  </table>
	  </form>
	</td>
</tr>
<tr>
	<td align=center>
		<input type="button" value="�α���" onClick="login()"> &nbsp;
		<input type="button" value="ȸ������" onClick="userCreate()">
	</td>
</tr>
</table>  

</body>
</html>