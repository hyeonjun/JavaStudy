<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>session_read.jsp</title>
</head>
<body>
	세션에 저장된 데이터 읽기 : session 내장 객체의 getAttribute("이름") => Object 타입으로 반환<br />
	읽어들인 세션 데이터는 반드시 원래의 형변환이 필요 <br />
	
	<%
		String id = (String)session.getAttribute("ID");
		String pw = (String)session.getAttribute("PW");
		String name = (String)session.getAttribute("NAME");
	%>
	
	아이디 : <%= id %> <br />
	비밀번호 : <%= pw %> <br />
	이름 : <%= name %> <br />
	
</body>
</html>