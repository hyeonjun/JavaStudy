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
	<title>foreach movie Table</title>
</head>
<body>
	<table border="1" style="text-align: center;">
		<tr><th>INDEX</th><th>COUNT</th><th>TITLE</th></tr>
		
		<c:forEach var="movie" items="${movieList }" varStatus="status">
			<tr>
				<td>${status.index }</td>
				<td>${status.count }</td>
				<td>${movie }</td>
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>