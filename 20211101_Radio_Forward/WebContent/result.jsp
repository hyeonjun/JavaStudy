<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>전달 받은 혈액혀을 포워딩 시키는 파일 : result.jsp</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		String bloodTypeFile = request.getParameter("bloodtype") + ".jsp";
		// out.println(bloodTypeFile);
	%>
	<jsp:forward page="<%= bloodTypeFile %>"></jsp:forward>
</body>
</html>