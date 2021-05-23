package com.begintoend.coding;

import com.mindtreefirstset.validations.AllValidationChecks;

public class LuxaryCarTestDrive {

	public static void main(String[] args) {
		int arrayCount = 0, noOfCars;
		boolean isValid = true;
		System.out.println("Enter the number of cars in showroom");
		noOfCars = AllValidationChecks.integerCheck();
		BookCar[] carObject = new BookCar[noOfCars];
		do {
			switch (chooseOption()) {
			case 1:
				arrayCount = addCarDetails(carObject, noOfCars, arrayCount);
				break;
			case 2:
				bookTestDrive(carObject, arrayCount);
				break;
			case 3:
				findAvailabilityOfCarForTestDrive(carObject, arrayCount);
				break;
			case 4:
				display(carObject, arrayCount);
				break;
			case 5:
				System.out.println("Exiting...Bye\nVisit Again");
				isValid = false;
				break;
			}

		} while (isValid);
	}

	private static void display(BookCar[] carObject, int arrayCount) {
		boolean isValid = true;
		do {
			switch (chooseNestedOption()) {
			case 1:
				carObject = sortCarsBasedOnPrice(carObject, arrayCount);
				break;
			case 2:
				carObject = sortCarsInParticularPriceRange(carObject, arrayCount);
				break;
			case 3:
				System.out.println("Back to phase 1");
				isValid = false;
				break;
			}
		} while (isValid);

	}

	private static BookCar[] sortCarsInParticularPriceRange(BookCar[] carObject, int arrayCount) {

		return null;
	}

	private static BookCar[] sortCarsBasedOnPrice(BookCar[] carObject, int arrayCount) {
		if (arrayCount > 0) {

			System.out.println("Display by address");
			System.out.println("...................................................................");
			// bubble sort
			for (int i = 0; i < arrayCount; i++) {
				for (int j = 0; j < arrayCount - i - 1; j++) {
					if (carObject[j].getPrice() > carObject[j + 1].getPrice()) {
						BookCar temp5 = carObject[j];
						carObject[j] = carObject[j + 1];
						carObject[j + 1] = temp5;
					}
				}
			}

			System.out.println("display users based on address");
			display(carObject, arrayCount, 2);

		} else {
			System.out.println("No data found");
		}
		return carObject;
	}

//phase2 menu
	private static int chooseNestedOption() {
		System.out.println("********************Entered Phase 2************************");
		System.out.println("1.Display All cars sorted based on price");
		System.out.println("2.Display Cars in particular Range");
		System.out.println("3.Go back to phase 1");
		return AllValidationChecks.positiveIntegerCheck();
	}

//check availabilty of car time slots
	private static void findAvailabilityOfCarForTestDrive(BookCar[] carObject, int arrayCount) {
		display(carObject, arrayCount, 2);
		boolean flag = true;
		System.out.println("Enter car id");
		int id = AllValidationChecks.positiveIntegerCheck();
		for (int i = 0; i < arrayCount; i++) {
			if (carObject[i].getId() == id) {
				System.out.println(
						"Test drive for " + carObject[i].getBrand() + " is available at " + carObject[i].getTime());
				flag = false;
			}
		}
		if (flag) {
			System.out.println("There is no such ID in the database,please try again");
			display(carObject, arrayCount, 2);
		}
	}

//car details adding to database
	private static int addCarDetails(BookCar[] carObject, int noOfCars, int arrayCount) {

		if (arrayCount < noOfCars) {
			System.out.println("Enter car id");
			int id = AllValidationChecks.positiveIntegerCheck();
			System.out.println("Enter car name");
			String brand = AllValidationChecks.stringLineCheck();
			System.out.println("Available TimeSlot for a test drive");
			String time = validateTime();
			System.out.println("Enter Price of the car");
			double price = AllValidationChecks.doubleCheck();
			carObject[arrayCount] = new BookCar(id, brand, time, price);
			arrayCount++;
		} else {
			System.out.println("There is no space in the database");
		}
		return arrayCount;
	}

//booking test drive 
	private static void bookTestDrive(BookCar[] carObject, int arrayCount) {
		displayCars(carObject, arrayCount);
		boolean flag = true;
		System.out.println("Enter car Id:");
		int id = AllValidationChecks.integerCheck();
		System.out.println("enter time slot for test drive");
		String time = validateTime();
		for (int i = 0; i < arrayCount; i++) {
			if (id == carObject[i].getId() && time.equals(carObject[i].getTime())) {
				System.out.println(
						"You booked a test drive of " + carObject[i].getBrand() + " at " + carObject[i].getTime());
				flag = false;
			}
		}
		if (flag) {
			System.out.println("Sorry for the inconvenience please check time slots at option 3 and then book a drive");
		}
	}

//main menu
	private static int chooseOption() {

		System.out.println("********************Entered Phase 1************************");
		System.out.println("1.Add cars and their available time slots");
		System.out.println("2.Book for a test drive");
		System.out.println("3.Find available timeSlot based on car id");
		System.out.println("4.Display");
		System.out.println("5.Exit");
		return AllValidationChecks.integerCheck();
	}

	private static String validateTime() {

		String string1 = AllValidationChecks.stringCheck();// 12:15
		String[] time = splittingMethod(string1, ':');// 12 15

		for (int i = 0; i < time.length - 1; i++) {// 12
			for (int j = 0; j < time[i].length() - 1; j++) {
				int k = time[i].charAt(j) - 48;// 1=49-48 we get 1
				int l = time[i].charAt(j + 1) - 48;// 2=50-48 we get 2
				if (k >= 0 && k <= 1) {
					if (l >= 0 && l <= 9) {

					} else {
						System.out.println("Invalid time Format");
						string1 = validateTime();
					}
				} else if (k == 2) {
					if (l >= 0 && l <= 4) {

					} else {
						System.out.println("Invalid time Format");
						string1 = validateTime();
					}
				}
			}
		}
		for (int i = 1; i < time.length; i++) {// 15
			for (int j = 0; j < time[i].length() - 1; j++) {
				int k = time[i].charAt(j) - 48;// 1=49-48 we get 1
				int l = time[i].charAt(j + 1) - 48;// 5=53-48 we get 5
				if (k >= 0 && k <= 5) {
					if (l >= 0 && l <= 9) {

					} else {
						System.out.println("Invalid time Format");
						string1 = validateTime();
					}
				}
			}
		}
		return string1;
	}

	private static String[] splittingMethod(String string1, char c) {

		int count = 1;
		for (int i = 0; i < string1.length(); i++) {
			if (string1.charAt(i) == c) {
				count++;
			}
		}
		String words[] = new String[count];
		String temp = "";
		int j = 0;
		for (int i = 0; i < string1.length(); i++) {
			if (string1.charAt(i) != c) {
				temp = temp + string1.charAt(i);
				words[j] = temp;
			} else {
				j++;
				temp = "";
			}
		}
		return words;
	}

	private static void display(BookCar[] carObject, int arrayCount, int notRequired) {

		for (int i = 0; i < carObject.length; i++) {
			System.out.println(carObject[i].getId() + "\t" + carObject[i].getBrand() + "\t" + carObject[i].getTime()
					+ "\t" + carObject[i].getPrice());
		}
	}

	private static void displayCars(BookCar[] carObject, int arrayCount) {
		for (int i = 0; i < carObject.length; i++) {
			System.out.println(carObject[i].getId() + "\t" + carObject[i].getBrand() + "\t" + carObject[i].getPrice());

		}
	}
}
