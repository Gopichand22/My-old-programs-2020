package com.gopi.fanoppsconcepts;

public class CustomerRunner {

	public static void main(String[] args) {

		Address homeAddress = new Address("I stay at ", "Nellore", "524306", "A.P");
		Customer customer = new Customer("GopiChand", homeAddress);

		Address workAddress = new Address("I work at ", "orissa", "523330", "orissa");
		customer.setWorkAddress(workAddress);
		System.out.println(customer);
	}

}
