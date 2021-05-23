package com.mindtree.programset2;

public class Passenger {
	private int id;
	private int age;
	private String mobileNumber;
	private String name;
	private String dateOfBirth;
	private String source;
	private String destination;
	private String date;
	private String time;
	private String city;

	public Passenger(int id, int age, String name, String mobileNumber, String dateOfBirth, String city) {
		this.id = id;
		this.age = age;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.dateOfBirth = dateOfBirth;
		this.city = city;
	}

	public Passenger() {

	}

	public String getDateofbirth() {
		return dateOfBirth;
	}

	public void setDateofbirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobilenumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
