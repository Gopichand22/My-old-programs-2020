package com.begintoend.coding;

public class Car {

	private String name;
	private String type;
	private int id;
	private String color;
	private byte seats;
	private int speed;

	public Car(String name, String type, int id, String color, byte seats, int speed) {
		this.name = name;
		this.type = type;
		this.id = id;
		this.color = color;
		this.seats = seats;
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public byte getSeats() {
		return seats;
	}

	public void setSeats(byte seats) {
		this.seats = seats;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Car() {

	}
}
