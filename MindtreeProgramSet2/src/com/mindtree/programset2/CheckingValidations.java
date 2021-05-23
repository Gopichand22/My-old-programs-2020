package com.mindtree.programset2;

import java.util.Scanner;

import com.mindtreefirstset.validations.AllValidationChecks;

public class CheckingValidations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strr = AllValidationChecks.stringMobileNumberCheck();
		System.out.println(strr);

		System.out.println("Enter date");
		String date = AllValidationChecks.validateDate();
		System.out.println(date);

		String str = "19";
		int k = str.charAt(0) - 48;
		int l = str.charAt(1) - 48;
		System.out.println(k);
		System.out.println(l);

	}

}
