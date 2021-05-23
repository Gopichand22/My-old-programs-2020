package com.practice.problems;

import com.mindtreefirstset.validations.AllValidationChecks;

public class ManufacturingCompany {

	public static void main(String[] args) {
		boolean isValid = true;
		int noOfCompanies, arrayCount = 0;
		System.out.println("Enter no of Companies:");
		noOfCompanies = AllValidationChecks.positiveIntegerCheck();
		Company[] companyObject = new Company[noOfCompanies];
		do {
			switch (chooseOption()) {
			case 1:
				arrayCount = addACompany(companyObject, arrayCount, noOfCompanies);
				break;
			case 2:
				displayInARange(companyObject, arrayCount);
				break;
			case 3:
				companyObject = sortAllCompaniesBasedOnYearlyTurnover(companyObject, arrayCount);
				break;
			case 4:
				companyObject = increaseCompaniesEmployeeCount(companyObject, arrayCount);
				break;
			case 5:
				System.out.println("Exiting...Bye");
				isValid = false;
				break;
			default:
				System.out.println("Please choose the options btw 1-5");
				break;
			}

		} while (isValid);
	}

//Add company details and show the existing companies data in the database
	private static int addACompany(Company[] companyObject, int arrayCount, int noOfCompanies) {
		if (arrayCount < noOfCompanies) {
			int id = validateId(companyObject, arrayCount);
			System.out.println("Enter name:");
			AllValidationChecks.stringLineCheck();
			String name = AllValidationChecks.stringLineCheck();
			int year = validateYear();
			System.out.println("Employee Count:");
			int employeeCount = AllValidationChecks.positiveIntegerCheck();
			System.out.println("Yearly TurnOver:");
			// we can take String but here i am taking long
			long turnOver = AllValidationChecks.positiveLongCheck();
			companyObject[arrayCount] = new Company(id, name, year, employeeCount, turnOver);
			arrayCount++;
			display(companyObject, arrayCount);
		} else {
			System.out.println("There is no space in the database");
		}
		return arrayCount;
	}

//validate year 
	private static int validateYear() {
		System.out.println("Enter year of Establishment:");
		int year = AllValidationChecks.positiveIntegerCheck();
		if (year > 1800 && year < 2021) {
			return year;
		} else {
			System.out.println("Please enter correct companie's year of establishment.");
			return validateYear();
		}
	}

//display companies in the given range
	private static void displayInARange(Company[] companyObject, int arrayCount) {
		System.out.println("Display coompanies which are established btw these years");
		System.out.println("Enter from year");
		int fromYear = AllValidationChecks.positiveIntegerCheck();
		System.out.println("Enter to year");
		int toYear = AllValidationChecks.positiveIntegerCheck();
		for (int i = 0; i < arrayCount; i++) {
			if (companyObject[i].getYear() >= fromYear && companyObject[i].getYear() <= toYear) {
				System.out.println(
						companyObject[i].getId() + "\t" + companyObject[i].getName() + "\t" + companyObject[i].getYear()
								+ "\t" + companyObject[i].getEmployeeCount() + "\t" + companyObject[i].getTurnOver());
			}
		}
	}

//Sort All Companies Based On Yearly Turnover
	private static Company[] sortAllCompaniesBasedOnYearlyTurnover(Company[] companyObject, int arrayCount) {
		if (arrayCount > 0) {

			System.out.println("sorting based on yearly TurnOver");
			System.out.println("................................................");
			for (int i = 0; i < arrayCount; i++) {
				for (int j = 0; j < arrayCount - i - 1; j++) {
					if (companyObject[j].getTurnOver() < companyObject[j + 1].getTurnOver()) {
						Company temp = companyObject[j];
						companyObject[j] = companyObject[j + 1];
						companyObject[j + 1] = temp;
					}
				}
			}
//display the data after sorting
			display(companyObject, arrayCount);

		} else {
			System.out.println("There is no data in the database");
		}
		return companyObject;
	}

//case 4 increase employees 10% based on id
	private static Company[] increaseCompaniesEmployeeCount(Company[] companyObject, int arrayCount) {

		System.out.println("Enter Id of the company to increase 10% of its employees");
		int id = AllValidationChecks.positiveIntegerCheck();
		for (int i = 0; i < arrayCount; i++) {
			if (id == companyObject[i].getId()) {
				companyObject[i].setEmployeeCount(
						(int) (companyObject[i].getEmployeeCount() + companyObject[i].getEmployeeCount() * 0.1));
				display(companyObject, arrayCount);
			}
		}

		return companyObject;
	}

//display method
	private static void display(Company[] companyObject, int arrayCount) {
		for (int i = 0; i < arrayCount; i++) {
			System.out.println(
					companyObject[i].getId() + "\t" + companyObject[i].getName() + "\t" + companyObject[i].getYear()
							+ "\t" + companyObject[i].getEmployeeCount() + "\t" + companyObject[i].getTurnOver());
		}
	}

//validate id ,Id should me unique
	private static int validateId(Company[] companyObject, int arrayCount) {
		boolean flag = true;
		System.out.println("Enter company id:");
		int id = AllValidationChecks.positiveIntegerCheck();
		for (int i = 0; i < arrayCount; i++) {
			if (id == companyObject[i].getId()) {
				flag = false;
			}
		}
		if (flag) {
			return id;
		} else {
			System.out.println("id already exists");
			return validateId(companyObject, arrayCount);
		}
	}

//Main Menu
	private static int chooseOption() {
		System.out.println("1.Add a New Company and Display All Companies which are there in the database");
		System.out.println("2.Display All companies by year range");
		System.out.println("3.Sort all companies by years TurnOver");
		System.out.println("4.Increase company's employee count by 10%");
		System.out.println("5.Exit");
		return AllValidationChecks.positiveIntegerCheck();
	}

}
