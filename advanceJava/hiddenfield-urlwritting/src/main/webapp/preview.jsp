<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Details Preview</title>
</head>
<body>
	<div align="Center">
		<h3>Page 3 of 3</h3>
		<hr>
		<%
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String contact = request.getParameter("contact");
			String city = request.getParameter("city");
			String pin_code =request.getParameter("pin");
		%>
		<h3>User Personal Details</h3>
			Name : <%= name %>
			<br>
			Email : <%= email %>
			<br>
			Contact : <%= contact %>
			
		<h3>User Address Details</h3>
			City : <%= city %>
			<br>
			Pin Code : <%= pin_code %>
			<br>	
			
			<h2><a href="register-user?name=<%=name%>&email=<%=email%>&contact=<%=contact%>&city=<%=city%>&pin=<%=pin_code%>">Submit & Save</a></h2>		
	</div>
</body>
</html>