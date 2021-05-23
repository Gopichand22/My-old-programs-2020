package com.online.classroom.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.online.classroom.model.StaffSubData;

public class GetStaffSubListDao {
	private static final String URL = "jdbc:mysql://localhost:3306/virtual_classroom_db";
	private static final String USER_ID = "root";
	private static final String PASS = "087722";

	Connection con = null;
	Statement statement = null;
	ResultSet resultSet = null;

	public List<StaffSubData> getstaffSubDetails() {
		List<StaffSubData> sd = new ArrayList<StaffSubData>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection(URL, USER_ID, PASS);
			statement = con.createStatement();
			resultSet = statement.executeQuery(
					"select teachers.teacher_name,subjects.subject_name,subjects.sub_id from subjects inner join teachers on subjects.sub_id = teachers.teacher_id;");

			while (resultSet.next()) {
				StaffSubData stsu = new StaffSubData();
				stsu.setId(resultSet.getInt("subjects.sub_id"));
				stsu.settName(resultSet.getString("teachers.teacher_name"));
				stsu.setsName(resultSet.getString("subjects.subject_name"));
				sd.add(stsu);
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
		return sd;
	}

}
