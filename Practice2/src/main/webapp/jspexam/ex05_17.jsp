<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>요청 방식에 따른 처리</title>
	<style>
	input {
		margin : 3px;
	}
	</style>
</head>
<body>
	<% if (request.getMethod().equals("GET")) { %> 
		<h2>원하는 컬러와 날짜를 선택</h2>
		<form method="post" action="/Practice/jspexam/ex05_17.jsp">
		컬러 : <input type="color" name="fcolor" ><br>
		날짜 : <input type="date" name="fdate"><br>
		<input type = "submit" value="전송">
		</form>
	%>}else { %>
		<sciprt>
		document.body.style.backgroundColor = '<%= request.getParameter("fcolor") %>";
		</sciprt>
		<h2>선택 날짜는 <%= request.getParameter("fdate") %> 입니다.</h2>
	<% } %>
</body>
</html>