<%@page contentType="text/html; charset=euc-kr" %>
<%@page import="net.javajigi.user.model.User" %>
<%@page import="net.javajigi.user.non.NonUserService" %>
<%@ include file="loginCheck.jsp" %>
<%
	String userId = request.getParameter("userId");
	String password = request.getParameter("password");
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String admin = request.getParameter("admin");	
	
	User user = new User();
	user.setUserId(userId);
	user.setPassword(password);
	user.setName(name);
	user.setEmail(email);
	if ( (admin!=null) && (admin.length()>0) ) {
		user.setAdmin(new Boolean(admin).booleanValue());
	}	
	
	NonUserService service = NonUserService.getInstance();
	service.updateUser(user);

	response.sendRedirect("user_list.jsp");
%>