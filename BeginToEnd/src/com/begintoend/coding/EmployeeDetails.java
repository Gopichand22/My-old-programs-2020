package com.begintoend.coding;

import com.mindtreefirstset.validations.AllValidationChecks;

public class EmployeeDetails {

	public static void main(String[] args) {
		int arrayCount = 0, records;
		Employee[] empObject;
		System.out.println("Enter the number of records");
		records = AllValidationChecks.integerCheck();
		empObject = new Employee[records];
		boolean isValid = true;
		do {
			switch (chooseOption()) {
			case 1:
				arrayCount = createEmployee(empObject, arrayCount, records);
				break;
			case 2:
				experienceOfEmployees(empObject, arrayCount);
				break;
			case 3:
				sortEmployeesBasedOnName(empObject, arrayCount);
				break;
			case 4:
				System.out.println("Exiting...");
				isValid = false;
				break;

			default:
				System.out.println("Choose correct option btw 1-4");
				break;
			}

		} while (isValid);

	}

	private static void sortEmployeesBasedOnName(Employee[] empObject, int arrayCount) {
		boolean isValid = true;
		do {
			switch (nestedChooseOption()) {
			case 1:
				sortUsingBubble(empObject, arrayCount);
				break;
			case 2:
				sortUsingInsertion(empObject, arrayCount);
				break;
			case 3:
				isValid = false;
				break;
			default:
				System.out.println("Please choose option btw 1-3");
				break;
			}
		} while (isValid);
	}

	private static void sortUsingInsertion(Employee[] empObject, int arrayCount) {
		if (arrayCount > 0) {
			System.out.println("Sorting name by using insertion sort technique");
			for (int i = 1; i < arrayCount; i++) {
				Employee key = empObject[i];
				int j = i - 1;
				while (j >= 0 && empObject[j].getName().compareTo(key.getName()) > 0) {
					empObject[j + 1] = empObject[j];
					j--;
				}
				empObject[j + 1] = key;
			}

			for (int i = 0; i < arrayCount; i++) {
				System.out.println(
						empObject[i].getName() + " " + empObject[i].getId() + " " + empObject[i].getYearOfExperience());
			}

		} else {
			System.out.println("Sorry No data in the database");
		}

	}

	private static void sortUsingBubble(Employee[] empObject, int arrayCount) {
		if (arrayCount > 0) {
			System.out.println("Sorting name by using bubble sort technique");
			System.out.println("...................................................................");
			for (int i = 0; i < arrayCount; i++) {
				for (int j = 0; j < arrayCount - i - 1; j++) {
					if (empObject[j].getName().compareTo(empObject[j + 1].getName()) > 0) {
						Employee temp = empObject[j];
						empObject[j] = empObject[j + 1];
						empObject[j + 1] = temp;
					}
				}
			}
			System.out.println("dispaly users based on name");
			System.out.println("...................................................................");
			for (int i = 0; i < arrayCount; i++) {
				System.out.println(
						empObject[i].getName() + " " + empObject[i].getId() + " " + empObject[i].getYearOfExperience());
			}
		} else {
			System.out.println("Sorry No data in the database");
		}
	}

	private static void experienceOfEmployees(Employee[] empObject, int arrayCount) {
		if (arrayCount > 0) {
			for (int i = 0; i < arrayCount; i++) {
				if (empObject[i].getYearOfExperience() > 10) {
					System.out.println(empObject[i].getId() + " " + empObject[i].getName() + " "
							+ empObject[i].getYearOfExperience());
				}
			}
		} else {
			System.out.println("There is no data in the database to showcase the details of employees");
		}
	}

	private static int createEmployee(Employee[] employeeObject, int arrayCount, int records) {
		if (arrayCount < records) {
			System.out.println("Enter id:");
			int id = AllValidationChecks.integerCheck();
			AllValidationChecks.stringLineCheck();
			System.out.println("Enter name:");
			String name = AllValidationChecks.stringLineCheck();
			System.out.println("Year of Experience:");
			int yearOfExperience = AllValidationChecks.positiveIntegerCheck();
			employeeObject[arrayCount] = new Employee(id, name, yearOfExperience);
			arrayCount++;
		} else {
			System.out.println("No space to add your data");
		}
		return arrayCount;
	}

	private static int chooseOption() {

		System.out.println("***********************Entered Phase 1**************************");
		System.out.println("1. Create Employee");
		System.out.println("2. Show all employees who is greater than 10 years of experience");
		System.out.println("3. Sort employees by name");
		System.out.println("4. Exit");
		return AllValidationChecks.positiveIntegerCheck();
	}

	private static int nestedChooseOption() {
		System.out.println("***********************Entered Phase 2**************************");
		System.out.println("1. sort using bubble sort");
		System.out.println("2. sort using insertion sort");
		System.out.println("3. Go back to Phase 1");
		return AllValidationChecks.positiveIntegerCheck();
	}
}
