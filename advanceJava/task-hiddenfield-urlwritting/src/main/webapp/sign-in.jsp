<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>
</head>
<body>
	<div align="center">
			<%
			String code = request.getParameter("code");
			if(code != null){
				switch(code){
				case "1" : 
					out.print("<h4 style='color:green'>Data save successfully, Please signin</h4>");
					break;
				case "403" :
					out.print("<h4 style='color:red'>invalid Login Details</h4>");
					break;
				case "500" : 
					out.print("<h4 style='color:red'>Somthing went wrong,try after some time</h4>");
					break;
				}
			}
		%>
		<h1>account sign in</h1>
			<form action="auth-user">
				Email Address : <input type="text" name="email"><br><br>
				Password : <input type="password" name="pass"><br><br>
				<button type="submit">Login</button>
				<h3><a href="sign-up.jsp">Not Yet Register?</a></h3>
			</form>
	</div>
</body>
</html>