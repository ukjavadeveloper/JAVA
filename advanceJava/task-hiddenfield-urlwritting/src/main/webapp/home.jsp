<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String name = (String)request.getAttribute("name");
		String email = request.getParameter("email");
	%>
	<div align="center">
		<h1>Welcome, <%=name%> </h1>
		<h2>You Logged in by email : <%=email%></h2>
	</div>
</body>
</html>