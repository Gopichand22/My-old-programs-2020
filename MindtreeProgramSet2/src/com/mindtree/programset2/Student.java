package com.mindtree.programset2;

public class Student {
	private int studentId;
	private String nameOfTheStudent;
	private String branchOfTheStudent;
	private int marksOfTheStudent;

	public Student(int studentid, String nameofthestudent, String branchofthestudent, int marksofthestudent) {
		this.studentId = studentid;
		this.nameOfTheStudent = nameofthestudent;
		this.branchOfTheStudent = branchofthestudent;
		this.marksOfTheStudent = marksofthestudent;
	}

	public Student() {
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getNameOfTheStudent() {
		return nameOfTheStudent;
	}

	public void setNameOfTheStudent(String nameOfTheStudent) {
		this.nameOfTheStudent = nameOfTheStudent;
	}

	public String getBranchOfTheStudent() {
		return branchOfTheStudent;
	}

	public void setBranchOfTheStudent(String branchOfTheStudent) {
		this.branchOfTheStudent = branchOfTheStudent;
	}

	public int getMarksOfTheStudent() {
		return marksOfTheStudent;
	}

	public void setMarksOfTheStudent(int marksOfTheStudent) {
		this.marksOfTheStudent = marksOfTheStudent;
	}

	public double highest(double[] studentMarks) {
		double max = studentMarks[0];
		for (double num : studentMarks) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}

}
