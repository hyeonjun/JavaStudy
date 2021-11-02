<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>el_result : 사용자 입력 출력</title>
</head>
<body>
	기존 JSP 방식 <br />
	<%= request.getParameter("EMAIL") %> <br />
	<%= request.getParameter("URL") %> <br />
	<hr />
	EL 방식 1 : ${param.파라미터명 } <br />
	${param.EMAIL} <br />
	${param.URL}  <br />
	<hr />
	EL 방식 2 : \${param["파라미터명"] } <br />
	${param["EMAIL"]} <br />
	${param["URL"]}  <br />
</body>
</html>