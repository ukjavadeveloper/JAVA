<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Cookie cks[] = request.getCookies();
		String value = "";
		if(cks != null){
			for(Cookie c:cks){
				if("presearch".equals(c.getName())){
					value = c.getValue();
				}
			}
		}
	%>
	<div align="center">
		<h3>Your Last Search is : <%=value%></h3>
	</div>
	<div align="center">
		<form action="search-result">
			Search : <input type="text" name="q"><br><br>
			<button type="submit" >Get Result</button>
		</form>
	</div>
</body>
</html>