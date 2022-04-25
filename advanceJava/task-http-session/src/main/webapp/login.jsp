<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<div align="center">
			<%
			String code = request.getParameter("code");
			if(code != null){
				switch(code){
				case "201" : 
					out.print("<h4 style='color:green'>Data save successfully, Please signin</h4>");
					break;
				/*case "401" : 
					out.print("<h4 style='color:green'>You are successfully logged out!</h4>");
					break;*/
				case "403" :
					out.print("<h4 style='color:red'>invalid Login Details</h4>");
					break;
				case "500" : 
					out.print("<h4 style='color:red'>Somthing went wrong,try after some time</h4>");
					break;
				}
			}
		%>
		<form action="user-auth">
			Enter user name : <input type="text" name="uname" placeholder="your email id"><br><br>
			Enter password : <input type="password" name="pass" placeholder="your password"><br><br>
			<button type="submit">Signin</button>
			<h3><a href="register.jsp">Not Yet Register?</a></h3>
		</form>
	</div>
</body>
</html>