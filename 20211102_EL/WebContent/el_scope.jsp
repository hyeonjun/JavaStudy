<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	pageContext.setAttribute("name", "page name");
	request.setAttribute("name", "request name");
	session.setAttribute("name", "session name");
	application.setAttribute("name", "application name");
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>데이터를 저장한느 변수에 대한 Scope</title>
</head>
<body>
	pageContext (현 페이지 내) : ${name } <br />
	request (request 객체 내 선언) : ${requestScope.name } <br />
	session (웹 서버(프로젝트 내)의 임시 저장소 내 선언) : ${sessionScope.name } <br />
	application (애플리케이션 내 선언) : ${applicationScope.name } <br />
	param (외부로부터 전달받은 파라미터) : ${param.name} <br />	
	
</body>
</html>