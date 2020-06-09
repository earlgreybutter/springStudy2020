<%@page contentType="text/html; charset=euc-kr"%>
<%
	response.setStatus(200);
%>
<html>
<head>
<title>자바지기에 오신 것을 환영합니다.</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link href="<%= request.getContextPath() %>/css/global.css" rel="stylesheet" type="text/css">
</head>
<body bgcolor=#FFFFFF text=#000000 leftmargin=0 topmargin=0
	marginwidth=0 marginheight=0>
<div id="welcome">
<h1>페이지를 찾을 수 없습니다.</h1>

<p><span class="drop">자</span>바지기가 쓴 Spring Framework Workbook의 샘플 예제에
오신 것을 환영합니다. 요청한 페이지는 Spring Framework Workbook의 샘플 예제에서 지원하지 않는 페이지
입니다. 아래 목록에 있는 페이지로 이동할 수 있습니다.</p>

<ul id="menu">
	<li><a href="<%= request.getContextPath() %>/user">Home</a></li>
	<li><a href="http://www.javajigi.net" target="_blank">자바지기 커뮤니티</a></li>
	<li><a href="http://wiki.javajigi.net" target="_blank">자바지기 위키</a></li>
</ul>
</div>
</body>
</html>
