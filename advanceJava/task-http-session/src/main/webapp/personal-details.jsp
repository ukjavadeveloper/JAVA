<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>personal Details</title>
</head>
<body>
	<%
		if(session.getAttribute("name")==null){
			response.sendRedirect("login.jsp?code=401");
		}
	%>
	<%@ include file="menu.jsp" %>
	<div>
		<form action="save-user-details">
			Name : ${sessionScope.name}
			<br>
			Email : ${sessionScope.email}
			<br>
			Contact : ${sessionScope.contact}
			<br>
			City : ${sessionScope.city}
		</form>
	</div>
	<!--<div align="center">
		<form action="save-user-details">
			<input type="hidden" value="${sessionScope.id}" name="id">
			Your Name : <input type="text" value="${sessionScope.name}" name="name"><br><br>
			Email id : <input type="text" value="${sessionScope.email}" name="email"><br><br>
			Contact : <input type="text" value="${sessionScope.contact}" name="contact"><br><br>
			City : <input type="text" value="${sessionScope.city}" name="city"><br><br>
			<button type="submit">Save</button>
		</form>
	</div>-->
</body>
</html>