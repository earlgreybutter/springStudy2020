<%@page contentType="text/html; charset=euc-kr" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<c:if test="${result}">
가입처리가 되었습니다. 3초 후에 회원목록으로 이동합니다. 
<meta http-equiv="refresh" content="3;url=/chapter1/memberList.do">
</c:if>
<c:if test="${!result}">
가입처리가 되었습니다. 초기화면으로 이동합니다. 
<meta http-equiv="refresh" content="3;url=/chapter1/user/index.jsp">
</c:if>