package com.march.practice;

public class Medicine {

	private String[] medicine;
	private int[] quantity;
	private double[] price;

	public Medicine() {

	}

	public Medicine(String[] medicine2, int[] quantity2, double[] price2) {
		this.medicine = medicine2;
		this.quantity = quantity2;
		this.price = price2;
	}

	public String[] getMedicine() {
		return medicine;
	}

	public void setMedicine(String[] medicine) {
		this.medicine = medicine;
	}

	public int[] getQuantity() {
		return quantity;
	}

	public void setQuantity(int[] quantity) {
		this.quantity = quantity;
	}

	public double[] getPrice() {
		return price;
	}

	public void setPrice(double[] price) {
		this.price = price;
	}

}
