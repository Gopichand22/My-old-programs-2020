package com.begintoend.coding;

public class Student32 {

	private int id;
	private String firstName;
	private String secondName;
	private String address;
	private String course;

	public Student32() {

	}

	public Student32(int id, String firstName, String secondName, String address, String course) {
		this.id = id;
		this.firstName = firstName;
		this.secondName = secondName;
		this.address = address;
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

}
