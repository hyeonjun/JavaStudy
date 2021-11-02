<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>el Addition result</title>
</head>
<body>
	JSP 방식 1 <br />
	<%
		String n1 = request.getParameter("num1");
		String n2 = request.getParameter("num2");
		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(n2);
	%>
	<%= num1 %> + <%= num2 %> = <%= num1+num2 %>
	<hr />
	JSP 방식 2 <br />
	<%
		int num3 = Integer.parseInt(request.getParameter("num1"));
		int num4 = Integer.parseInt(request.getParameter("num2"));
	%>
	<%= num3 %> + <%= num4 %> = <%= num3+num4 %>
	<hr />
	EL 방식  1<br />
	${num1 } + ${num2 } : ${num1+num2 }
	<hr />
	EL 방식 2<br />
	${param.num1 } + ${param.num2 } : ${param.num1 + param.num2 }
</body>
</html>