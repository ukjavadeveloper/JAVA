import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/get-message")
public class Message extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<h1>hello user please provide your message</h1>");
		out.print("<form action='display-message'>");
			out.print("Message : <input type='text' name='msg'>");
			out.print("<br/>");
			out.print("<input type='submit' value='send message'>");
		out.print("</form>");		
		
		out.close();
	}
}


