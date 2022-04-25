import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register-user")
public class RegisterUser extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String pass = request.getParameter("pass");
		//String statuscode = "2";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd27sept","root","root");
			PreparedStatement stmt = con.prepareStatement("insert into user_info values(?,?,?,?)");
			stmt.setString(1, name);
			stmt.setString(2, email);
			stmt.setString(3, contact);
			stmt.setString(4, pass);
			int count = stmt.executeUpdate();
			con.close();
			if(count==1) {
				response.sendRedirect("sign-in.jsp?code=1");
			}else {
				response.sendRedirect("sign-up.jsp?code=403");
			}
			con.close();
		}catch(Exception e) {
			//statuscode = "3";
			e.printStackTrace();
			response.sendRedirect("sign-up.jsp?code=500");
		}
	}
}
