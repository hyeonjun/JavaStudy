<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>fmt input : 한글 입력</title>
</head>
<body>
	<form action="fmt_result.jsp" method="post">
		<input type="text" maxlength="5" size="50" name="TEXT" placeholder="한글 입력" />
		<input type="submit" value="전송" />
	</form>
</body>
</html>