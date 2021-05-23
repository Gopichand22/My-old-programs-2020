package com.online.classroom.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.online.classroom.dao.GetStuListDao;
import com.online.classroom.model.StaffData;

@WebServlet("/studentslist")
public class GetStudentList extends HttpServlet {

	private static final long serialVersionUID = -7494476247745339664L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		GetStuListDao stuListDao = new GetStuListDao();
		List<StaffData> stulist = stuListDao.getstuDetails();
		request.setAttribute("all_stu", stulist);
		RequestDispatcher rd = request.getRequestDispatcher("display_students.jsp");
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
