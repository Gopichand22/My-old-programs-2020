package com.online.classroom.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.online.classroom.model.StaffData;

public class GetStuListDao {
	private static final String URL = "jdbc:mysql://localhost:3306/virtual_classroom_db";
	private static final String USER_ID = "root";
	private static final String PASS = "087722";

	Connection con = null;
	Statement statement = null;
	ResultSet resultSet = null;

	public List<StaffData> getstuDetails() {
		List<StaffData> students = new ArrayList<StaffData>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		}
		try {
			con = DriverManager.getConnection(URL, USER_ID, PASS);
			statement = con.createStatement();
			resultSet = statement.executeQuery("select stu_id,stu_name,stu_email from students");

			while (resultSet.next()) {
				StaffData stu = new StaffData();
				stu.setId(resultSet.getInt("stu_id"));
				stu.setName(resultSet.getString("stu_name"));
				stu.setEmail(resultSet.getString("stu_email"));
				students.add(stu);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				resultSet.close();
				statement.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return students;
	}
}