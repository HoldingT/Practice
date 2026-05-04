<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>에러 페이지</title>
</head>
<body>
	<h2>오류 발생</h2>
	<h3>빠른시일내 복구</h3>
	<img src="error.jpg">
	<%
	String msg = "오류 원인: " + exception;
	System.out.println("---------------");
	System.out.println(msg);
	System.out.println("---------------");
	exception.printStackTrace();
	%>
</body>
</html>