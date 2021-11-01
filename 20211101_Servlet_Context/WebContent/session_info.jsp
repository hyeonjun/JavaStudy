<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>session_info.jsp</title>
</head>
<body>
	세션의 정보를 반환하는 메서드들<br />
	<%
		String id = session.getId();
		long lastTime = session.getLastAccessedTime();
		long createTime = session.getCreationTime();
		long timeUse = lastTime - createTime;
		int inactive = session.getMaxInactiveInterval();
		boolean newSession = session.isNew();
	%>
	1. 세션의 ID : <%= id %> <br />
	2. 머문 시간 : <%= timeUse %> <br />
	3. 세션의 유효기간 : <%= inactive %> <br />
	4. 새로운 세션인가 : 
	<%
		if(newSession){
			out.println("세션이 새로 생성되었습니다.");
		} else{
			out.println("기존 세션입니다.");
		}
	%>
	
</body>
</html>