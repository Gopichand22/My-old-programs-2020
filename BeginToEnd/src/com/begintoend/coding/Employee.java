package com.begintoend.coding;

public class Employee {

	private int id;
	private String name;
	private int yearOfExperience;

	public Employee(int id, String name, int yearOfExperience2) {
		this.id = id;
		this.name = name;
		this.yearOfExperience = yearOfExperience2;
	}

	public Employee() {

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

	public int getYearOfExperience() {
		return yearOfExperience;
	}

	public void setYearOfExperience(int yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}

}
