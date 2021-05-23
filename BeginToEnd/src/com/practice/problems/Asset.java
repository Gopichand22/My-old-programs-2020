package com.practice.problems;

public class Asset {

	private String serialNumber;
	private String model;
	private String allotedMonth;
	private int quantity;

	public Asset(String serialNumber, String model, String allotedMonth, int quantity) {
		this.serialNumber = serialNumber;
		this.model = model;
		this.allotedMonth = allotedMonth;
		this.quantity = quantity;

	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getAllotedMonth() {
		return allotedMonth;
	}

	public void setAllotedMonth(String allotedMonth) {
		this.allotedMonth = allotedMonth;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
