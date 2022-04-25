<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login Page</title>
</head>
<body>
	<div align="center">
		<%
			String code = request.getParameter("code");
			if(code != null){
				switch(code){
				case "201" : 
					out.print("<h4 style='color:green'>You have logged out successfully....</h4>");
					break;
				case "403" : 
					out.print("<h4 style='color:red'>Invalid user name or password</h4>");
					break;
				case "500" :
					out.print("<h4 style='color:yellow'>something went wrong please, try after some time..</h4>");
					break;
				}	
			}
		%>
		<form action="validate-me">
			Enter user name : <input type="text" name="uname" placeholder="Your email id"><br><br>
			Enter Password : <input type="password" name="upass" placeholder="your password"><br><br>
			<button type="submit">Sign-In</button>
		</form>
	</div>
</body>
</html>