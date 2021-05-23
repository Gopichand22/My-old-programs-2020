package com.mindtree.programset2;

public class Customer {
	private long accountNumber;
	private String name;
	private String accountType;
	private String dateOfBirth;
	private String address;
	private double balance;

	public Customer(long accountNumber, String name, String accountType, String dateOfBirth, String address,
			double balance) {
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.name = name;
		this.balance = balance;

	}

	public Customer() {
	}

	public long getAccountnumber() {
		return accountNumber;
	}

	public void setAccountnumber(long accountnumber) {
		this.accountNumber = accountnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccounttype() {
		return accountType;
	}

	public void setAccounttype(String accounttype) {
		this.accountType = accounttype;
	}

	public String getDateofbirth() {
		return dateOfBirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateOfBirth = dateofbirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String adress) {
		this.address = adress;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance2) {
		this.balance = balance2;
	}
}
