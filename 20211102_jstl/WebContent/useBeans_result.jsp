<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<% request.setCharacterEncoding("UTF-8"); %>

<jsp:useBean id="member" class="com.encore.beans.MemberBean"></jsp:useBean>
<jsp:setProperty property="*" name="member"></jsp:setProperty>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>전달된 파라미터 명과 MemberBean의 멤버 변수 자동 매핑</title>
</head>
<body>
	<h2>입력된 값을 Member 객체로부터 추출</h2>
	<table>
		<tr>
			<td>이름</td>
			<td><jsp:getProperty property="name" name="member" /></td>
		</tr>

		<tr>
			<td>아이디</td>
			<td><jsp:getProperty property="userid" name="member" /></td>
		</tr>

		<tr>
			<td>별명</td>
			<td><jsp:getProperty property="nickname" name="member" /></td>
		</tr>

		<tr>
			<td>비밀번호</td>
			<td><jsp:getProperty property="pwd" name="member" /></td>
		</tr>

		<tr>
			<td>이메일</td>
			<td><jsp:getProperty property="email" name="member" /></td>
		</tr>

		<tr>
			<td>연락처</td>
			<td><jsp:getProperty property="phone" name="member" /></td>
		</tr>
	</table>

</body>
</html>