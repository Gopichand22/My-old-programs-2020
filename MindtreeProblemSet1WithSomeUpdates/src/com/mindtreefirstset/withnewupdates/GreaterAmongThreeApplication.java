package com.mindtreefirstset.withnewupdates;

import com.mindtreefirstset.validations.AllValidationChecks;

public class GreaterAmongThreeApplication {

	public static void main(String[] args) {

		System.out.println("Enter a number A=");
		int a = AllValidationChecks.integerCheck();
		System.out.println("Enter a number B=");
		int b = AllValidationChecks.integerCheck();
		System.out.println("Enter a number C=");
		int c = AllValidationChecks.integerCheck();
		getMax(a, b, c);


	}

	private static void getMax(int a, int b, int c) {
		if (a > b && a > c)
			System.out.println("A is greater among Three numbers: " + a);
		else if (b > c && b > c)
			System.out.println("B is greater among Three numbers: " + b);
		else
			System.out.println("C is greater among Three numbers: " + c);

	}

}
