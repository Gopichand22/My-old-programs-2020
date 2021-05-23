package com.mindtree.firstsetofprograms;

public class AllValidationChecks {

	public String stringCheck(String shape) {
		if ((shape.matches("^[a-zA-Z]*"))) {

		} else {
			System.out.println("Please check your input once");
		}
		return shape;
	}



}


