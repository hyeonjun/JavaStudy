<%@page import="com.encore.beans.MemberBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>JSTL_set : set 태그</title>
</head>
<body>
	변수 설정 <br />
	
	<c:set var="msg" value="hello"></c:set>
	${msg }
	<hr />
	
	<c:set var="age">100</c:set>
	${age }
	<hr />
	
	<c:set var="add" value="${10 + 5 }"></c:set>
	${add }
	<hr />
	
	<c:set var="flag" value="${10 > 5 }"></c:set>
	${flag }	
	<hr />
	
	<h4>객체(MemberBean)의 멤버 변수 값 설정</h4>
	1. MemberBean 클래스를 이용하여 객체를 생성 <br />
	<%-- page 지시자를 이용하여 import 하지않았을 경우 <br />
	<c:set var="member" value="<%= new com.encore.beans.MemberBean() %>"></c:set> --%>
	<c:set var="member" value="<%= new MemberBean() %>"></c:set>
	2. 객체의 각 멤버 변수에 값을 설정 <br />
	<c:set target="${member }" property="name" value="홍길동"></c:set>
	<c:set target="${member }" property="userid">abc123</c:set>
	\${member } : ${member } <br />
	위와 같이 객체를 출력하게 되면 해당 객체 내의 toString() 메서드가 자동 호출되어 각 멤버 변수의 값을 확인할 수 있다.<br />
	단, toString() 메서드를 Override 했을 경우에만 가능
	
</body>
</html>