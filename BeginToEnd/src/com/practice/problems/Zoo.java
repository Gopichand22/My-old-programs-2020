package com.practice.problems;

public class Zoo {

	private int id;
	private String name;
	private int noOfCages;
	private String location;

	public Zoo(int id, String name, int noOfCages, String location) {
		this.id = id;
		this.name = name;
		this.noOfCages = noOfCages;
		this.location = location;

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

	public int getNoOfCages() {
		return noOfCages;
	}

	public void setNoOfCages(int noOfCages) {
		this.noOfCages = noOfCages;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
