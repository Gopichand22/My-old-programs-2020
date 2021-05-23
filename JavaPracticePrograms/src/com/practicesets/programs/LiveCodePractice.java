package com.practicesets.programs;

import java.util.Scanner;

public class LiveCodePractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = { 1, 4, 7, 4, 9, 6, 7 };
		int[] sort = bubbleSort(array);
		printnums();
		reverse2(array);
		largestAndSmall(sort);
		continueKey(array);
		breakKey(array);

		int[] array2 = { 1, 2, 3, 2, 1 };
		System.out.println(palin(array2));
	}

	private static boolean palin(int[] array2) {
		boolean flag = true;

		for (int k = array2.length - 1, i = 0; i < array2.length; i++, k--) {
			if (array2[i] != array2[k]) {
				flag = false;
			}
		}

		return flag;
	}

	private static void reverse2(int[] array) {

	}

	// 5 continue
	private static void continueKey(int[] array) {
		int userNum = 2;
		for (int i = 1; i <= 10; i++) {
			if (i == userNum) {
				continue;
			}
		}
	}

//6 break method
	private static void breakKey(int[] array) {
		int userNum = 2;
		for (int i = 1; i <= 10; i++) {
			if (i == userNum) {
				break;
			}
		}
	}

//1,2,3 for while 1-10
	private static void printnums() {
		for (int j = 10, i = 1; i <= 10; i++, j--) {
			System.out.println(i + " " + j);
		}
		int k = 1;
		while (k >= 10) {
			System.out.println(k);
			k++;
		}
		int z = 20;
		do {
			System.out.println(z);
			z++;
		} while (z >= 30);
	}

//
	private static int[] bubbleSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}

//8
	private static void largestAndSmall(int[] array) {
		System.out.println(array[0]);
		System.out.println(array[array.length - 1]);
	}

//reverse
	private static void reverse(int[] array) {
		for (int i = array.length - 1; i <= 0; i--) {
			System.out.println(array[i]);
		}
	}
//

}
