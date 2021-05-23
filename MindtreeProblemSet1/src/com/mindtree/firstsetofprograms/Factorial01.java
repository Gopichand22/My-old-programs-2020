package com.mindtree.firstsetofprograms;

import java.util.Scanner;

public class Factorial01 {

	public static void main(String[] args) {
		Factorial fact = new Factorial();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: \n");
		int n = sc.nextInt();
		if (n >= 0) {
			System.out.format("\nFactorial of the %d is : %d ", n, fact.FactOfN(n));
		} else {
			System.out.println("Input should be positive number please check it once");
		}

	}
}
