<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>request 내장 객체의 주요 메서드</title>
</head>
<body>
	<%
		out.println(request.getContextPath()+"<br />"); // /20211028_JSP
		out.println(request.getMethod()+"<br />");		// GET
		out.println(request.getSession()+"<br />");		// org.apache.catalina.session.StandardSessionFacade@76e33183
		out.println(request.getProtocol()+"<br />");    // HTTP/1.1
		
		out.println(request.getRequestURL()+"<br />");	// http://localhost:9000/20211028_JSP/jsp_request.jsp
		out.println(request.getServerName()+"<br />");	// localhost
		out.println(request.getServerPort()+"<br />");	// 9000
	%>
	
	
</body>
</html>