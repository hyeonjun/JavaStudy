<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>forTokens</title>
</head>
<body>
	<c:forTokens items="서울.인천,대구.부산" delims="," var="city"> <!-- delims : 구분자 -->
		${city} <br />
	</c:forTokens>
	
</body>
</html>