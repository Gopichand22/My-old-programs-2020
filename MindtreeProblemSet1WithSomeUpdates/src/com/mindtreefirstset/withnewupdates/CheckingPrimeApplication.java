package com.mindtreefirstset.withnewupdates;

import com.mindtreefirstset.validations.AllValidationChecks;

public class CheckingPrimeApplication {

	public static void main(String args[]) {
		System.out.println("Enter number");
		System.out.println(isPrime(AllValidationChecks.integerCheck()));
	}

	public static boolean isPrime(int number) {

		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

}
