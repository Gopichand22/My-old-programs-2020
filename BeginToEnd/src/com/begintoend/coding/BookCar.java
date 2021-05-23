package com.begintoend.coding;

public class BookCar {

	private int id;
	private String brand;
	private String time;
	private double price;

	public BookCar(int id, String brand, String time, double price) {
		this.id = id;
		this.brand = brand;
		this.time = time;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public BookCar() {

	}

}
