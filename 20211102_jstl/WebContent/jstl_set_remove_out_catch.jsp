<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>JSTL SET, REMOVE, OUT, CATCH</title>
</head>

<body>
	<h2>1. set 태그를 이용하여 변수 및 초기값 설정</h2>
	<c:set var="age" value="30" scope="page"></c:set>
		 
		 
	<h2>2. 설정된 변수 값 출력</h2>
	나이 : <c:out value="${age} "></c:out>
	
	<h2>3. 변수 제거</h2>
	<c:remove var="age" scope="page"/>
	제거된 변수 확인 : <c:out value="${age} "></c:out>
	
	<h2>4. 오류를 발생하여 예외처리</h2>
	<c:catch var="errMsg">
		예외발생 전 <br />
		<%= 1/0 %> <br />
		예외발생 후 <br />
	</c:catch>
	<c:out value="${errMsg} "></c:out>
</body>
</html>