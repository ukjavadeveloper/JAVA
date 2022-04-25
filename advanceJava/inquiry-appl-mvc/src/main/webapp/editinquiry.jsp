<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Inquiry</title>
</head>
<body>
	<%@ include file="menu.jsp" %>
	<div align="center">
	<c:choose>
		<c:when test="${requestScope.code eq '201'}">
			<h4 style="color:green">Inquiry Updated successfully</h4>
		</c:when>
		<c:when test="${param.c eq '500'}">
				<h4 style="color:red">Something went wrong, Please try after some time...</h4>
			</c:when>
	</c:choose>
		<h2>Edit Inquiry Details</h2>
		<form action="update-inquiry-details" method="get">
			<input type="hidden" name="id" value="${requestScope.inq.id}">
			Name : <input type="text" name="name" value="${requestScope.inq.name}"><br></br>
			Email : <input type="text" name="email" value="${requestScope.inq.email}"><br></br>
			Contact : <input type="text" name="contact" value="${requestScope.inq.contact}"><br></br>
			city : <input type="text" name="city" value="${requestScope.inq.city}"><br></br>				<button type="submit">Update Inquiry</button>	
		</form>
	</div>
</body>
</html>