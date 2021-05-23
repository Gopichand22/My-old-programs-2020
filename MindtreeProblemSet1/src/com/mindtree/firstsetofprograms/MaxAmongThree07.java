package com.mindtree.firstsetofprograms;

import java.util.Scanner;

public class MaxAmongThree07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		getMax(a, b, c);
		System.out.println();
	}

	public static void getMax(int a, int b, int c) {
		if (a > b && a > c)
			System.out.println(a);
		else if (b > c && b > c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
	}

}
