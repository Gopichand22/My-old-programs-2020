package com.mindtree.firstsetofprograms;

import java.util.Scanner;

public class MenuBinarySearching14 {

	public static void main(String[] args) {
		BinarySearchForIntegerElement binarySearchForInt = new BinarySearchForIntegerElement();
		BinarySearchForString binarySearchForString = new BinarySearchForString();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Binary Search For Integer Values \n2.Binary Search For Strings\n3.Exit");
		int choice = sc.nextInt();
		switch (choice) {
//***************************************Binary search for integer******************************
		case 1: {
			System.out.println("1.Binary Search For Integer Values");
			int[] arr = new int[] { -1, 5, 6, 9, 11, 14, 16, 17, 18, 19, 21, 23, 29, 34, 56, 78, 89, 92, 96, 100 };
			System.out.println("Enter an Integer: ");
			int key = sc.nextInt();
			if (key <= 0) {
				boolean tF = binarySearchForInt.keySearch(arr, key);
				System.out.println(tF);
			} else if (key > 0) {
				boolean tF = binarySearchForInt.keySearch(arr, key);
				System.out.println(tF);
			} else {
				System.out.println("Enter numerial value");
			}
		}
			break;
// ***************************************Binary search for strings*********************************
		case 2: {
			System.out.println("2.Binary Search For Strings");
			String[] str = new String[] { "ant", "bull", "cat", "dog", "elephant", "fish", "hen", "monkey", "pig" };
			System.out.println("Enter Animal name: ");
			sc.nextLine();
			String key2 = sc.nextLine();
			if (key2.matches("^[a-zA-Z]*$")) {
				boolean tF = binarySearchForString.keySearch2(str, key2);
				System.out.println(tF);
			} else {
				System.out.println("Enter string only");
			}
		}
			break;
//********************exit code*************************************************
		case 3: {
			System.out.println("Exiting........\nBye");
			return;
		}
		default:
			System.out.println("please choose Only 1, 2 & 3.");
		}
	}

}
