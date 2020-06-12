<!--<%@page contentType="text/html; charset=euc-kr"%>-->

<%@ include file="loginCheck.jsp" %>

<!-- 아래 부분은 
	로그인이 되어있는 경우, 출력이 일어남. 
	로그인이 되어있지 않은 경우, 로그인 폼으로 이동.  -->

<html>
<head>
<title>자바지기에 오신 것을 환영합니다.</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link href="<%= request.getContextPath() %>/css/global.css" rel="stylesheet" type="text/css">
</head>
<body bgcolor=#FFFFFF text=#000000 leftmargin=0 topmargin=0
	marginwidth=0 marginheight=0>

<div id="welcome">
<h1>Spring Framework Workbook</h1>

<p><span class="drop">자</span>바지기가 쓴 Spring Framework Workbook의 샘플 예제에
오신 것을 환영합니다. 이 샘플 예제에서 다루는 기능은 사용자 관리 시스템과 자료실 게시판 두가지 기능을 가지고 있습니다. 이
두가지 기능을 가지는 샘플 예제를 통하여 Spring이 제공하는 막강한 기능을 마음껏 느껴 보시기 바랍니다.</p>

<p>이 책은 LightWeight Container Architecture의 선두 주자라고 할 수 있는 Spring 프레임워크를
이해하기 위한 책이다. 실전과 같은 예제를 통하여 EJB와 Spring의 차이점을 이해하고, EJB에 비하여 Spring
프레임워크가 가지고 있는 강점에 대하여 다룬다. 또한, Spring 프레임워크를 실무 프로젝트에 적용했을 때 개발 생산성을 향상
시킬 수 있는 방법과 테스트 전략을 다룬다.</p>

</div>

</body>
</html>
