package com.online.classroom.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.online.classroom.model.Login;

public class LoginDao {
	private static final String URL = "jdbc:mysql://localhost:3306/virtual_classroom_db";
	private static final String USER_ID = "root";
	private static final String PASS = "087722";
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	Connection con = null;
	Statement statement = null;
	ResultSet resultSet = null;

	public String validateUser(Login login) {
		String emaill = login.getUserName();
		String password = login.getPassword();
		String role = login.getRole();

		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection(URL, USER_ID, PASS);
			statement = con.createStatement();
			if (role.equals("admin")) {
				resultSet = statement.executeQuery("select a_email,a_pass from admins");
				while (resultSet.next()) {

					if (emaill.equals(resultSet.getString("a_email")) && password.equals(resultSet.getString("a_pass")))
						return "admin";
				}

			} else if (role.equals("staff")) {

				resultSet = statement.executeQuery("select teacher_email,teacher_pass from teachers");

				while (resultSet.next()) {
					if (emaill.equals(resultSet.getString("teacher_email"))
							&& password.equals(resultSet.getString("teacher_pass")))
						return "staff";
				}

			} else if (role.equals("student")) {
				resultSet = statement.executeQuery("select stu_email,stu_pass from students");
				while (resultSet.next()) {
					if (emaill.equals(resultSet.getString("stu_email"))
							&& password.equals(resultSet.getString("stu_pass")))
						return "student";
				}

			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			try {
				resultSet.close();
				statement.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "Invalid user credentials";
	}

}
