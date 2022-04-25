import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/show-details")
public class DisplayDetails extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("txt_fname");
		String middleName = request.getParameter("txt_mname");
		String lastName = request.getParameter("txt_lname");
		String prefix = (String)request.getAttribute("prefix");//casting explicit
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>Hello, "+prefix+" "+firstName+" "+middleName+" "+lastName+"!</h1>");
		
		out.close();
	}
}
