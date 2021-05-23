package com.begintoend.coding;

import java.util.Scanner;

import com.mindtreefirstset.validations.AllValidationChecks;

public class CarManufacturerApp {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int arrayCount = 0;
		Car[] carObject = null;
		boolean isValid = true;
		do {
			switch (chooseOption()) {
			case 1:
				carObject = createCarObjs();
				break;
			case 2:
				arrayCount = enterDetails(carObject, arrayCount);
				break;
			case 3:
				PrintAllCarDetails(carObject, arrayCount);
				break;
			case 4:
				getSpeedByName(carObject, arrayCount);
				break;
			case 5:
				sortNameUsingBubble(carObject, arrayCount);
				break;
			case 6:
				carObject = sortNameUsingInsertion(carObject, arrayCount);
				break;
			case 7:
				searchCarUsingBinarySearch(carObject, arrayCount);
				break;
			case 8:
				System.out.println("Exiting....");
				isValid = false;
				break;
			default:
				System.out.println("Please choose correct optioin btw 1-6:");
				break;
			}

		} while (isValid);
	}

// case 7
	private static void searchCarUsingBinarySearch(Car[] carObject, int arrayCount) {

		System.out.println("Give speed to get the car name and color:");
		int key = AllValidationChecks.integerCheck();
		int left = 0, right = arrayCount - 1, mid;
		boolean flag = true;
		while (left <= right) {
			mid = (left + right) / 2;
			if (key == carObject[mid].getSpeed()) {
				System.out.println(carObject[mid].getName() + " " + carObject[mid].getColor());
				flag = false;
				break;
			} else if (key < carObject[mid].getSpeed()) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		if (flag) {
			System.out.println("No car has that speed");
		}
	}

// case 6
	private static Car[] sortNameUsingInsertion(Car[] carObject, int arrayCount) {
		if (arrayCount > 0) {
			System.out.println("Used insertion sort");
			for (int i = 1; i < arrayCount; i++) {
				Car key = carObject[i];
				int j = i - 1;
				while (j >= 0 && carObject[j].getSpeed() < key.getSpeed()) {
					carObject[j + 1] = carObject[j];
					j--;
				}
				carObject[j + 1] = key;
			}

			for (int i = 0; i < arrayCount; i++) {
				System.out.println(carObject[i].getName() + " " + carObject[i].getId() + " " + carObject[i].getColor()
						+ " " + carObject[i].getType() + "\n\n");
			}
		} else {
			System.out.println("No data Found");
		}
		return carObject;
	}

// case 5
	private static void sortNameUsingBubble(Car[] carObject, int arrayCount) {
		if (arrayCount > 0) {
			System.out.println("Sorting based on name(BS)");
			for (int i = 0; i < arrayCount; i++) {
				for (int j = 0; j < arrayCount - i - 1; j++) {
					if (carObject[j].getName().compareTo(carObject[j + 1].getName()) > 0) {
						Car temp5 = carObject[j];
						carObject[j] = carObject[j + 1];
						carObject[j + 1] = temp5;
					}
				}
			}
			System.out.println("dispaly users based on name");
			System.out.println("...................................................................");
			for (int i = 0; i < arrayCount; i++) {
				System.out.println(carObject[i].getName() + " " + carObject[i].getId() + " " + carObject[i].getColor()
						+ " " + carObject[i].getType() + "\n\n");
			}
		} else {
			System.out.println("No data found");
		}
	}

// case 4
	private static void getSpeedByName(Car[] carObject, int arrayCount) {
		System.out.println("Enter a car name to find speed of the car:");
		AllValidationChecks.stringLineCheck();
		String carName = AllValidationChecks.stringLineCheck();
		for (int i = 0; i < carObject.length; i++) {
			if (carObject[i].getName().equals(carName)) {
				System.out.println(carObject[i].getSpeed());
			}
		}
	}

// case 3
	private static void PrintAllCarDetails(Car[] carObject, int arrayCount) {
		if (arrayCount > 0) {
			for (int i = 0; i < arrayCount; i++) {
				System.out.println(carObject[i].getName() + " " + carObject[i].getType() + " " + carObject[i].getId()
						+ " " + carObject[i].getColor() + " " + carObject[i].getSeats() + " "
						+ carObject[i].getSpeed());
			}
		}
	}

// case 2
	private static int enterDetails(Car[] carObject, int arrayCount) {
		if (carObject != null) {
			if (arrayCount < carObject.length) {
				System.out.println("Enter Car Name:");
				AllValidationChecks.stringLineCheck();
				String name = AllValidationChecks.stringLineCheck();
				System.out.println("Enter car type:(p:petrol,d:Diesel):");
				String type = AllValidationChecks.stringCheck();
				System.out.println("Car Id:");
				int id = AllValidationChecks.positiveIntegerCheck();
				System.out.println("Car Color:");
				String color = AllValidationChecks.stringCheck();
				System.out.println("Number of seats:");
				byte seats = sc.nextByte();
				System.out.println("Speed of the car:");
				int speed = AllValidationChecks.positiveIntegerCheck();
				carObject[arrayCount] = new Car(name, type, id, color, seats, speed);
				arrayCount++;
			} else {
				System.out.println("No Space in the database");
			}
		} else {
			System.out.println("initially please go with option 1.");

		}
		return arrayCount;
	}

// case 1
	private static Car[] createCarObjs() {
		System.out.println("Enter the number of cars records");
		int records = AllValidationChecks.positiveIntegerCheck();
		Car[] objs;
		objs = new Car[records];
		return objs;
	}

//Options menu
	private static int chooseOption() {
		System.out.println("1. Create no of car objects ");
		System.out.println("2. Store details of car");
		System.out.println("3. Print all stored car details");
		System.out.println("4. Print the speed of the car by taking name from user(LS)");
		System.out.println("5. Sort car objects based on name");
		System.out.println("6. Sort car objects based on name");
		System.out.println("7. Print the speed of the car by taking name from user(BS)");
		System.out.println("8. Exit");
		return AllValidationChecks.positiveIntegerCheck();
	}

}
