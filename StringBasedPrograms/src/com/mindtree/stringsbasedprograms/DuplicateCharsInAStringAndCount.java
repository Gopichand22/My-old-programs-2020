package com.mindtree.stringsbasedprograms;

import java.util.Scanner;

import com.mindtreefirstset.validations.AllValidationChecks;

public class DuplicateCharsInAStringAndCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		// convert all alphas to lower
		String lower = AllValidationChecks.convertToLowerCase(str);
//		String duplicate = "";
		String duplicate2 = "";
		// loop starts
		for (int i = 0; i < lower.length(); i++) {
			int count = 1;
			// inner loop
			boolean flag = true;
			char ch = lower.charAt(i);
			for (int j = i + 1; j < lower.length(); j++) {
				if (lower.charAt(i) == lower.charAt(j)) {
					count++;
				}
			}
//Using indexOf Method

//			if (count > 1 && duplicate.indexOf(ch) == -1) {
//				duplicate += ch;
//				System.out.println(ch + " : " + count + "  ");
//			}

//Without Using indexOf Method
			for (int k = 0; k < duplicate2.length(); k++) {
				if (duplicate2.charAt(k) == ch) {
					flag = false;
				}
			}
			if (count > 1 && flag) {
				duplicate2 += ch;
				System.out.println(ch + " : " + count + "  ");
			}
		}
	}
}