package com.online.classroom.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterMe")
public class RegisterMe extends HttpServlet {
	private static final String URL = "jdbc:mysql://localhost:3306/virtual_classroom_db";
	private static final String USER_ID = "root";
	private static final String PASS = "087722";
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

	private static Connection con = null;
	private static PreparedStatement pStatement = null;

	private static final long serialVersionUID = 6789909920189781934L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		String user = req.getParameter("name");
		String email = req.getParameter("email");
		String pwd = req.getParameter("pass");
		String confirmPwd = req.getParameter("cpass");
		String role = req.getParameter("role");

		if (user.isEmpty() || email.isEmpty() || pwd.isEmpty() || confirmPwd.isEmpty()) {
			req.setAttribute("errorMessage", "Enter data/Invalid credentials");
			try {
				res.sendRedirect("register_choose.jsp");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			if (role.equals("staff")) {
				try {
					Class.forName(DRIVER);
					con = DriverManager.getConnection(URL, USER_ID, PASS);
					pStatement = con.prepareStatement(
							"insert into teachers(teacher_name,teacher_email,teacher_pass)values(?,?,?)");
					pStatement.setString(1, user);
					pStatement.setString(2, email);
					pStatement.setString(3, pwd);

					if (!pStatement.execute()) {
						req.getRequestDispatcher("staff.jsp").forward(req, res);
					}
				} catch (Exception e) {
					e.printStackTrace();
				} finally {

					try {
						pStatement.close();
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			} else if (role.equals("student")) {
				try {
					Class.forName(DRIVER);
					con = DriverManager.getConnection(URL, USER_ID, PASS);
					pStatement = con.prepareStatement("insert into students(stu_name,stu_email,stu_pass)values(?,?,?)");
					pStatement.setString(1, user);
					pStatement.setString(2, email);
					pStatement.setString(3, pwd);

					if (!pStatement.execute()) {
						req.setAttribute("name", user);
						req.setAttribute("sucMessage", "You have registered successfully");
						req.getRequestDispatcher("index.jsp").forward(req, res);
					}
				} catch (Exception e) {
					e.printStackTrace();
				} finally {

					try {
						pStatement.close();
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}

		}
	}
}
