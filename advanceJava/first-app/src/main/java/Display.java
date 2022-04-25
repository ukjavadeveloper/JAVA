import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/display-message")
public class Display extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");// you can set the type of response return to the user. Also Known as MIME type
		PrintWriter out = response.getWriter();
		String msg = request.getParameter("msg");
		out.print("<h1>Your Message is : "+ msg +"</h1>");
		out.close();
		
	}
}
