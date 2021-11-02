<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>jstl import</title>
</head>
<body>
	<c:import url="http://localhost:9000/20211102_jstl/forTokens.jsp" var="data"></c:import>
	${data } <br />
</body>
</html>