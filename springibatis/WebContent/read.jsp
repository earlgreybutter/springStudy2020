<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
�б�������
<div>
	<p>��ȣ : ${getContent.idx}</p>
	<p>�̸� : ${getContent.name}</p>
	<p>���� : ${getContent.subject}</p>
	<p>���� : ${getContent.content}</p>
	<p>�ۼ��� : ${getContent.write_date}</p>
</div>

<a href="edit.guest?idx=${getContent.idx}">�����ϱ�</a>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="delform.jsp?idx=${getContent.idx}">�����ϱ�</a>
</body>
</html>