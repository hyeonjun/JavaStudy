<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	String[] movieList = {"수색자", "서복", "시네마천국", "기적", "포레스트"};
	pageContext.setAttribute("movieList", movieList);
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>foreach movie </title>
</head>
<body>
	<c:forEach var="movie" items="${movieList }">
		${movie } <br />
	</c:forEach>
</body>
</html>