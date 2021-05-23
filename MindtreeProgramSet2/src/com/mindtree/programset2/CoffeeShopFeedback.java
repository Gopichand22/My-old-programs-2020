package com.mindtree.programset2;

public class CoffeeShopFeedback {
	private String name;
	private String mobilenumber;
	private double feedback;

	public CoffeeShopFeedback(String name, String mobilenumber, double feedback) {
		this.name = name;
		this.mobilenumber = mobilenumber;
		this.feedback = feedback;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public double getFeedback() {
		return feedback;
	}

	public void setFeedback(double feedback) {
		this.feedback = feedback;
	}

}