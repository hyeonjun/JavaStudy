<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>EL : 산술 연산 및 비교 결과 출력</title>
</head>
<body>
    <!-- \${ } \를 붙여서 쓰면 연산하지 않고 그대로 출력한다 -->
	\${5+2} : ${5+2 } <br />
	\${5/2} : ${5/2 } <br />
	\${5 mod 2} : ${5 mod 2 } <br />
	\${5 > 2} : ${5 > 2 } <br />
	\${5 gt 2} : ${5 gt 2 } <br />
	\${ (5 > 2) || (2 < 10)} : ${(5 > 2) || (2 < 10)} <br />
	\${5 > 2 ? 5 : 2} : ${5 > 2 ? 5 : 2} <br />
	
	<%
		String input = null;
	%>
	\${empty input } : ${empty input }
	
</body>
</html>