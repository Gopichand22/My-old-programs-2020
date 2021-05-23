package com.mindtree.programset2;

import java.util.Scanner;

public class DistinctValuesInArray {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int sizeofarray = sc.nextInt();
		int array[] = new int[sizeofarray];
		System.out.println("Enter the elements in the array");
		for (int i = 0; i < sizeofarray; i++) {
			array[i] = sc.nextInt();
			array[i] = validatePositiveNumber(array[i], sc);
		}
		duplicatevalues(array);

	}

	private static void duplicatevalues(int[] array) {
		int count = 0;
		int sizeofarray = array.length;
		for (int i = 0; i < sizeofarray; i++) {
			for (int j = i + 1; j < sizeofarray; j++) {
				if (array[i] == array[j]) {
					System.out.print(array[i] + " ");
					count++;
				}
			}
		}
		if (count == 0) {
			System.out.println(-1);
		}
	}

	private static int validatePositiveNumber(int number, Scanner sc) {
		if (number < 0) {
			System.out.println("Enter the postive number");
			number = validatePositiveNumber(number, sc);
		}
		return number;

	}

}
