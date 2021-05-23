package com.online.classroom.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.online.classroom.dao.GetStaffSubListDao;
import com.online.classroom.model.StaffSubData;

@WebServlet("/staff_subjects")
public class GetStaffAndSubjects extends HttpServlet {

	private static final long serialVersionUID = -5864598426207621029L;

	public void doGet(HttpServletRequest request, HttpServletResponse response){
		GetStaffSubListDao staffSubListDao = new GetStaffSubListDao();
		List<StaffSubData> staffSublist = staffSubListDao.getstaffSubDetails();
		request.setAttribute("all_staffSub", staffSublist);
		RequestDispatcher rd = request.getRequestDispatcher("staff_crud.jsp");
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
