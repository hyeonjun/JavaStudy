<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>AB형 화면 : ab.jsp</title>
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
	강한 의지의 소유자입니다.
</body>
</html>