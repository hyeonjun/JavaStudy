<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>A형 화면 : a.jsp</title>
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
	성실하고 신중하며 완벽주의자입니다.
	
</body>
</html>