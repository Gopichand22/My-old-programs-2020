package com.mindtree.firstsetofprograms;

import java.util.Scanner;

public class ReversingNumber08 {

	public static void main(String[] args) {
		AllValidationChecks validations = new AllValidationChecks();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		// int number = validations.integerCheck(sc.nextInt());
		int number = sc.nextInt();
		sc.close();
		reverse(number);

	}

	private static void reverse(int num) {
		int rev = 0;
		while (num != 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num /= 10;
		}
		System.out.println(rev);
	}

}
