package com.inquiry.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inquiry.bean.Inquiry;
import com.inquiry.model.InquiryModel;
@WebServlet("/update-inquiry-details")
public class UpdateInquiryController extends HttpServlet {
	InquiryModel model =  new InquiryModel();
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String city = request.getParameter("city");
		
		Inquiry inq = new Inquiry();
		inq.setName(name);
		inq.setContact(contact);
		inq.setEmail(email);
		inq.setCity(city);
		Date currentdate = new Date(System.currentTimeMillis());
		inq.setInqdate(currentdate);
		
		boolean flag = model.updateInquiry(inq);
		if(flag) {
			response.sendRedirect("editinquiry.jsp?c=201");
		} else {
			response.sendRedirect("editinquiry.jsp?c=500");
		}
		
	}
}
