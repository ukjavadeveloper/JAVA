<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Education details Page</title>
</head>
<body>
	<%
		if(session.getAttribute("name")==null){
			response.sendRedirect("login.jsp?code=401");
		}
	%>
	<%@ include file="menu.jsp" %>
	<div algin="center">
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
					out.print("<h4 style='color:red'>Fail to save data</h4>");
					break;
				case "500" : 
					out.print("<h4 style='color:red'>Somthing went wrong,try after some time</h4>");
					break;
				}
			}
		%>
		<form action="save-education-details">
			<input type="hidden" name="id" value="${sessionScope.id}"><br><br>
			Higher Degree : <input type="text" name="hdegree"><br><br>
			Passing Year : <input type="text" name="pyear"><br><br>
			College Name : <input type="text" name="clg"><br><br>
			Percentage : <input type="text" name="percentage"><br><br>
		</form>
	</div>
</body>
</html>