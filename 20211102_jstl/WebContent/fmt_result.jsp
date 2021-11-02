<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>fmt result : 한글 깨짐 방지 (post 방식)</title>
</head>
<body>
	<h4>기존 JSP 방식</h4>
	<%
		request.setCharacterEncoding("UTF-8");
	
	%>
	<%= request.getParameter("TEXT") %>
	
	<h4>JSTL의 format 방식</h4>
	<fmt:requestEncoding value="UTF-8"/>
	<c:out value="${param.TEXT }"></c:out>
	
</body>
</html>