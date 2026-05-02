<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>JSP의 내장 객체들</title>
</head>
<body>
	<h2>JSP 내장 객체 점검</h2>
	[ request ]<br>
	getMethod() : <%= request.getMethod() %><br>
	getRequestURI() : <%= request.getRequestURI() %><br>
	getHeader("user-agent") : <%= request.getHeader("user-agent") %><br>
	[ application ]<br>
	getContextPath() : <%= application.getContextPath() %><br>
	getServletContextName() : <%= application.getServletContextName() %><br>
	getServletInfo() : <%= application.getServerInfo() %><br>
	getMajorVersion() : <%= application.getMajorVersion() %><br>
	getSessionTimeout() : <%= application.getSessionTimeout() %><br>
	[ session ]<br>
	getId() : <%= session.getId() %><br>
	getCreationTime() : <%= new Date(session.getCreationTime()) %><br>
	[ response ]<br>
	getStatus() : <%= response.getStatus() %><br>
	getBufferSize() : <%= response.getBufferSize() %><br>
	getContentType() : <%= response.getContentType() %><br>
	<H4>Web Application(/jspexam) 폴더의 파일리스트 </H4>
	<%
	java.util.Set<String> list = application.getResourcePaths("/");
	if(list != null){
		Object obj[] = list.toArray();
		for (int i=0;i<obj.length; i++){
			out.print(obj[i]+", ");
		}
	}
	%>
</body>
</html>