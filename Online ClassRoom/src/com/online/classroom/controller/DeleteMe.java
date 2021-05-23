package com.online.classroom.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class DeleteMe extends HttpServlet {

	private static final String URL = "jdbc:mysql://localhost:3306/virtual_classroom_db";
	private static final String USER_ID = "root";
	private static final String PASS = "087722";
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String SITE = "delete.jsp";

	private static final long serialVersionUID = -4585911689173153807L;

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException {
		Connection con = null;
		PreparedStatement ps = null;

		String role = req.getParameter("role");
		int id = Integer.parseInt(req.getParameter("id"));
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		try {
			con = DriverManager.getConnection(URL, USER_ID, PASS);
			if (role.equals("staff")) {
				ps = con.prepareStatement("delete from teachers where teacher_id=?");
				ps.setInt(1, id);
				int deleted = ps.executeUpdate();
				if (deleted == 0) {
					req.setAttribute("err", "there is no such id in the database");

					req.getRequestDispatcher(SITE).forward(req, res);

				} else {
					req.setAttribute("id", id);
					redirectMe(req, res);
				}

			} else if (role.equals("student")) {
				ps = con.prepareStatement("delete from students where stu_id=?");
				ps.setInt(1, id);
				int deleted = ps.executeUpdate();
				if (deleted == 0) {
					req.setAttribute("err", "there is no such id in the database");

					req.getRequestDispatcher(SITE).forward(req, res);

				} else {
					req.setAttribute("id", id);
					redirectMe(req, res);

				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();

				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
		}

	}

	private void redirectMe(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher(SITE);
		rd.forward(req, res);

	}
}
