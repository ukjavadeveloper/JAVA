<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<%
		if(session.getAttribute("name")==null){
			response.sendRedirect("login.jsp?code=401");
		}
	%>
	<%@ include file="menu.jsp" %>
	<!--<div align="right">
		Welcome ${sessionScope.name}
	</div>-->
	<h1>Welcome  to the home page</h1>
</body>
</html>

	