import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/preview-details")
public class Preview extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname = request.getParameter("txt_fname");
		//String mname = request.getParameter("txt_mname");
		String lname = request.getParameter("txt_lname");
		String email = request.getParameter("txt_email");
		String gender = request.getParameter("gender");
		String prefix= gender.equals("M")?"Mr. ":"Ms. ";
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h3>Hello, "+prefix+fname+" "	+lname+" !</h3>");
		out.print("<h3>Email Id :"+email+"</h3>");
		out.close();
	}
}
