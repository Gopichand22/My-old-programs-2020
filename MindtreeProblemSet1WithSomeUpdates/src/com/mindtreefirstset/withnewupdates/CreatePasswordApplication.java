package com.mindtreefirstset.withnewupdates;

import com.mindtreefirstset.validations.AllValidationChecks;

public class CreatePasswordApplication {

	public static void main(String[] args) {
		System.out.println("Enter First Name: ");
		String firstName = AllValidationChecks.stringCheck();
		System.out.println("Enter Middle Name: ");
		String middleName = AllValidationChecks.stringCheck();
		System.out.println("Enter LastName Name: ");
		String lastName = AllValidationChecks.stringCheck();
		System.out.println("Enter age: ");
		int age = AllValidationChecks.integerCheck();
		System.out.println(AllValidationChecks.subStringMethod2(firstName, 0, 1)
				+ AllValidationChecks.subStringMethod2(middleName, 0, 1)
				+ AllValidationChecks.subStringMethod2(lastName, 0, 1) + age);
	}

}
