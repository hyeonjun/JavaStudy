<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Include_JSP</title>
</head>
<body>
	<h1>아래 부분에 include.jsp 내용이 들어 옵니다.</h1>
	
	<%@ include file="include.jsp" %>
	
	
	<h1>위에 include 되었나요?</h1>
</body>
</html>