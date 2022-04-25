package com.inquiry.controller;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inquiry.bean.Inquiry;
import com.inquiry.model.InquiryModel;

@WebServlet("/view-all-inqueries")
public class ViewController extends HttpServlet {
	InquiryModel model = new InquiryModel();
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Inquiry> list = model.getAll();
		request.setAttribute("inqList", list);
		RequestDispatcher dis = request.getRequestDispatcher("view-inquiry.jsp");
		dis.forward(request, response);
	}
}
