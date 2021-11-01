<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>B형 화면 : b.jsp</title>
</head>
<body>
	<%
		String name = (String) session.getAttribute("name");
		String bloodType = (String) session.getAttribute("bloodtype");
		if (name == null || bloodType == null) {
			response.sendRedirect("bloodtype.jsp");
		}
		//String name = request.getParameter("name");
		//String bloodType = request.getParameter("bloodtype");
	%>
	
	<%= name %> 님의 혈액형은 <%= bloodType %> 입니다. <br />
	구속을 싫엏는 자유인입니다.
</body>
</html>