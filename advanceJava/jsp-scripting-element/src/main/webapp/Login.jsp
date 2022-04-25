<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login Page</title>
</head>
<body>
	<div align='center'>
		<h3>User Login</h3>
		<%
			String msg= request.getParameter("msg");
			if(msg!=null){
				out.print("<h3 style='color:red;'>"+msg+"</h3>");
			}
		%>
		<form action="Validate.jsp">
			Enter user name : <input type="text" name="uname"><br><br>
			Enter password : <input type="password" name="pwd"><br><br>
			<button type="submit">Login</button>
		</form>	
	</div>
</body>
</html>