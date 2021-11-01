<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>이동된 page.jsp</title>
</head>
<body>
	response.sendRedirect() 에 의해서 이동된 페이지
	<br />
	요청 페이지 번호 : <%= request.getParameter("no") %>
	<br />
	검색어 : <%= request.getParameter("search") %>
	
</body>
</html>