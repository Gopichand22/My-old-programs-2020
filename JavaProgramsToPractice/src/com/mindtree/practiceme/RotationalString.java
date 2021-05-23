package com.mindtree.practiceme;

import com.mindtreefirstset.validations.AllValidationChecks;

public class RotationalString {

	public static void main(String[] args) {
		String temp;
		System.out.println("Enter the string 1:");
		String string1 = AllValidationChecks.stringCheck();
		System.out.println("Enter the String 2:");
		String string2 = AllValidationChecks.stringCheck();
		if (string1.length() == string2.length()) {
			temp = AllValidationChecks.addStrings(string1);// method to add/concat 2 strings
			if (temp.indexOf(string2) != -1) {
				System.out.println(string1 + " and " + string2 + " are Circular");
			} else {
				System.out.println(string1 + " and " + string2 + " are not Circular");
			}
		} else {
			System.out.println("Please give same sized strings\nExample:-\nString1=ABCD/BCDA\nString2=CDAB/ABDA");
		}

	}

}
