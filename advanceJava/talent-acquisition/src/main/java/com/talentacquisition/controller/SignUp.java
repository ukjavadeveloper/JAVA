package com.talentacquisition.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.talentacquisition.bean.TAcquisition;
import com.talentacquisition.model.TAcquisitionModel;

@WebServlet("/register-user")
public class SignUp extends HttpServlet {
	TAcquisitionModel model = new TAcquisitionModel();
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("txt");
		String email = request.getParameter("email");
		String pswd = request.getParameter("pswd");
		
		TAcquisition taq = new TAcquisition();
	
		taq.setName(name);
		taq.setEmail(email);
		taq.setPassword(pswd);
		
		boolean flag = model.save(taq);
		
		if(flag) {
			response.sendRedirect("login.jsp?c=201");
		} else {
			response.sendRedirect("login.jsp?c=500");
		}
	}
}
