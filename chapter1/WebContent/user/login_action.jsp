<%@page contentType="text/html; charset=euc-kr" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:if test="${admin}">
<script>
	alert('�α��� ���� \n �����ڴ� ȯ���մϴ�. \n������� �̵��մϴ�. ');
	location.href = '/chapter1/memberList.do';
</script>
</c:if>

<c:if test="${!admin}">
<script>
	alert('�α��� ���� \n ȸ���� ȯ���մϴ�. \n�ʱ�ȭ������ �̵��մϴ�. ');
	location.href = '/chapter1/memberIndex.do';
</script>
</c:if>

<!--
������ �߻��� ��� ���� �������� �̵�.
-->

