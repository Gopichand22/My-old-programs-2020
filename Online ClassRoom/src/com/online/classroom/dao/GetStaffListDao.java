package com.online.classroom.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.online.classroom.model.StaffData;

public class GetStaffListDao {
	private static final String URL = "jdbc:mysql://localhost:3306/virtual_classroom_db";
	private static final String USER_ID = "root";
	private static final String PASS = "087722";

	Connection con = null;
	Statement statement = null;
	ResultSet resultSet = null;

	public List<StaffData> getstaffDetails() {
		List<StaffData> sd = new ArrayList<StaffData>();
		try {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			con = DriverManager.getConnection(URL, USER_ID, PASS);
			statement = con.createStatement();
			resultSet = statement.executeQuery("select teacher_id,teacher_name,teacher_email from teachers");

			while (resultSet.next()) {
				StaffData std = new StaffData();
				std.setId(resultSet.getInt("teacher_id"));
				std.setName(resultSet.getString("teacher_name"));
				std.setEmail(resultSet.getString("teacher_email"));
				sd.add(std);
			}
			System.out.println(sd);
		} catch (SQLException e) {
			System.out.println("error db");
		} finally {
			try {
				resultSet.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return sd;
	}

}
