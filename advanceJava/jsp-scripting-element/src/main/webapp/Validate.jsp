<%
	String uname = request.getParameter("uname");
	String pwd = request.getParameter("pwd");
	if("admin".equals(uname) && "admin123".equals(pwd)){
		RequestDispatcher dis = request.getRequestDispatcher("Home.jsp");
		dis.forward(request, response);
	}else{
		response.sendRedirect("Login.jsp?msg=InvalidUser");
	}
%>