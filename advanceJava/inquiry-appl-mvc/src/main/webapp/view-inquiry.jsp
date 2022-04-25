<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inquiry List</title>
</head>
<body>
	<%@ include file="menu.jsp" %>
	<div align="center">
		<table border="1">
			<thead>
				<tr>
					<th>Name</th>
					<th>Email</th>
					<th>Contact</th>
					<th>City</th>
					<th>Inquiry For</th>
					<th>Inquiry on</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="inq" items="${requestScope.inqList }">
					<tr>
						<td>${inq.name}</td>
						<td>${inq.email}</td>
						<td>${inq.contact}</td>
						<td>${inq.city}</td>
						<td>${inq.inqFor}</td>
						<td>${inq.inqdate}</td>
						<td><a href="edit-inquiry?id=${inq.id}">Edit</a> / <a href="delete-inquiry?id=${inq.id}">Delete</a></td>	
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>