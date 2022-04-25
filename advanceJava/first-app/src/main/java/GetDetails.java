import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/process-details")
public class GetDetails extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String gender = request.getParameter("gender");
		String prefix="unknown";
		if("M".equals(gender)) {
			prefix = "Mr.";
		}else {
			prefix = "Ms.";
		}
		request.setAttribute("prefix", prefix);
		RequestDispatcher dispatch = request.getRequestDispatcher("show-details");
		dispatch.forward(request, response);
	}
}
