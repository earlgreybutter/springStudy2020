<%@page contentType="text/html; charset=euc-kr" %>
<%@page import="net.javajigi.user.non.NonUserService" %>
<%@ include file="loginCheck.jsp" %>
<%
	String userId = request.getParameter("userId");

	NonUserService service = NonUserService.getInstance();
	service.removeUser(userId);

	response.sendRedirect("user_list.jsp");
%>