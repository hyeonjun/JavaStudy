<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>이름과 혈액형을 선택하는 화면 : bloodtype.jsp</title>
</head>
<body>
<!-- <form action="result.jsp" method="post"> -->
	<form action="result" method="post">
		이름 : <input type="text" name="name" required="required" /> <br />
		혈액형 <br />
		<input type="radio" name="bloodtype" value="a" /> A형 <br />
		<input type="radio" name="bloodtype" value="b" /> B형 <br />
		<input type="radio" name="bloodtype" value="ab" /> AB형 <br />
		<input type="radio" name="bloodtype" value="o" /> O형 <br />
		<input type="submit" value="전송" />
	</form>
</body>
</html>