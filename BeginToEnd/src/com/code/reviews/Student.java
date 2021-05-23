package com.code.reviews;

public class Student {

	private int id;
	private String name;
	private String branch;
	private double averageMarks;

	public Student() {

	}

	public Student(int id, String name, String branch, double averageMarks) {
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.averageMarks = averageMarks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getAverageMarks() {
		return averageMarks;
	}

	public void setAverageMarks(double averageMarks) {
		this.averageMarks = averageMarks;
	}

}
