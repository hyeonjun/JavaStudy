<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	공유 데이터 확인<br />
	첫 번째 서블릿 확인 <a href="servlet1">첫 번재 서블릿 테스트</a><br />
	<jsp:include page="page.jsp" flush="true" >
		<jsp:param name="no" value="22"/>
		<jsp:param name="search" value="spring framework"/>
	</jsp:include>
	
	
	두 번째 서블릿 확인 <a href="servlet2">두 번재 서블릿 테스트</a><br />
	


<%-- 	
	<jsp:forward page="page.jsp">
		<jsp:param name="no" value="22"/>
		<jsp:param name="search" value="spring framework"/>
	</jsp:forward>
--%>

<%-- 	
	<%
		// jsp 또는 서블릿으로 바로 이동
		response.sendRedirect("page.jsp?no=1&search=spring");
	%>
--%>	
</body>
</html>