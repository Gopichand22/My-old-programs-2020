package com.patters.practice;

import java.util.Scanner;

public class TriangularPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = 0;
		int size = sc.nextInt();
		for (int i = 1; i <= size; i++) {
			for (int space = 1; space <= size - i; space++) {
				System.out.print(" ");
			}
			while (k != 2 * i - 1) {
				System.out.print("*");
				k++;
			}
			System.out.println();
		}
	}

}
