package com.mindtreefirstset.withnewupdates;

import com.mindtreefirstset.validations.AllValidationChecks;

public class BubbleAndInsertionSortApplication {

	public static void main(String[] args) {
		System.out.println("Give size of Srting Array:");
		int size = AllValidationChecks.integerCheck();
		String[] str = new String[size];
		System.out.println("Enter " + size + " names");
		for (int i = 0; i < size; i++) {
			str[i] = AllValidationChecks.stringCheck();
		}
		System.out.println("1.Sort with Bubble\n2.sort With Insertion\n3.Exit");
		int choice = AllValidationChecks.integerCheck();
		switch (choice) {
		case 1:
			bubbleSort(str, size);
			break;
		case 2:
			inserSort(str, size);
			break;
		case 3:
			return;
		default:
			System.out.println("Enter 1 or 2 or 3:");

		}
	}

	private static void inserSort(String[] str, int n) {
		int i, j;
		for (i = 1; i < n; i++) {
			j = i;
			while (j > 0 && str[j - 1].compareTo(str[j]) > 0) {
				String temp = str[j - 1];
				str[j - 1] = str[j];
				str[j] = temp;
				j--;
			}
		}
		for (String element : str) {
			System.out.println(element);
		}

	}

	private static void bubbleSort(String[] str, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (str[i].compareTo(str[j]) > 0) {
					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;

				}
			}
		}
		System.out.println("Elements after sorting:");
		for (String element : str) {
			System.out.println(element);
		}
	}

}
