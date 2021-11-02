<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>자바 빈(beans) 객체를 다루는 액션 태그</title>
</head>
<body>
	<h4>1. Spring의 의존성 주입</h4>
	<h4>2. Spring의 데이터베이스 자동 매핑</h4>
	<h4>3. Spring의 관점 지향(AOP) : 공통 라이브러리 개발</h4>
	
	<jsp:useBean id="member" class="com.encore.beans.MemberBean"></jsp:useBean>
	이름 : <%= member.getName() %> <br />
	아이디 : <%= member.getUserid() %> <br />
	
	<%
		member.setName("홍길동");
		member.setUserid("encore");
	%>
	
	변경 후 이름 : <%= member.getName() %> <br />
	변경 후 아이디 : <%= member.getUserid() %> <br />
	
	
</body>
</html>