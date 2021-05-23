package com.mindtreefirstset.withnewupdates;

import com.mindtreefirstset.validations.AllValidationChecks;

public class AddHelloApplication {

	public static void main(String[] args) {
		System.out.print("Enter the Name: ");
		String name = AllValidationChecks.stringCheck();
		System.out.println("Hello " + name);
	}

}
