package com.mindtree.practiceme;

import com.mindtreefirstset.validations.AllValidationChecks;

public class RotationalSubStrings {

	public static void main(String[] args) {
		System.out.println("Distinct circular strings for a given length");
		System.out.println("Enter string");
		String string = AllValidationChecks.stringCheck();
		System.out.println("Enter the number:");
		int num=AllValidationChecks.integerCheck();
		if (num <= string.length()) {
		String mergeString = mergeStrings(string, num);
		String[] words = new String[string.length()];
		String temp = "";
		for (int i = 0; i < string.length(); i++) {
			int j = i;
			for (int x = j; x < num; x++) {
				temp = temp + mergeString.charAt(x);
				words[i] = temp;
			}
			num++;
			temp = "";
		}

		System.out.println("Distinct circular strings/subStrings for " + string + " are \n\nOUTPUT:");
		for (int i = 0; i < words[0].length() + 6; i++) {
			System.out.print("+");
		}
		System.out.println();
		for (String str : words) {
			System.out.println("+  " + str + "  +");
		}
		for (int i = 0; i < words[0].length() + 6; i++) {
			System.out.print("+");
		}
	} else {
		System.out.println("Sorry the given length is greater than the string length");
		System.out.println("Try again");
	}

	}

	private static String mergeStrings(String string, int num) {
		String result = "";
		int k = 0, l = 0;
		num = num - 1;
		int size = (string.length() * 2);
		char[] chars = new char[size];
//		string to char []
		for (int i = 0; i < size; i++) {
			if (i < (size / 2)) {
				chars[i] = string.charAt(k);
				k++;
			} else {
				if (l < (num)) {
					chars[i] = string.charAt(l);
					l++;
				}
				else {
					break;
				}
			}

		} // char[] to string
		for (char element : chars) {
			result += element;
		}

		return result;
	}
}
