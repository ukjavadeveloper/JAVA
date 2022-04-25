<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DashBoard</title>
</head>
<body>
	<%
		if(session.getAttribute("id")==null){
			response.sendRedirect("login.jsp?code=401");
		}
	%>
	<div align="right">
		<h4>Welcome User, ${sessionScope.user_name} </h4>
		<h4><a href="login.jsp">Logout</a></h4>
	</div>
	<div align="center">
		<h1>Hello user, to home page....</h1>
	</div>
</body>
</html>