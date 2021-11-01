<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Enumeration" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>sesson_remove</title>
</head>
<body>
	세션 데이터 <br />
	<%
		session.setAttribute("s1", "s_1");
		session.setAttribute("s2", "s_2");
		session.setAttribute("s3", "s_3");
		
		out.println("세션 삭제 전 <br />");
		Enumeration<String> names = session.getAttributeNames();
		while(names.hasMoreElements()){
			String name = names.nextElement().toString();
			String value = session.getAttribute(name).toString();
			out.println(name + " : " + value + "<br />");
		}
	%>
	
	<hr />
	삭제 후 세션 데이터 <br />
	<%
		session.removeAttribute("s2");
		names = session.getAttributeNames();
		while(names.hasMoreElements()){
			String name = names.nextElement().toString();
			String value = session.getAttribute(name).toString();
			out.println(name + " : " + value + "<br />");
		}
	%>
	<hr />
	모든 세션 데이터 삭제<br />
	<%
		session.invalidate(); // 완전 종료 시 아래 코드에서 오류 발생함.
		/* names = session.getAttributeNames();
		if(names.hasMoreElements()) {
			out.println("세션이 존재합니다.");
		} else{
			out.println("존재하는 세션이 없습니다.");
		} */
	%>
</body>
</html>