package com.online.classroom.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.online.classroom.dao.GetStaffListDao;
import com.online.classroom.model.StaffData;

@WebServlet("/stafflist")
public class GetStaffList extends HttpServlet {

	private static final long serialVersionUID = -4330522232938018542L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		GetStaffListDao staffListDao = new GetStaffListDao();
		List<StaffData> stafflist = staffListDao.getstaffDetails();
		request.setAttribute("all_staff", stafflist);
		RequestDispatcher rd = request.getRequestDispatcher("display_staff.jsp");
		try {
			rd.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}