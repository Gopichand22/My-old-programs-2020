package com.mindtree.programset2;

public class CustomerDetailsInBank29 {
	private int custid;
	private String name;
	private String address;
	private String acctype;
	private double custblance;

	public CustomerDetailsInBank29(int custid, String name, String address) {
		String str1 = "GCR";
		if (custid <= 0) {
			custid = 1000;
		}
		this.custid = custid;

		if (name == "") {
			name = str1;
		}
		this.name = name;
		if (address == "") {
			address = "Mindtree,Banglore";
		}
		this.address = address;

	}

	public CustomerDetailsInBank29(int custid, String name) {
		if (custid <= 0) {
			custid = 100;
		}
		this.custid = custid;
		if (name == "") {
			name = "Gopichand";
		}
		this.name = name;

	}

	public CustomerDetailsInBank29(int custid, String name, String address, String acctype, double custblance) {
		if (custid <= 0) {
			custid = 100;
		}
		this.custid = custid;

		if (name == "") {
			name = "GCR";
		}
		this.name = name;
		if (address == "") {
			address = "Banglore";
		}
		this.address = address;
		if (acctype == "") {
			acctype = "sb";
		}
		this.acctype = acctype;
		double bal = 1.00;
		if (custblance <= 0.0) {
			custblance = bal;
		}
		this.custblance = custblance;

	}

	public void print() {
		System.out.println("The customer id is:" + " " + custid);
		System.out.println("The name of the customer:" + " " + name);
		System.out.println("The adress of the person:" + " " + address + "\n\n");
	}

	public void print1() {
		System.out.println("The customer id is:" + " " + custid);
		System.out.println("The name of the customer:" + " " + name + "\n\n");
	}

	public void print2() {
		System.out.println("The customer id is:" + " " + custid);
		System.out.println("The name of the customer:" + " " + name);
		System.out.println("The adress of the person" + " " + address);
		System.out.println("The acctype of the customer is" + " " + acctype);
		System.out.println("The balance of the customer is" + " " + custblance);
	}
}