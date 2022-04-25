package com.inquiry.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inquiry.bean.Inquiry;
import com.inquiry.model.InquiryModel;

@WebServlet("/edit-inquiry")
public class EditInquiryController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String inquiryId = request.getParameter("id");
		int id = Integer.parseInt(inquiryId);
		
		InquiryModel model = new InquiryModel();
		Inquiry inquiry = model.editById(id);
		
		request.setAttribute("inquiry", inquiry);
		RequestDispatcher dis = request.getRequestDispatcher("editinquiry.jsp");
		dis.forward(request, response);
	}
}
