import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/search-result")
public class Result extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String searchdetails = request.getParameter("q");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>Your Search query is : "+searchdetails+"</h1>");
		
		Cookie ck = new Cookie("presearch",searchdetails);//create cookie here
		ck.setMaxAge(40*60*60);//set expire time for cookie
		response.addCookie(ck);//can send the cookie to the client side
	}
}
