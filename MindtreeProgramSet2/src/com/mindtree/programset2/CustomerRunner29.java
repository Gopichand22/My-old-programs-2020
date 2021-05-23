package com.mindtree.programset2;

public class CustomerRunner29 {
	public static void main(String args[]) {
		CustomerDetailsInBank29 customerInfo = new CustomerDetailsInBank29(02154, "GCR", "AndhraPradesh");
		CustomerDetailsInBank29 customerInfo2 = new CustomerDetailsInBank29(03254, "GopichandReddy");
		CustomerDetailsInBank29 customerInfo3 = new CustomerDetailsInBank29(02125, "Gopi", "Nellore", "sb", 100000);
		customerInfo.print();
		customerInfo2.print1();
		customerInfo3.print2();

	}

}