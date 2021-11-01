<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String admin_id = "admin";
	String admin_pwd = "1234";
	String admin_name = "관리자";
	
	if(admin_id.equals(request.getParameter("ID")) && admin_pwd.equals(request.getParameter("PWD"))){
		session.setAttribute("user", admin_name);
		response.sendRedirect("main.jsp");
	} else{
		response.sendRedirect("login.jsp");
	}

%>
<!-- <!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>로그 체크 화면</title>
</head>

<body>
	

</body>
</html> -->