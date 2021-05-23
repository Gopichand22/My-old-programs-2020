package com.mindtree.firstsetofprograms;

import java.util.Scanner;

public class StringSorting16 {

	static String temp = "";

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Give size of Srting Array:");
		int n = sc.nextInt();
		String[] str = new String[n];
		System.out.println("Enter " + n + " names");
		for (int i = 0; i < n; i++) {
			str[i] = sc.nextLine();
		}
		System.out.println("1.Sort with Bubble\n2.sort With Insertion\n3.Exit");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			bubbleSortt(str, n);
			break;
		case 2:
			inserSortt(str, n);
			break;
		case 3:
			return;
		default:
			System.out.println("Enter 1 or 2 or 3:");

		}
	}

	private static void inserSortt(String[] str, int n) {
		int i, j;
		for (i = 1; i < n; i++) {

			j = i;

			while (j > 0 && str[j - 1].compareTo(str[j]) > 0) {
				temp = str[j - 1];
				str[j - 1] = str[j];
				str[j] = temp;
				j--;
			}
		}
		for (String elee : str) {
			System.out.println(elee);
		}

	}

	private static void bubbleSortt(String[] str, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (str[i].compareTo(str[j]) > 0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;

				}
			}
		}
		System.out.println("Elements after sorting:");
		for (String ele : str) {
			System.out.println(ele);
		}
	}

}
