package com.mindtreefirstset.withnewupdates;

import java.util.Scanner;

import com.mindtreefirstset.validations.AllValidationChecks;

public class ExchangeLastNameApplication {

	public static void main(String[] args) {
		String fName1, fName2, lName1, lName2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Name 1:");
		String stu1 = AllValidationChecks.stringCheck();
		System.out.println("Enetr Student Name 2:");
		String stu2 = AllValidationChecks.stringCheck();
		sc.close();
		fName1 = stu1.substring(0, stu1.indexOf("-") + 1);
		lName1 = stu1.substring(stu1.indexOf("-") + 1);

		fName2 = stu2.substring(0, stu2.indexOf("-") + 1);
		lName2 = stu2.substring(stu2.indexOf("-") + 1);

		System.out.println(fName1 + lName2 + "\n" + fName2 + lName1);

	}

}
