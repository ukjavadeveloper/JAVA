<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Address Details</title>
</head>
<body>
	<div align="center">
		<h3>Page 2 of 3</h3>
		<hr>
		<h3>User Address Details</h3>
		<%
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String contact = request.getParameter("contact");
		%>
		<h4>Name : <%= name %> </h4>
		<h4>Email : <%= email %></h4>
		<h4>Contact : <%= contact %></h4>
		
		<form action="preview.jsp">
			Enter City : <input type="text" name="city"><br><br>
			Enter pin code : <input type="text" name="pin"><br><br>
			<button type="submit">Next</button>
			<input type="hidden" name="name" value="<%= name %>">
			<input type="hidden" name="email" value="<%= email %>">
			<input type="hidden" name="contact" value="<%= contact %>">
		</form>
	
	</div>
</body>
</html>