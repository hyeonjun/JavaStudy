<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	String[] movieList = {"타이타닉", "시네마 천국", "혹성 탈출", "킹콩"};
	pageContext.setAttribute("movieList", movieList);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>foreach movie ul 2</title>
</head>
<body>
	<ul>
		<c:forEach var="movie" items="${movieList }" varStatus="status">
			<%-- <c:if test="${status.index == 0 }">
				<li style="color:red; font-weight:bold;">${movie }</li>
			</c:if>
			<c:if test="${status.index != 0 }">
				<li>${movie }</li>
			</c:if> --%>
			<c:choose>
				<c:when test="${status.first }">
					<li style="color:red; font-weight:bold">${movie }</li>
				</c:when>
				<c:otherwise>
					<li>${movie }</li>
				</c:otherwise>
			</c:choose>
		</c:forEach>
	</ul>
	
	<c:forEach var="movie" items="${movieList }" varStatus="status">
			${movie } <c:if test="${not status.last }">,</c:if>
	</c:forEach>
</body>
</html>