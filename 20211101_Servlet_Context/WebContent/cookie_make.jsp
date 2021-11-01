<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 1. Cookie 객체 생성 : Cookie 클래스 예) new Cookie("쿠키명", "저장값");
	Cookie c = new Cookie("id","test");
	
	
	// 2. 쿠키 유효기간 설정 : 웹 브라우저로 내보내기 전에 설정 예) 쿠키객체.setMaxAge(초);
	c.setMaxAge(365*24*60*60); // 1년간 유효
	
	// 3. 클라이언트(웹 브라우저) 쿠키 전송 : response 내장 객체의 addCookie(쿠키객체)
	response.addCookie(c);
	
	// 4. 쿠키객체를 생성ㅎ여 바로 내보낼 경우 (단, 유효기간은 설정하지 않은 경우)
	response.addCookie(new Cookie("pwd", "1234"));
	response.addCookie(new Cookie("age", "22"));
	response.addCookie(new Cookie("name", "홍길동"));
	
	
	
/*
	Cookie cookie1 = new Cookie("first", "First_Cookie");
	response.addCookie(cookie1);
	
	Cookie cookie2 = new Cookie("second", "Second_Cookie");
	response.addCookie(cookie2);
	
	Cookie cookie3 = new Cookie("third", "Third_Cookie");
	response.addCookie(cookie3);
*/

%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>cookie_make</title>
</head>
<body>
	쿠키 생성


</body>
</html>