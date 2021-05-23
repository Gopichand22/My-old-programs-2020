package com.begintoend.coding;

import com.mindtreefirstset.validations.AllValidationChecks;

public class StudentDetails {

	public static void main(String[] args) {
		int arrayCount = 0, records;
		Student32[] stuObject;
		System.out.println("Enter the number of records");
		records = AllValidationChecks.integerCheck();
		stuObject = new Student32[records];
		boolean isValid = true;
		do {
			switch (chooseOption()) {
			case 1:
				arrayCount = AddStudentDetails(stuObject, arrayCount, records);
				break;
			case 2:
				stuObject = enrollCousreBasedOnId(stuObject, arrayCount);
				break;
			case 3:
				displayStudentDetails(stuObject, arrayCount);
				break;
			case 4:
				fetchStudentCountBasedOnCourse(stuObject, arrayCount);
				break;
			case 5:
				stuObject = sortBasedOnEnrolledCourses(stuObject, arrayCount);
				break;
			case 6:
				System.out.println("Exiting...");
				isValid = false;
				break;

			default:
				System.out.println("Choose correct option btw 1-4");
				break;
			}

		} while (isValid);
	}

	private static Student32[] sortBasedOnEnrolledCourses(Student32[] stuObject, int arrayCount) {
		if (arrayCount > 0) {

			System.out.println("Sorting based on enrolled courses");
			System.out.println("...................................................................");
			for (int i = 0; i < arrayCount; i++) {
				for (int j = 0; j < arrayCount - i - 1; j++) {
					if (stuObject[j].getCourse().compareTo(stuObject[j + 1].getCourse()) > 0) {
						Student32 temp5 = stuObject[j];
						stuObject[j] = stuObject[j + 1];
						stuObject[j + 1] = temp5;
					}
				}
			}
			System.out.println("dispaly users based on name");
			System.out.println("...................................................................");
			for (int i = 0; i < arrayCount; i++) {
				System.out.println(stuObject[i].getCourse() + " " + stuObject[i].getFirstName() + " "
						+ stuObject[i].getSecondName() + " " + stuObject[i].getAddress() + "\n\n");
			}
		} else {
			System.out.println("No data found");
		}
		return stuObject;
	}

	private static void fetchStudentCountBasedOnCourse(Student32[] stuObject, int arrayCount) {
		int count = 0;
		System.out.println("Enter course to count the total enrolled students list");
		System.out.println("Courses that we provide:[C/Java/C#/Python/AWS]");
		String course = validateCourse();
		for (int i = 0; i < arrayCount; i++) {
			if (stuObject[i].getCourse().equals(course)) {
				count++;
			}
		}
		System.out.println("list of students enrolled for course " + count);
	}

	private static void displayStudentDetails(Student32[] stuObject, int arrayCount) {
		if (arrayCount > 0) {

			System.out.println("Sorting based on name");
			System.out.println("...................................................................");
			for (int i = 0; i < arrayCount; i++) {
				for (int j = 0; j < arrayCount - i - 1; j++) {
					if (stuObject[j].getFirstName().compareTo(stuObject[j + 1].getFirstName()) > 0) {
						Student32 temp5 = stuObject[j];
						stuObject[j] = stuObject[j + 1];
						stuObject[j + 1] = temp5;
					}
				}
			}
			System.out.println("dispaly users based on name");
			System.out.println("...................................................................");
			for (int i = 0; i < arrayCount; i++) {
				System.out.println(stuObject[i].getFirstName() + " " + stuObject[i].getSecondName() + " "
						+ stuObject[i].getAddress() + " " + stuObject[i].getId() + " " + stuObject[i].getCourse()
						+ "\n\n");
			}
		} else {
			System.out.println("No data found");
		}

	}

	private static Student32[] enrollCousreBasedOnId(Student32[] stuObject, int arrayCount) {
		if (arrayCount > 0) {
			System.out.println("Enter registered student Id:");
			int id = AllValidationChecks.positiveIntegerCheck();
			for (int i = 0; i < arrayCount; i++) {
				if (stuObject[i].getId() == id) {
					System.out.println("Courses that we provide:[C/Java/C#/Python/AWS]");
					String course = validateCourse();
					stuObject[i].setCourse(course);
				}
			}

		} else {
			System.out.println("No Data in the database");
		}
		return stuObject;
	}

	private static String validateCourse() {
		String str = AllValidationChecks.stringCheck();
		if (str.equals("C") || str.equals("java") || str.equals("C#") || str.equals("c") || str.equals("c#")
				|| str.equals("python") || str.equals("AWS") || str.equals("aws")) {
			return str;
		} else {
			System.out.println("We dont provide that cousrse,try existing course");
			return validateCourse();
		}
	}

	private static int AddStudentDetails(Student32[] stuObject, int arrayCount, int records) {
		if (arrayCount < records) {
			System.out.println("Enter id:");
			int id = AllValidationChecks.integerCheck();
			AllValidationChecks.stringLineCheck();
			System.out.println("Enter first name:");
			String firstName = AllValidationChecks.stringCheck();
			System.out.println("Enter second name:");
			String secondName = AllValidationChecks.stringCheck();
			System.out.println("Enter address:");
			String address = AllValidationChecks.stringCheck();
			String course = null;
			stuObject[arrayCount] = new Student32(id, firstName, secondName, address, course);
			arrayCount++;
		} else {
			System.out.println("No space to add your data");
		}
		return arrayCount;
	}

	private static int chooseOption() {
		System.out.println("1.Add Student details");
		System.out.println("2.Enroll course for a student who is already registered");
		System.out.println("3.Display student details based on first name");
		System.out.println("4.Fetch student count for given course");
		System.out.println("5.Display student details sorting by courses");
		System.out.println("6.Exit");

		return AllValidationChecks.positiveIntegerCheck();
	}

}
