<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>유저 화면</title>
</head>
<body>
	사용자님 환영합니다. <br>
	전달된 파라미터 : <span style="color:red;">
	<%= request.getParameter("message") %></span>
</body>
</html>