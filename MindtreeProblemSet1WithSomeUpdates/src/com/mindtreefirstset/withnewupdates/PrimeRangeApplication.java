package com.mindtreefirstset.withnewupdates;

import com.mindtreefirstset.validations.AllValidationChecks;

public class PrimeRangeApplication {
	static int comma = 0;

	public static void main(String[] args) {
		System.out.println("Enter From value:");
		int from = AllValidationChecks.integerCheck();
		System.out.println("Enter To value:");
		int to = AllValidationChecks.integerCheck();
		if (from >= to) {
			System.out.println("Empty List");
		} else {
			for (int i = from; i <= to; i++) {
				findPrime(i);
			}
		}
	}

	private static void findPrime(int number) {
		int count = 0;
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0)
				count++;
		}
		if (count == 0) {
			if (comma == 0) {
				System.out.print(number);
				comma++;
			} else
				System.out.print("," + number);
		}
	}
}
