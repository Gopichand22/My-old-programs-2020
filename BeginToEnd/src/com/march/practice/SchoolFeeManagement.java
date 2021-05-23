package com.march.practice;

import com.mindtreefirstset.validations.AllValidationChecks;

public class SchoolFeeManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrayCount = 0, records;
		boolean isValid = true;
		System.out.println("Enter the number of records");
		records = AllValidationChecks.integerCheck();
		StudentDetail[] studentObject = new StudentDetail[records];
		do {
			switch (chooseOption()) {
			case 1:
				arrayCount = addDetails(studentObject, arrayCount, records);
				break;

			case 2:
				studentObject = sortStudentBasedOnName(studentObject, arrayCount);
				break;
			case 3:
				displayStudentWithPendingFee(studentObject, arrayCount);
				break;
			case 4:
				updateFeeForPaidStudent(studentObject, arrayCount);
				break;
			case 5:
				displayAllStudentOfPArticularClass(studentObject, arrayCount);
				break;
			case 6:
				System.out.println("Exiting...bye");
				isValid = false;
				break;

			}
		} while (isValid);
	}

	private static int chooseOption() {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int addDetails(StudentDetail[] studentObject, int arrayCount, int records) {
		System.out.println("Enter Id:");
		int id = AllValidationChecks.positiveIntegerCheck();
		System.out.println("Enter Name:");
		String name = AllValidationChecks.stringLineCheck();
		System.out.println("Enter Class:");
		System.out.println("Enter PhoneDetails:");
		System.out.println("Enter totla fee per year:");
		System.out.println("Fee Submitted:");
		return 0;
	}

	private static StudentDetail[] sortStudentBasedOnName(StudentDetail[] studentObject, int arrayCount) {
		return studentObject;
		// TODO Auto-generated method stub

	}

	private static void displayStudentWithPendingFee(StudentDetail[] studentObject, int arrayCount) {
		// TODO Auto-generated method stub

	}

	private static void updateFeeForPaidStudent(StudentDetail[] studentObject, int arrayCount) {
		// TODO Auto-generated method stub

	}

	private static void displayAllStudentOfPArticularClass(StudentDetail[] studentObject, int arrayCount) {
		// TODO Auto-generated method stub

	}

}
