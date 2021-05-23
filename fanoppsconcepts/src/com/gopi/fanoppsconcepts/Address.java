package com.gopi.fanoppsconcepts;

public class Address {
	private String line1;
	private String city;
	private String pincode;
	private String state;

	public Address(String line1, String city, String pincode, String state) {
		super();
		this.line1 = line1;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
	}
@Override
public String toString() {
	return line1 + " " + city + " " + pincode + " " + state;
}
}
