<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
읽기페이지
<div>
	<p>번호 : ${getContent.idx}</p>
	<p>이름 : ${getContent.name}</p>
	<p>제목 : ${getContent.subject}</p>
	<p>내용 : ${getContent.content}</p>
	<p>작성일 : ${getContent.write_date}</p>
</div>

<a href="edit.guest?idx=${getContent.idx}">수정하기</a>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="delform.jsp?idx=${getContent.idx}">삭제하기</a>
</body>
</html>