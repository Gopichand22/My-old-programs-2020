package com.online.classroom.controller;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.online.classroom.dao.LoginDao;
import com.online.classroom.model.Login;

@WebServlet("/login")
public class LoginMe extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginMe() {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) {

		String emaill = request.getParameter("email");
		String password = request.getParameter("login_pass");
		String role = request.getParameter("role");

		Login login = new Login();
		LoginDao loginDao = new LoginDao();

		login.setUserName(emaill);
		login.setPassword(password);
		login.setRole(role);

		try {
			String userValidate = loginDao.validateUser(login);

			if (userValidate.equals("admin")) {

				HttpSession session = request.getSession();
				session.setAttribute("admin", emaill);
				request.setAttribute("userName", emaill);

				request.getRequestDispatcher("admin.jsp").forward(request, response);

			} else if (userValidate.equals("staff")) {

				HttpSession session = request.getSession();
				session.setAttribute("staff", emaill);
				request.setAttribute("userName", emaill);

				request.getRequestDispatcher("staff.jsp").forward(request, response);

			} else if (userValidate.equals("student")) {

				HttpSession session = request.getSession();
				session.setAttribute("student", emaill);
				request.setAttribute("userName", emaill);

				request.getRequestDispatcher("index.jsp").forward(request, response);

			} else {
				System.out.println("Error message = " + userValidate);
				request.setAttribute("errMessage", userValidate);

				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
}