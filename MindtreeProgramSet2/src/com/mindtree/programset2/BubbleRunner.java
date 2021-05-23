package com.mindtree.programset2;

public class BubbleRunner {

	public static void main(String[] args) {
		int[] array = { 7, 3, 10, 1, 5 };
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					array[i] = array[i] + array[j];
					array[j] = array[i] - array[j];
					array[i] = array[i] - array[j];
				}
			}
		}
		for (int element : array) {
			System.out.println(element);
		}
	}

}
