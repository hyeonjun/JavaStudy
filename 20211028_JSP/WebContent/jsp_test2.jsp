<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>자바 변수, 메서드 선언 및 출력</title>
</head>

<body>
	<%! // 현 페이지 전역에서 사용할 선수 선언
		int i = 10;
		String str = "ABCDE";
	%>
	
	<%! // 현 페이지에서 사용할 메서드 선언
		public int sum(int a, int b){
			return a+b;
		}
	%>
	
	<%
		out.println("i = "+ i+"<br />");
		out.println("str = "+str+"<br />");
		out.println("1 + 2 = "+sum(1, 2)+"<br />");
	%>
	<hr />
	<table border="1">
		<tr><td><%= i %></td></tr>
		<tr><td><%= str %></td></tr>
		<tr><td><%= sum(1, 2) %></td></tr>
	</table>
	
	
	

</body>
</html>