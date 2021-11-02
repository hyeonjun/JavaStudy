<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>core와 format 라이브러리 사용 (날짜)</title>
</head>
<body>
	<pre> <!-- pre 태그 : 내부 내용 형식 그대로 출력됨(띄어쓰기 등) -->
		<c:set var="now" value="<%= new java.util.Date() %>"></c:set>
		\${now } : ${now }
		<fmt:formatDate value="${now }" ></fmt:formatDate>
		날짜 : <fmt:formatDate value="${now }" type="date"/>
		시간 : <fmt:formatDate value="${now }" type="time"/>
		<fmt:formatDate value="${now }" type="both"/>
		
		<fmt:formatDate value="${now }" type="both" dateStyle="default" timeStyle="default"></fmt:formatDate>
		<fmt:formatDate value="${now }" type="both" dateStyle="short" timeStyle="short"></fmt:formatDate>
		<fmt:formatDate value="${now }" type="both" dateStyle="medium" timeStyle="medium"></fmt:formatDate>
		<fmt:formatDate value="${now }" type="both" dateStyle="long" timeStyle="long"></fmt:formatDate>
		<fmt:formatDate value="${now }" type="both" dateStyle="full" timeStyle="full"></fmt:formatDate>
		<fmt:formatDate value="${now }" pattern="yyyy년 MM월 dd일 hh:mm:ss"></fmt:formatDate>
	</pre>
	<hr />
	
	<h4>지역변경 : timezone 변경</h4>
	<pre>
		Korea KST
			<fmt:formatDate value="${now }" type="both" dateStyle="full" timeStyle="full"></fmt:formatDate>
		
		SWISS GMT
		<fmt:timeZone value="GMT">
			<fmt:formatDate value="${now }" type="both" dateStyle="full" timeStyle="full"></fmt:formatDate>
		</fmt:timeZone>
		
		NewYork GMT-8
		<fmt:timeZone value="GMT-8">
			<fmt:formatDate value="${now }" type="both" dateStyle="full" timeStyle="full"></fmt:formatDate>
		</fmt:timeZone>
	</pre>
	
	<h4>지역변경 : 화폐단위 변경</h4>
	<pre>
		톰캣 서버의 기본 로케일 : <%= response.getLocale() %>
		
		<fmt:setLocale value="ko_kr"/>
		한국어로 로케일 변경 : <%= response.getLocale() %>
		통화(currency) : <fmt:formatNumber value="10000" type="currency"></fmt:formatNumber>
		날짜 : <fmt:formatDate value="${now }"/>
		
		
		<fmt:setLocale value="ja_JP"/>
		일본어로 로케일 변경 : <%= response.getLocale() %>
		통화(currency) : <fmt:formatNumber value="10000" type="currency"></fmt:formatNumber>
		날짜 : <fmt:formatDate value="${now }"/>
		
		
		<fmt:setLocale value="en_US"/>
		영어로 로케일 변경 : <%= response.getLocale() %>
		통화(currency) : <fmt:formatNumber value="10000" type="currency"></fmt:formatNumber>
		날짜 : <fmt:formatDate value="${now }"/>
	</pre>
</body>
</html>