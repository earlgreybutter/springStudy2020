<%@page contentType="text/html; charset=euc-kr" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:if test="${admin}">
<script>
	alert('로그인 성공 \n 관리자님 환영합니다. \n목록으로 이동합니다. ');
	location.href = '/chapter1/memberList.do';
</script>
</c:if>

<c:if test="${!admin}">
<script>
	alert('로그인 성공 \n 회원님 환영합니다. \n초기화면으로 이동합니다. ');
	location.href = '/chapter1/memberIndex.do';
</script>
</c:if>

<!--
에러가 발생할 경우 이전 페이지로 이동.
-->

