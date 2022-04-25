import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/validate")
public class Validate extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user_name = request.getParameter("txt_user_name");
		String user_pwd = request.getParameter("txt_pwd");
		if("admin".equals(user_name) && "admin@123".equals(user_pwd)) {
			RequestDispatcher dis = request.getRequestDispatcher("user-home");
			dis.forward(request, response);
		}else {
			response.sendRedirect("error");
		}
	}
}
