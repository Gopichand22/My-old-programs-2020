package com.mindtree.firstsetofprograms;

import java.util.Scanner;

public class FindPrime09 {

	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Enter number");
		int number = input.nextInt();

		System.out.println(isPrime(number));
	}

	public static boolean isPrime(int number) {

		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0)
				return false;

		}
		return true;
	}
}