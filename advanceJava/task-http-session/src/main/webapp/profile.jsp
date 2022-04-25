<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile Page</title>
</head>
<body>
	<%
		if(session.getAttribute("name")==null){
			response.sendRedirect("login.jsp?code=401");
		}
	%>
	<%@ include file="menu.jsp" %>
	<div>
		<a href="personal-details.jsp">Personal Details</a><br><br>
		<a href="educational-details.jsp">Education Details</a>
	</div><br>
	<div>
		Name : ${sessionScope.name}
		<br>
		Email : ${sessionScope.email}
		<br>
		Contact : ${sessionScope.contact}
		<br>
		City : ${sessionScope.city}
	</div>
</body>
</html>