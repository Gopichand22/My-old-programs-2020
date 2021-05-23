
package com.mindtreefirstset.withnewupdates;

import com.mindtreefirstset.validations.AllValidationChecks;

public class ReverseNumberApplication {

	public static void main(String[] args) {
		System.out.println("Enter a Number: ");
		long rev = reverseNumber(AllValidationChecks.integerCheck());
		System.out.println(rev);

	}

	private static long reverseNumber(long number) {
		long rev = 0;
		while (number != 0) {
			long digit = number % 10;
			rev = rev * 10 + digit;
			number /= 10;
		}
		return rev;
	}

}
