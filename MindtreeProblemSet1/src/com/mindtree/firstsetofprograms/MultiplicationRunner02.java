package com.mindtree.firstsetofprograms;

import java.util.Scanner;

public class MultiplicationRunner02 {

	public static void main(String[] args) {
		Multiplication multi = new Multiplication();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		sc.close();
		multi.mulTable(num);
	}

}
