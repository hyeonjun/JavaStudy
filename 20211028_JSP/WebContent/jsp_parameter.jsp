<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String n1 = request.getParameter("n1");
	String n2 = request.getParameter("n2");
	// 전달받은 두 수를 곱한 후 결과를 출력
	int r = Integer.parseInt(n1) * Integer.parseInt(n2);
%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Parameter : html에서 전송된 데이터를 받는 JSP</title>
</head>
<body>
	<%= r %>
</body>
</html>