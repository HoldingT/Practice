<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>JSTL 테스트</title>
</head>
<body>
	>
	<h2>&lt; c:forEach&gt; &lt; c:forTokens&gt; 태그</h2>
	<hr>
	<h3>[ 맵 ]</h3>
	<c:set var="map" value="<%= new java.util.HashMap<String, String>() %>" />
	<c:set target="${map}" property="st1" var="듀크" />
	<c:set target="${map}" property="st2" var="둘리" />
	<c:set target="${map}" property="st3" var="또치" />
	
	<c:forEach var="data" items="${map}">
		[ ${data.key} = ${data.value} ]
	</c:forEach>
	
	<h3>[ 배열 ]</h3>
	<c:set var="intArray" value="<%= new int[]{ %>{map}">
		[ ${data.key} = ${data.value} ]
	</c:forEach>
	
	<c:set var="color" value="green-session" scope="session"/>
	<c:set var="color" value="yellow-application" scope="application"/>
	color = ${color} <br>
	pageScope.color = ${pageScope.color}<br>
	requestScope.color = ${requestScope.color}<br>
	sessionScope.color = ${sessionScope.color}<br>
	applicationScope.color = ${applicationScope.color}<br>
</body>
</html>