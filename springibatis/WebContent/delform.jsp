<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
삭제페이지
<form action="delete.guest" method="post">
번호 <input type="text" name="idx" value="${param.idx}" readonly="readonly"><br/>
암호 <input type="text" name="password"><br/>
<br/>
<input type="submit" value="입력하기">
</form>
</body>
</html>