<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="co" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Select Color Result : if 태그</title>
</head>
<body>
	<co:if test="${param.color == 1 }">
		<span style="color : red;"><u><i>빨강</i></u></span>
	</co:if>
	<co:if test="${param.color == 2 }">
		<span style="color : green;"><strong>초록</strong></span>
	</co:if>
	<co:if test="${param.color == 3 }">
		<span style="color : blue;"><b>파랑</b></span>
	</co:if>
	
	<hr />
	<co:choose>
		<co:when test="${param.color == 1 }">
			<span style="color : white; background-color:red"><u><i>빨강</i></u></span>
		</co:when>
		
		<co:when test="${param.color == 2 }">
			<span style="color : white; background-color:green;"><strong>초록</strong></span>
		</co:when>
		
		<co:when test="${param.color == 3 }">
			<span style="color : white; background-color:blue"><b>파랑</b></span>
		</co:when>
	</co:choose>
	
	
	
</body>
</html>