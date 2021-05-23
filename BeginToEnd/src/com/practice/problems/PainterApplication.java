package com.practice.problems;

import com.mindtreefirstset.validations.AllValidationChecks;

public class PainterApplication {

	public static void main(String[] args) {

		boolean isValid = true;
		int noOfPainters, arrayCount = 0;
		System.out.println("Enter no of painters/artists:");
		noOfPainters = AllValidationChecks.positiveIntegerCheck();
		// painter is a pre defined interface so unable to create it.
		Artist[] painterObject = new Artist[noOfPainters];
		do {
			switch (chooseOption()) {
			case 1:
				arrayCount = registerPainter(painterObject, arrayCount, noOfPainters);
				break;
			case 2:
				searchPainterById(painterObject, arrayCount);
				break;
			case 3:
				painterObject = sortAllPaintersBasedOnTheirCharge(painterObject, arrayCount);
				break;
			case 4:
				displayPaintersInARange(painterObject, arrayCount);
				break;
			case 5:
				calculateSquareFeetCharge(painterObject, arrayCount);
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

//register painters
	private static int registerPainter(Artist[] painterObject, int arrayCount, int noOfPainters) {
		if (arrayCount < noOfPainters) {
			int id = validateId(painterObject, arrayCount);
			AllValidationChecks.stringLineCheck();
			System.out.println("Enter Name:");
			String name = AllValidationChecks.stringLineCheck();
			System.out.println("Enter mobile number:");
			String mobileNumber = AllValidationChecks.stringMobileNumberCheck();
			AllValidationChecks.validateStringAddress();
			System.out.println("Enter City:");
			String city = AllValidationChecks.validateStringAddress();
			System.out.println("Charge per SquareFeet:");
			double sqFeetCharge = AllValidationChecks.doubleCheck();
			painterObject[arrayCount] = new Artist(id, name, mobileNumber, city, sqFeetCharge);
			arrayCount++;
		} else {
			System.out.println("There is no space in the database");
		}
		return arrayCount;
	}

//search painters by id
	private static void searchPainterById(Artist[] painterObject, int arrayCount) {
		boolean flag = true;
		System.out.println("Enter an id to get the details of painter:");
		int id = AllValidationChecks.positiveIntegerCheck();
		for (int i = 0; i < arrayCount; i++) {
			if (id == painterObject[i].getId()) {
				System.out.println(painterObject[i].getId() + "\t" + painterObject[i].getName() + "\t"
						+ painterObject[i].getMobileNumber() + "\t" + painterObject[i].getCity() + "\t"
						+ painterObject[i].getSqFeetCharge());
				flag = false;
			}
		}
		if (flag) {
			System.out.println("Entered id is not present in the database,try again");
			searchPainterById(painterObject, arrayCount);
		}
	}

//sorting all painters based on charges
	private static Artist[] sortAllPaintersBasedOnTheirCharge(Artist[] painterObject, int arrayCount) {
		if (arrayCount > 0) {

			System.out.println("sorting based on charges");
			System.out.println("................................................");
			for (int i = 0; i < arrayCount; i++) {
				for (int j = 0; j < arrayCount - i - 1; j++) {
					if (painterObject[j].getSqFeetCharge() > painterObject[j + 1].getSqFeetCharge()) {
						Artist temp = painterObject[j];
						painterObject[j] = painterObject[j + 1];
						painterObject[j + 1] = temp;
					}
				}
			}
//display the data after sorting
			display(painterObject, arrayCount);

		} else {
			System.out.println("There is no data in the database");
		}
		return painterObject;
	}

//display data method
	private static void display(Artist[] painterObject, int arrayCount) {
		for (int i = 0; i < arrayCount; i++) {
			System.out.println(painterObject[i].getId() + "\t" + painterObject[i].getName() + "\t"
					+ painterObject[i].getMobileNumber() + "\t" + painterObject[i].getCity() + "\t"
					+ painterObject[i].getSqFeetCharge());
		}
	}

//display all painters based on charges range
	private static void displayPaintersInARange(Artist[] painterObject, int arrayCount) {
		if (arrayCount > 0) {
			boolean flag = true, flag1 = true;
			AllValidationChecks.stringLineCheck();
			System.out.println("Enter city name:");
			String city = AllValidationChecks.stringLineCheck();
			System.out.println("Enter range of painter charges:");
			System.out.println("Enter starting Price:");
			double start = AllValidationChecks.doubleCheck();
			System.out.println("Enter ending Price");
			double end = AllValidationChecks.doubleCheck();
			for (int i = 0; i < arrayCount; i++) {
				if (city.equals(painterObject[i].getCity())) {
					if (painterObject[i].getSqFeetCharge() >= start && painterObject[i].getSqFeetCharge() <= end) {
						System.out.println(painterObject[i].getId() + "\t" + painterObject[i].getName() + "\t"
								+ painterObject[i].getMobileNumber() + "\t" + painterObject[i].getCity() + "\t"
								+ painterObject[i].getSqFeetCharge());
						flag = false;
					}
					flag1 = false;
				}
			}
			if (flag1) {
				System.out.println("There are no painters available in that AREA/LOCATION");
				flag = false;
			}
			if (flag) {
				System.out.println("There are no painters available in that PRICE RANGE");
			}
		} else {
			System.out.println("There is no data in the database");
		}
	}

//Display all painters quotation for given sqfeet
	private static void calculateSquareFeetCharge(Artist[] painterObject, int arrayCount) {
		System.out.println("Enter total square feet that you need to be painted:");
		double sqFeet = AllValidationChecks.doubleCheck();
		for (int i = 0; i < arrayCount; i++) {
			System.out.println(painterObject[i].getId() + "\t" + painterObject[i].getName() + "\t"
					+ painterObject[i].getMobileNumber() + "\t" + painterObject[i].getCity() + "\t"
					+ (painterObject[i].getSqFeetCharge() * sqFeet));
		}
	}

//main menu
	private static int chooseOption() {
		System.out.println("1.Register painter");
		System.out.println("2.Search painter by ID");
		System.out.println("3.Sort all Painter details by their charge per sq feet");
		System.out.println("4.Display available painter details ");
		System.out.println("5.Display data in particular price range and in particular city");
		System.out.println("6.Exit");
		return AllValidationChecks.positiveIntegerCheck();
	}

// validate id whether it is unique or not
	private static int validateId(Artist[] painterObject, int arrayCount) {
		boolean flag = true;
		System.out.println("Enter painter id:");
		int id = AllValidationChecks.positiveIntegerCheck();
		for (int i = 0; i < arrayCount; i++) {
			if (id == painterObject[i].getId()) {
				flag = false;
			}
		}
		if (flag) {
			return id;
		} else {
			System.out.println("id already exists");
			return validateId(painterObject, arrayCount);
		}
	}

}
