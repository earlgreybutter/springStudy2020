<%
	if ((session == null) || (session.getAttribute("user") == null)) {
		response.sendRedirect("/chapter1/memberLoginForm.do");
	}
%>