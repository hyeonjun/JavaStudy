<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Arrays" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	
	<%
		int[] arr = {10, 30, 20};
		Arrays.sort(arr);
		out.println(Arrays.toString(arr)+"<br />");
		
	
	%>
	
</body>
</html>