<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>cookie_read</title>
</head>
<body>
	저장된 쿠키 값을 읽어서 출력 -> request.getCookies(); -> 반환 값 = 쿠기 배열
	<br />
	
	<%
		Cookie[] cookies = request.getCookies();
		/* if (cookies != null){
			for (int i=0; i<cookies.length; i++){
				Cookie c = cookies[i];
				String cName = c.getName();
				String cValue = c.getValue();
				out.println(cName + " : " + cValue + "<br />");
			}
		} */
		
		for (Cookie c : cookies){
			out.println(c.getName() + " : " + c.getValue()+"<br />");
		}
	
	
	%>

</body>
</html>