<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- 
no, name, subject, content, write_date
 -->
 <form action="/springibatis/create.guest" method="post">
 이름 <input type="text" name="name"><br/>
 제목 <input type="text" name="subject"><br/>
 내용 <input type="text" name="content"><br/>
 암호 <input type="text" name="password"><br/>
 <input type="submit" value="입력하기">
 </form>
</body>
</html>