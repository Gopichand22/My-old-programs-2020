package com.mindtreefirstset.withnewupdates;

import com.mindtreefirstset.validations.AllValidationChecks;

public class BinarySearchApplication {

	public static void main(String[] args) {
		boolean isValid = true;
		BinarySearchForInteger binarySearchForInteger = new BinarySearchForInteger();
		BinarySearchForString binarySearchForString = new BinarySearchForString();
		System.out.println("1.Binary Search For Integer Values \n2.Binary Search For Strings\n3.Exit");
		do {
			switch (AllValidationChecks.integerCheck()) {
			// ***************************************Binary search for
			// integer******************************
			case 1:
				System.out.println("1.Binary Search For Integer Values");
				int[] arr = AllValidationChecks.integerArrayCheck(AllValidationChecks.integerCheck());
				System.out.println("Enter an Integer: ");
				int key = AllValidationChecks.integerCheck();
				boolean trueFalse1 = binarySearchForInteger.findElement(arr, key);
				System.out.println(trueFalse1);
				break;
			// ***************************************Binary search for
			// strings*********************************
			case 2:
				System.out.println("2.Binary Search For Strings");
				String[] str = new String[] { "ant", "bull", "cat", "dog", "elephant", "fish", "hen", "monkey", "pig" };
				System.out.println("Enter Animal name: ");
				String name = AllValidationChecks.stringCheck();
				boolean trueFalse2 = binarySearchForString.findString(str, name);
				System.out.println(trueFalse2);
				break;
			// ********************exit
			// code*************************************************
			case 3:
				System.out.println("Exiting........\nBye");
				isValid = false;
				break;
			default:
				System.out.println("please choose Only 1, 2 & 3:");
			}
		} while (isValid);
	}

}
