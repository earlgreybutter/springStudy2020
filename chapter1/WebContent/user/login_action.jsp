<%@page contentType="text/html; charset=euc-kr" %>
<%@page import="net.javajigi.user.model.User" %>
<%@page import="net.javajigi.user.non.NonUserService" %>
<%
try {
	String userId = request.getParameter("userId");
	String password = request.getParameter("password");
	
	//�𵨿� �α��� �۾��� �����Ѵ�.
	NonUserService service = NonUserService.getInstance();
	service.login(userId, password);

	User user = service.findUser(userId);
	
	//���������� �α��� �Ǿ��� ��� ���ǿ� ����� ���̵� ����.
	session = request.getSession();
	session.setAttribute("user", user); // user�� ���� ������ user��� �̸����� session������ ����

	//��� �۾� �Ϸ��� �̵��� �������� ����.
	if( user.isAdmin() ) {
		response.sendRedirect("user_list.jsp");
	} else {
		response.sendRedirect("index.jsp");
	}
} catch (Exception e) {
%>
<!--
������ �߻��� ��� ���� �������� �̵�.
-->
<script language="javascript">
alert("<%= e.getMessage() %>");
history.back();
</script>
<%
}
%>