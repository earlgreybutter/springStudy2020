<%@page contentType="text/html; charset=euc-kr" %>
<%@page import="net.javajigi.user.model.User" %>
<%@page import="net.javajigi.user.non.NonUserService" %>
<%
try {
	String userId = request.getParameter("userId");
	String password = request.getParameter("password");
	
	//모델에 로그인 작업을 위임한다.
	NonUserService service = NonUserService.getInstance();
	service.login(userId, password);

	User user = service.findUser(userId);
	
	//정상적으로 로그인 되었을 경우 세션에 사용자 아이디 저장.
	session = request.getSession();
	session.setAttribute("user", user); // user에 대한 정보를 user라는 이름으로 session영역에 저장

	//모든 작업 완료후 이동할 페이지를 결정.
	if( user.isAdmin() ) {
		response.sendRedirect("user_list.jsp");
	} else {
		response.sendRedirect("index.jsp");
	}
} catch (Exception e) {
%>
<!--
에러가 발생할 경우 이전 페이지로 이동.
-->
<script language="javascript">
alert("<%= e.getMessage() %>");
history.back();
</script>
<%
}
%>