<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<table border="1">
	<tr>Id</tr>
	<tr>Name</tr>
	<tr>Email</tr>

<%
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd27sept","root","root");
		PreparedStatement pstmt = con.prepareStatement("select * from employee;");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			out.print("<tr>");
				out.print("<td>"+rs.getInt("emp_id")+"</td>");
				out.print("<td>"+rs.getString("emp_name")+"</td>");
				out.print("<td>"+rs.getString("emp_email")+"</td>");
			out.print("</tr>");
		}
		con.close();
	}catch(Exception e){
		e.printStackTrace();
	}
%>
</table>
<h2>===================================JSTL Sql Tag=======================================</h2>	
<h4>Employee List</h4>
<s:setDataSource var="conn"  
	driver="com.mysql.cj.jdbc.Driver" 
	url="jdbc:mysql://localhost:3306/fsd27sept" 
	user="root" 
	password="root"/>	
<s:query dataSource="${conn}" var="rsData" sql="select * from employee"></s:query>
< <c:out value=""></c:out>
<table border="1">
  <tr>
    <th>Id</th>
    <th>Name</th>
    <th>Email</th>
  </tr>
	<c:forEach var="data" items="${rsData.rows}">
		<tr>
			<td>${data.emp_id}</td>
			<td>${data.emp_name}</td>
			<td>${data.emp_email}</td>
		</tr>
	</c:forEach>
</table>
<c:out value="${e}" ></c:out>
	
	
	
