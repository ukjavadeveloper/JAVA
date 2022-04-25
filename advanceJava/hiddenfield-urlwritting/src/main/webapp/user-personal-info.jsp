<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Personal Details</title>
</head>
<body>
	<div align="center">
		<h3>Page 1 of 3</h3>
		<hr>
		<%
			String code = request.getParameter("code");
			if(code != null){
				switch(code){
				case "1" : 
					out.print("<h4 style='color:green'>Data save successfully</h4>");
					break;
				case "2" :
					out.print("<h4 style='color:red'>Fail to save data</h4>");
					break;
				case "3" : 
					out.print("<h4 style='color:red'>Somthing went wrong,try after some time</h4>");
					break;
				}
			}
		%>
		<h3>User Personal Details</h3>
		<form action="user-address-details.jsp">
			Enter Name : <input type='text' name='name'><br><br>
			Enter Email : <input type='text' name='email'><br><br>
			Enter Contact : <input type='text' name='contact'><br><br>
			<button type="submit">Next</button>
			
		</form>
	</div>
</body>
</html>