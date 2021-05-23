package com.practice.problems;

import com.mindtreefirstset.validations.AllValidationChecks;

public class ZooApplication {

	public static void main(String[] args) {

		boolean isValid = true;
		int noOfZoos, arrayCount = 0;
		System.out.println("Enter no of Companies:");
		noOfZoos = AllValidationChecks.positiveIntegerCheck();
		Zoo[] zooObject = new Zoo[noOfZoos];
		do {
			switch (chooseOption()) {
			case 1:
				arrayCount = createZoo(zooObject, arrayCount, noOfZoos);
				break;
			case 2:
				zooObject = updateZoo(zooObject, arrayCount);
				break;
			case 3:
				arrayCount = deleteZoo(zooObject, arrayCount);
				break;
			case 4:
				displayZoos(zooObject, arrayCount);
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

	private static int createZoo(Zoo[] zooObject, int arrayCount, int noOfCompanies) {
		if (arrayCount < noOfCompanies) {
			int id = validateId(zooObject, arrayCount);
			System.out.println("Enter name:");
			AllValidationChecks.stringLineCheck();
			String name = AllValidationChecks.stringLineCheck();
			System.out.println("Enter no of cages::");
			int noOfCages = AllValidationChecks.positiveIntegerCheck();
			System.out.println("Enter zoo location");
			// we can take String but here i am taking long
			AllValidationChecks.stringLineCheck();
			String location = AllValidationChecks.stringLineCheck();
			zooObject[arrayCount] = new Zoo(id, name, noOfCages, location);
			arrayCount++;
//			display(companyObject, arrayCount);
		} else {
			System.out.println("There is no space in the database");
		}
		return arrayCount;
	}

	private static Zoo[] updateZoo(Zoo[] zooObject, int arrayCount) {
		System.out.println("Enter id:");
		int id = AllValidationChecks.positiveIntegerCheck();
		for (int i = 0; i < arrayCount; i++) {
			if (zooObject[i].getId() == id) {
				System.out.println("Enter no of cages you want to build:");
				zooObject[i].setNoOfCages(AllValidationChecks.positiveIntegerCheck());
			}
		}
		return zooObject;
	}

	private static int deleteZoo(Zoo[] zooObject, int arrayCount) {
		boolean flag = true;
		System.out.println("Enter id to delete that record:");
		int id = AllValidationChecks.positiveIntegerCheck();
		for (int i = 0; i < arrayCount; i++) {
			if (zooObject[i].getId() == id) {
				for (int j = i; j < arrayCount - 1; j++) {
					zooObject[j] = zooObject[j + 1];
					flag = false;
				}
			}
		}
		if (!flag) {
			arrayCount--;
			display(zooObject, arrayCount);
		}
		return arrayCount;
	}

	private static void displayZoos(Zoo[] zooObject, int arrayCount) {
		boolean isValid = true;
		do {
			switch (choosePhaseTwoOption()) {
			case 1:
				displayAllZoos(zooObject, arrayCount);
				break;
			case 2:
				sortZoosBasedOnId(zooObject, arrayCount);
				break;
			case 3:
				sortZooBasedOnLocation(zooObject, arrayCount);
				break;

			case 4:
				System.out.println("Going back to PHASE 1");
				isValid = false;
				break;
			default:
				System.out.println("Please choose the options btw 1-5");
				break;
			}
		} while (isValid);
	}

	private static void displayAllZoos(Zoo[] zooObject, int arrayCount) {
		display(zooObject, arrayCount);
	}

	private static void sortZoosBasedOnId(Zoo[] zooObject, int arrayCount) {
		if (arrayCount > 0) {

			System.out.println("sorting based on  ID");
			System.out.println("................................................");
			for (int i = 0; i < arrayCount; i++) {
				for (int j = 0; j < arrayCount - i - 1; j++) {
					if (zooObject[j].getId() < zooObject[j + 1].getId()) {
						Zoo temp = zooObject[j];
						zooObject[j] = zooObject[j + 1];
						zooObject[j + 1] = temp;
					}
				}
			}
//display the data after sorting
			display(zooObject, arrayCount);
		} else {
			System.out.println("There is no data in the database");
		}
	}

	private static void sortZooBasedOnLocation(Zoo[] zooObject, int arrayCount) {
		for (int i = 0; i < arrayCount; i++) {
			for (int j = 0; j < arrayCount - 1; j++) {
				if (zooObject[j].getLocation().compareTo(zooObject[j + 1].getLocation()) > 0) {
					Zoo temp = zooObject[j];
					zooObject[j] = zooObject[j + 1];
					zooObject[j + 1] = temp;
				} else if (zooObject[j].getLocation().compareTo(zooObject[j + 1].getLocation()) == 0) {
					if (zooObject[j].getName().compareTo(zooObject[j + 1].getName()) > 0) {
						Zoo temp = zooObject[j];
						zooObject[j] = zooObject[j + 1];
						zooObject[j + 1] = temp;
					}
				}
			}
		}
		display(zooObject, arrayCount);
	}

	private static int chooseOption() {
		System.out.println("********************Entered PHASE 1*********************");
		System.out.println("1.Create Zoo Details");
		System.out.println("2.Update Zoo Details");
		System.out.println("3.Delete Zoo Details");
		System.out.println("4.Display All the Zoo Details");
		System.out.println("5.Exit");
		return AllValidationChecks.positiveIntegerCheck();
	}

	private static int choosePhaseTwoOption() {
		System.out.println("********************Entered PHASE 2*********************");
		System.out.println("1.Display all the zoos details");
		System.out.println("2.Sort based on ID's");
		System.out.println("3.Sort Based on cities");
		System.out.println("4.Back to Phase 1");

		return AllValidationChecks.positiveIntegerCheck();
	}

	private static int validateId(Zoo[] zooObject, int arrayCount) {
		boolean flag = true;
		System.out.println("Enter company id:");
		int id = AllValidationChecks.positiveIntegerCheck();
		for (int i = 0; i < arrayCount; i++) {
			if (id == zooObject[i].getId()) {
				flag = false;
			}
		}
		if (flag) {
			return id;
		} else {
			System.out.println("id already exists");
			return validateId(zooObject, arrayCount);
		}
	}

	private static void display(Zoo[] zooObject, int arrayCount) {
		if (arrayCount > 0) {
			for (int i = 0; i < arrayCount; i++) {
				System.out.println(zooObject[i].getId() + "\t" + zooObject[i].getName() + "\t"
						+ zooObject[i].getNoOfCages() + "\t" + zooObject[i].getLocation());
			}
		} else {
			System.out.println("There is are no records in the database");
		}
	}

}
