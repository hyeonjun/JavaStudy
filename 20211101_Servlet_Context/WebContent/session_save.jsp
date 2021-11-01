<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>session_save.jsp</title>
</head>
<body>
	세션에 데이터 저장 : session 내장 객체의 setAttribute("이름", "데이터");
	<br />
	
	<%
		session.setAttribute("ID", "test");
		session.setAttribute("PW", "1234");
		session.setAttribute("NAME", "홍길동");
	%>
</body>
</html>