<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<% response.setStatus(200); %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>에러 발생 시 호출되는 페이지</title>
</head>
<body>
	에러발생 <br />
	<% String err = exception.getMessage(); %>
	<%= err + " 숫자는 0으로 나눌 수 없습니다."  %>
</body>
</html>