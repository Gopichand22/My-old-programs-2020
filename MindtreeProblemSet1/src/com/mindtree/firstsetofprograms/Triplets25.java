package com.mindtree.firstsetofprograms;

import java.util.Scanner;

public class Triplets25 {

	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[100];
		System.out.println("enter the size");
		int num = sc.nextInt();
		System.out.println("enter the array");
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		adc(arr, num);
	}

	private static void adc(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = i + 2; k < n; k++) {
					if (arr[i] + arr[j] == arr[k]) {
						System.out.println(arr[i] + "," + arr[j] + "," + arr[k]);
					}
				}
			}
		}
	}
}