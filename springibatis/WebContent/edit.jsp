<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content_Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- idx, name, subject, content, write_date -->
<form action="update.guest" method="post">
번호 <input type="text" name="idx" value="${getContent.idx}" readonly="readonly"><br/>
이름 <input type="text" name="name" value="${getContent.name}"><br/>
제목 <input type="text" name="subject" value="${getContent.subject}"><br/>
내용 <input type="text" name="content" value="${getContent.content}"><br/>
날짜 <input type="text" name="write_date" value="${getContent.write_date}"><br/>
<input type="submit" value="수정하기">
</form>
</body>
</html>