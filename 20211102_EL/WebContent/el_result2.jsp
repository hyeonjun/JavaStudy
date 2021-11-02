<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>el_result : </title>
</head>
<body>
	1. == 비교 연산자 결과 : ${param.id == "admin"} <br />
	2. equals() 결과 : ${param.id.equals("admin") } <br />
	3. null 값 확인 : ${empty param.id } <br />
	
</body>
</html>