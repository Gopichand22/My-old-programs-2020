package com.mindtree.programset2;

import com.mindtreefirstset.validations.AllValidationChecks;

public class CoffeShopRating31 {
	public static void main(String args[]) {

		System.out.println("enter the number of customers");
		int n = AllValidationChecks.integerCheck();
		double customerFeedback[] = new double[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter customer " + (i + 1) + " " + "name");
			String name = AllValidationChecks.stringCheck();
			System.out.println("Enter customer " + (i + 1) + " " + "mobile number");
			String mobilenumber = AllValidationChecks.stringMobileNumberCheck();
			System.out.println("Enter customer " + (i + 1) + " " + "feedback");
			double feedback = AllValidationChecks.doubleCheck();
			CoffeeShopFeedback obj = new CoffeeShopFeedback(name, mobilenumber, feedback);
			customerFeedback[i] = obj.getFeedback();
		}
		for (int i = 0; i < n; i++) {
			System.out.println("Feedback customer" + " " + (i + 1) + "   " + customerFeedback[i] + "  " + "out of 5");
		}
	}
}