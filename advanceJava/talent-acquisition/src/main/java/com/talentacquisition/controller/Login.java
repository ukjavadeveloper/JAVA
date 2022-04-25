package com.talentacquisition.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.talentacquisition.bean.TAcquisition;
import com.talentacquisition.model.TAcquisitionModel;

@WebServlet("/auth-user")
public class Login extends HttpServlet {
	TAcquisitionModel model = new TAcquisitionModel();
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String pswd = request.getParameter("pswd");

		TAcquisition taq = new TAcquisition();
		taq.setEmail(email);
		taq.setPassword(pswd);
		
		TAcquisition taqs = model.loginAction(taq);
		
		HttpSession session = request.getSession();
		System.out.println( taqs.getId());
		System.out.println( taqs.getEmail());
		session.setAttribute("id", taqs.getId());
		session.setAttribute("user_name", taqs.getName());
		session.setAttribute("email", taqs.getEmail());
		response.sendRedirect("dashboard.jsp");
		
	}
}
