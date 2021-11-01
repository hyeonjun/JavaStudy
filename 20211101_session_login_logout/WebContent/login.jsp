<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>로그인 화면</title>
</head>

<body>
	<form action="logcheck" method="post">
		<label for="userId">아이디 : </label>
		<input type="text" name="ID" id="userId" required="required"/> <br />
		<label for="userPwd">비밀번호 : </label>
		<input type="password" name="PWD" id="userPwd" required="required"/> <br />
		<input type="submit" value="로그인" />
	</form>	

</body>
</html>