<%@page contentType="text/html; charset=euc-kr" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<c:if test="${result}">
����ó���� �Ǿ����ϴ�. 3�� �Ŀ� ȸ��������� �̵��մϴ�. 
<meta http-equiv="refresh" content="3;url=/chapter1/memberList.do">
</c:if>
<c:if test="${!result}">
����ó���� �Ǿ����ϴ�. �ʱ�ȭ������ �̵��մϴ�. 
<meta http-equiv="refresh" content="3;url=/chapter1/user/index.jsp">
</c:if>