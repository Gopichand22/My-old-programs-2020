package com.practice.problems;

public class Company {

	private int id;
	private String name;
	private int year;
	private int employeeCount;
	private long turnOver;

	public Company() {

	}

	public Company(int id, String name, int year, int employeeCount, long turnOver) {
		this.id = id;
		this.name = name;
		this.year = year;
		this.employeeCount = employeeCount;
		this.turnOver = turnOver;
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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

	public long getTurnOver() {
		return turnOver;
	}

	public void setTurnOver(long turnOver) {
		this.turnOver = turnOver;
	}

}
