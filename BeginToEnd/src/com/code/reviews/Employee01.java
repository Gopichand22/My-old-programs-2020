package com.code.reviews;

public class Employee01 {

	private String id;
	private String name;
	private double salary;
	private String designation;
	private String reportingManager;

	public Employee01(String id, String name, double salary, String designation, String reportingManager) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.reportingManager = reportingManager;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getReportingManager() {
		return reportingManager;
	}

	public void setReportingManager(String reportingManager) {
		this.reportingManager = reportingManager;
	}

}
