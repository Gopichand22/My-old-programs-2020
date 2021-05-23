package com.march.practice;

public class Customer {
	private int id;
	private String customerName;
	private int age;
	Medicine[] medicine;
	private double[] price;
	private int[] quantity;
	private String[] medicine2;

	public Customer() {

	}

	public Customer(int id, String customerName, int age, String[] medicine2, int[] quantity, double[] price) {
		this.id = id;
		this.customerName = customerName;
		this.age = age;
		this.medicine2 = medicine2;
		this.quantity = quantity;
		this.price = price;

	}

	public Medicine[] getMedicine() {
		return medicine;
	}

	public void setMedicine(Medicine[] medicine) {
		this.medicine = medicine;
	}

	public double[] getPrice() {
		return price;
	}

	public void setPrice(double[] price) {
		this.price = price;
	}

	public int[] getQuantity() {
		return quantity;
	}

	public void setQuantity(int[] quantity) {
		this.quantity = quantity;
	}

	public String[] getMedicine2() {
		return medicine2;
	}

	public void setMedicine2(String[] medicine2) {
		this.medicine2 = medicine2;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
