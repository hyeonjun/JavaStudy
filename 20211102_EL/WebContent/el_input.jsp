<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>el_Input : 사용자 입력</title>
</head>
<body>
	<form action="el_result.jsp">
		<input type="email" name="EMAIL" required="required" />
		<input type="url" name="URL" required="required" />
		<input type="submit" value="전송" />
	</form>
</body>
</html>