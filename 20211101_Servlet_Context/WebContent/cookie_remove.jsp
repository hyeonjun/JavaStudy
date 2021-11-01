<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>cookie_remove</title>
</head>
<body>
	쿠키를 수정하거나 삭제(제거)하는 별도의 메서드는 존재하지않는다. <br />
	쿠키를 수정할 경우에는 동일한 쿠키명을 가진 쿠키객체를 생성하여 덮어쓰면 된다. <br />
	쿠키를 삭제할 경우에는 쿠키의 유효기간을 설정해야 한다. <br/>
	(참고 : 쿠키의 기본 유효기간 값은 -1 => 웹 브라우저가 종료되면 자동 소멸)
	<%
		Cookie c = new Cookie("ID", "test");
		c.setMaxAge(0);
		response.addCookie(c);
	
	%>



</body>
</html>