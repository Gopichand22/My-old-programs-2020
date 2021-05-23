package com.mindtree.firstsetofprograms;

import java.util.Scanner;

public class PrimeRange10 {
	static int comma = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter From value:");
		int n = sc.nextInt();
		System.out.println("Enter To value:");
		int m = sc.nextInt();
		sc.close();
		if (n >= m) {
			System.out.println("Empty List");
		} else {
			for (int i = n; i <= m; i++) {
				findPrime(i);
			}
		}
	}

	private static void findPrime(int number) {
		int c = 0;
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0)
				c++;

		}
		if (c == 0) {
			if (comma == 0) {
				System.out.print(number);
				comma++;
			} else
				System.out.print("," + number);
		}
	}
}
