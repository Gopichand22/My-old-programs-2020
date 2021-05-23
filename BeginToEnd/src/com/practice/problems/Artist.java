package com.practice.problems;

public class Artist {

	private int id;
	private String name;
	private String mobileNumber;
	private String city;
	private double sqFeetCharge;

	public Artist(int id, String name, String mobileNumber, String city, double sqFeetCharge) {
		this.id = id;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.city = city;
		this.sqFeetCharge = sqFeetCharge;
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

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSqFeetCharge() {
		return sqFeetCharge;
	}

	public void setSqFeetCharge(double sqFeetCharge) {
		this.sqFeetCharge = sqFeetCharge;
	}

}
