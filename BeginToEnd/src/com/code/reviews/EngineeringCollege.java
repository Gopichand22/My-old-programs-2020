package com.code.reviews;

import com.mindtreefirstset.validations.AllValidationChecks;

public class EngineeringCollege {

	public static void main(String[] args) {
		int arrayCount = 0, records;
		boolean isValid = true;
		System.out.println("Enter the number of records");
		records = AllValidationChecks.integerCheck();
		Student[] studentObject = new Student[records];
		do {
			switch (chooseOption()) {
			case 1:
				arrayCount = createStudent(studentObject, arrayCount, records);
				break;

			case 2:
				displayAllStudentDetails(studentObject, arrayCount);
				break;
			case 3:
				displayBranchByStudentName(studentObject, arrayCount);
				break;
			case 4:
				sortStudentsBasedOnId(studentObject, arrayCount);
				break;
			case 5:
				appendDegreeToBranch(studentObject, arrayCount);
				break;
			case 6:
				System.out.println("Exiting...Bye");
				isValid = false;
				break;

			}
		} while (isValid);

	}

	private static void appendDegreeToBranch(Student[] studentObject, int arrayCount) {
		for (int i = 0; i < arrayCount; i++) {
			System.out.println(studentObject[i].getId() + " " + studentObject[i].getName() + " "
					+ studentObject[i].getBranch() + " degree" + " " + studentObject[i].getAverageMarks() + "\n\n");
		}
	}

	private static void sortStudentsBasedOnId(Student[] studentObject, int arrayCount) {
		if (arrayCount > 0) {

			System.out.println("sorting based on account number");
			System.out.println("................................................");
			for (int i = 0; i < arrayCount; i++) {
				for (int j = 0; j < arrayCount - i - 1; j++) {
					if (studentObject[j].getId() > studentObject[j + 1].getId()) {
						Student temp = studentObject[j];
						studentObject[j] = studentObject[j + 1];
						studentObject[j + 1] = temp;
					}
				}
			}
			System.out.println("dispaly users based on account number");
			display(studentObject, arrayCount);
		} else {
			System.out.println("There is no data in the database");
		}
	}

	private static void display(Student[] studentObject, int arrayCount) {
		for (int i = 0; i < arrayCount; i++) {
			System.out.println(studentObject[i].getId() + " " + studentObject[i].getName() + " "
					+ studentObject[i].getBranch() + " " + studentObject[i].getAverageMarks() + "\n\n");
		}
	}

	private static void displayBranchByStudentName(Student[] studentObject, int arrayCount) {
		boolean flag = true;
		System.out.println("Enter student name ");
		AllValidationChecks.stringLineCheck();
		String name = AllValidationChecks.stringLineCheck();
		for (int i = 0; i < arrayCount; i++) {
			if (studentObject[i].getName().equals(name)) {
				System.out.println("Branch of " + studentObject[i].getName() + " is " + studentObject[i].getBranch());
				flag = false;
			}
		}
		if (flag) {
			System.out.println("There is no student with that name,please try again with a valid name:");
		}
	}

	private static void displayAllStudentDetails(Student[] studentObject, int arrayCount) {

		for (int i = 0; i < arrayCount; i++) {
			System.out.println(studentObject[i].getId() + "\t" + studentObject[i].getName() + "\t"
					+ studentObject[i].getBranch() + "\t" + studentObject[i].getAverageMarks());

		}
	}

	private static int chooseOption() {
		System.out.println("1.Create student data");
		System.out.println("2.Display all students");
		System.out.println("3.Display the branch of the student based on student name");
		System.out.println("4.Sort students based on their id's");
		System.out.println("5.Append degree in the branch for each student degree");
		System.out.println("6.Exit");
		return AllValidationChecks.positiveIntegerCheck();
	}

	private static int createStudent(Student[] studentObject, int arrayCount, int records) {

		if (arrayCount < records) {

			int id = validateId(studentObject, arrayCount);
			System.out.println("Enter student name:");
			AllValidationChecks.stringLineCheck();
			String name = AllValidationChecks.stringLineCheck();
			System.out.println("Enter student branch:");
			String branch = AllValidationChecks.stringLineCheck();
			System.out.println("Enter average marks of " + name);
			double averageMarks = AllValidationChecks.doubleCheck();

			studentObject[arrayCount] = new Student(id, name, branch, averageMarks);
			arrayCount++;
		} else {
			System.out.println("No data in the database,please try again");
		}
		return arrayCount;
	}

	private static int validateId(Student[] studentObject, int arrayCount) {
		boolean flag = true;
		System.out.println("Enter student id:");
		int id = AllValidationChecks.positiveIntegerCheck();
		for (int i = 0; i < arrayCount; i++) {
			if (id == studentObject[i].getId()) {
				flag = false;
			}
		}
		if (flag) {
			return id;
		} else {
			System.out.println("id already exists");
			return validateId(studentObject, arrayCount);
		}
	}
}
