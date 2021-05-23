package com.practice.problems;

public class Traveller {

	private int id;
	private String name;
	private int age;
	private String source;
	private String destination;
	private String dateOfJourney;

	public Traveller() {

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	public String getDateOfJourney() {
		return dateOfJourney;
	}

	public void setDateOfJourney(String dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}

	public Traveller(int id, String name, int age, String source, String destination, String dateOfJourney) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.source = source;
		this.destination = destination;
		this.dateOfJourney = dateOfJourney;
	}

}
