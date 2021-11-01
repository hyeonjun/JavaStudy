<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Enumeration" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>session_readAll</title>
</head>
<body>
	세션에 저장되어 있는 모든 데이터를 한번에 읽기 : session 내장 객체의 getAttributeNames() <br />
	
	<%
		Enumeration<String> names = session.getAttributeNames();
		// Enumeration객체.hasMoreElements() : 읽을 수 있는 데이터가 존재할 경우에만 true
		while(names.hasMoreElements()){
			String name = names.nextElement().toString();
			String value = session.getAttribute(name).toString();
			out.println(name + " : " + value + "<br />");
		}	
		
	%>
	
	
</body>
</html>