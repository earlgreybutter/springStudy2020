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
��ȣ <input type="text" name="idx" value="${getContent.idx}" readonly="readonly"><br/>
�̸� <input type="text" name="name" value="${getContent.name}"><br/>
���� <input type="text" name="subject" value="${getContent.subject}"><br/>
���� <input type="text" name="content" value="${getContent.content}"><br/>
��¥ <input type="text" name="write_date" value="${getContent.write_date}"><br/>
<input type="submit" value="�����ϱ�">
</form>
</body>
</html>