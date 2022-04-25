<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body>
	<div align="center">
				<%
			String code = request.getParameter("code");
			if(code != null){
				switch(code){
				case "201" : 
					out.print("<h4 style='color:green'>Data save successfully</h4>");
					break;
				case "403" :
					out.print("<h4 style='color:red'>Fail to save data</h4>");
					break;
				case "500" : 
					out.print("<h4 style='color:red'>Somthing went wrong,try after some time</h4>");
					break;
				}
			}
		%>
		<h1>Create Your Account</h1>	
		<h3>Already have an Account?<a href="login.jsp">Sign in</a></h3>
		<form action="register-user">
			Enter your Name : <input type="text" name="uname"><br><br>
			Enter your Email Id : <input type="text" name="email"><br><br>
			Enter your Password : <input type="password" name="pass"><br><br>
			Enter your Contact : <input type="text" name="contact"><br><br>
			Enter your City : <input type="text" name="city"><br><br>
			<button type="submit">Signup</button>
		</form>
	</div>
</body>
</html>