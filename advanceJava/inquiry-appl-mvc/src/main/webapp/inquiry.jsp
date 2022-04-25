<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inquiry Form</title>
</head>
<body>
	<%@ include file="menu.jsp" %>
	<div align="center">
		<h3>Inquiry Form</h3>
		<c:choose>
			<c:when test="${param.c eq '201'}">
				<h4 style="color:green">Inquiry Created successfully</h4>
			</c:when>
			<c:when test="${param.c eq '500'}">
				<h4 style="color:red">Something went wrong, Please try after some time...</h4>
			</c:when>
			<c:when test="${param.c eq '501' }">
				<c:forEach var="msg" items="${requestScope.errorList}">
					<span style="color: red;">${msg}</span><br>
				</c:forEach>
			</c:when>
		</c:choose>
		
		<form action="create-inquiry" method="post">
			Enter Name : <input type="text" name="name"><br><br>
			Enter Contact : <input type="text" name="contact"><br><br>
			Enter Email : <input type="text" name="email"><br><br>
			Enter City : <input type="text" name="city"><br><br>
			Inquiry For : <input type="checkbox" value="java" name="inqfor">
						  <label>Java</label>
						  <input type="checkbox" value="FSD-Java" name="inqfor">
						  <label>FSD-Java</label><br>
						  <input type="checkbox" value="python" name="inqfor">
						   <label>Python</label>
						  <input type="checkbox" value="Testing" name="inqfor">
						  <label>Testing</label>
						  <input type="checkbox" value="ASP.Net" name="inqfor">						  
						  <label>ASP.Net</label><br><br>
			<button type="submit">Save Details</button>
			<button type="reset">Reset</button>
		</form>
	</div>
</body>
</html>