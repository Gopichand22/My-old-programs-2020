package com.code.reviews;

import java.util.Scanner;

import com.mindtreefirstset.validations.AllValidationChecks;

public class Company {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean isValid = true;
		int noOfEmployees, arrayCount = 0;
		System.out.println("Enter no of Employees:");
		noOfEmployees = AllValidationChecks.positiveIntegerCheck();
		Employee01[] employeesObject = new Employee01[noOfEmployees];
		do {
			switch (chooseOption()) {
			case 1:
				arrayCount = addEmployee(employeesObject, arrayCount, noOfEmployees);
				break;
			case 2:
				displayAllEmployees(employeesObject, arrayCount);
				break;
			case 3:
				displayBasedOnReportingManager(employeesObject, arrayCount);
				break;
			case 4:
				employeesObject = sortBasedOnDesignation(employeesObject, arrayCount);
				break;
			case 5:
				displayAllEmployeesBasedOnSalaryRange(employeesObject, arrayCount);
				break;
			case 6:
				System.out.println("Exiting...Bye");
				isValid = false;
				break;
			default:
				System.out.println("Please choose the options btw 1-6");
				break;
			}

		} while (isValid);
	}

	private static int chooseOption() {
		System.out.println("1.Add employee details");
		System.out.println("2.Display all employess");
		System.out.println("3.Display based on reporting manager if same manager then sort based on employee name");
		System.out.println("4.Display based on designation");
		System.out.println(
				"5.Display all employees based on salary range if same salary then sort based on employee name");
		System.out.println("6.Exit");
		return AllValidationChecks.positiveIntegerCheck();
	}

//Add employess to database
	private static int addEmployee(Employee01[] employeesObject, int arrayCount, int noOfEmployees) {
		if (arrayCount < noOfEmployees) {
			System.out.println("Enter MID:");
			String id = sc.nextLine();
			System.out.println("Enter employee name:");
			AllValidationChecks.stringLineCheck();
			String name = AllValidationChecks.stringLineCheck();
			System.out.println("Enter salary:");
			double salary = AllValidationChecks.positiveIntegerCheck();
			System.out.println("Enter Designation:");
			AllValidationChecks.stringLineCheck();
			String designation = AllValidationChecks.stringLineCheck();
			System.out.println("Enter Reporting manager:");
			String reportingManager = AllValidationChecks.stringLineCheck();

			employeesObject[arrayCount] = new Employee01(id, name, salary, designation, reportingManager);
			arrayCount++;
		} else {
			System.out.println("There is no space in the database");
		}
		return arrayCount;
	}

//display employeess
	private static void displayAllEmployees(Employee01[] employeeObject, int arrayCount) {
		if (arrayCount > 0) {
			System.out.println("Total number of Employees: " + arrayCount);
			for (int i = 0; i < arrayCount; i++) {
				System.out.println(employeeObject[i].getId() + "\t" + employeeObject[i].getName() + "\t"
						+ employeeObject[i].getSalary() + "\t" + employeeObject[i].getDesignation() + "\t"
						+ employeeObject[i].getReportingManager());
			}
		} else {
			System.out.println("There is no data in the database");
		}
	}

//display based on reporting manager	
	private static void displayBasedOnReportingManager(Employee01[] employeeObject, int arrayCount) {
		if (arrayCount > 0) {
			for (int i = 0; i < arrayCount; i++) {
				for (int j = 0; j < arrayCount - 1; j++) {
					if (employeeObject[j].getReportingManager()
							.compareTo(employeeObject[j + 1].getReportingManager()) > 0) {
						Employee01 temp = employeeObject[j];
						employeeObject[j] = employeeObject[j + 1];
						employeeObject[j + 1] = temp;
					} else if (employeeObject[j].getReportingManager()
							.compareTo(employeeObject[j + 1].getReportingManager()) == 0) {
						if (employeeObject[j].getName().compareTo(employeeObject[j + 1].getName()) > 0) {
							Employee01 temp = employeeObject[j];
							employeeObject[j] = employeeObject[j + 1];
							employeeObject[j + 1] = temp;
						}
					}
				}
			}
			displayAllEmployees(employeeObject, arrayCount);

		} else {
			System.out.println("There is no data in the database");
		}
	}

//diaplaly all employeess based on salary range
	private static void displayAllEmployeesBasedOnSalaryRange(Employee01[] employeeObject, int arrayCount) {
		if (arrayCount > 0) {
			for (int i = 0; i < arrayCount; i++) {
				if (employeeObject[i].getSalary() >= 10000 && employeeObject[i].getSalary() <= 20000) {
					for (int j = 0; j < arrayCount - i - 1; j++) {
						if (employeeObject[j].getSalary() == employeeObject[j + 1].getSalary()) {
							if (employeeObject[j].getName().compareTo(employeeObject[j + 1].getName()) > 0) {
								Employee01 temp = employeeObject[j];
								employeeObject[j] = employeeObject[j + 1];
								employeeObject[j + 1] = temp;
							}
						}
					}
					System.out.println(employeeObject[i].getId() + "\t" + employeeObject[i].getName() + "\t"
							+ employeeObject[i].getSalary() + "\t" + employeeObject[i].getDesignation() + "\t"
							+ employeeObject[i].getReportingManager());
				}
			}

			displayAllEmployees(employeeObject, arrayCount);

		} else {
			System.out.println("There is no data in the database");
		}
	}

//display based on designation
	private static Employee01[] sortBasedOnDesignation(Employee01[] employeeObject, int arrayCount) {
		if (arrayCount > 0) {
			System.out.println("sorting based on designation:");
			System.out.println("................................................");
			for (int i = 0; i < arrayCount; i++) {
				for (int j = 0; j < arrayCount - i - 1; j++) {
					if (employeeObject[j].getDesignation().compareTo(employeeObject[j + 1].getDesignation()) > 0) {
						Employee01 temp = employeeObject[j];
						employeeObject[j] = employeeObject[j + 1];
						employeeObject[j + 1] = temp;
					}
				}
			}
			displayAllEmployees(employeeObject, arrayCount);
		} else {
			System.out.println("There is no data in the database");
		}
		return employeeObject;
	}

}
