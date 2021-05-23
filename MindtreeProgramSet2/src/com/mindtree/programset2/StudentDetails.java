package com.mindtree.programset2;

public class StudentDetails {
	private int stid;
	private String name;
	private float marks;
	boolean secondchance = true;

	public StudentDetails(int stid, String name, boolean secondchance) {
		this.stid = stid;
		this.name = name;
		this.secondchance = secondchance;
	}
	public int getStid() {
		return stid;
	}

	public void setStid(int stid) {
		this.stid = stid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public boolean isSecondchance() {
		return secondchance;
	}

	public void setSecondchance(boolean secondchance) {
		this.secondchance = secondchance;
	}


	public void identifymarks(float marks) {
		this.marks = marks;
	}

	public void identifymarks(float marks, float marks2) {
		if (marks > marks2) {
			this.marks = marks;
		} else {
			this.marks = marks2;
		}
	}



}
