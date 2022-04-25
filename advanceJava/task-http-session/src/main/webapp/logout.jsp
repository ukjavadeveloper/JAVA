<%
	session.invalidate();
	response.sendRedirect("login.jsp?code=401");
%>