<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Page</title>
</head>
<body>
	<h1>User Name : <%=request.getParameter("fname")%> <%=request.getParameter("mname")%> <%=request.getParameter("lname")%></h1>
	<h1>User Name : ${param.fname} ${param.mname} ${param.lname}</h1>
</body>
</html>