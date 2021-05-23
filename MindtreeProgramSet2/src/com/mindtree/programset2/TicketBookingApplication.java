package com.mindtree.programset2;

import com.mindtreefirstset.validations.AllValidationChecks;

public class TicketBookingApplication {

//	private static int arrayCount = 0;
//	private static int records;
//	private static Passenger[] arrayOfObj;

	public static void main(String args[]) {
		int records, arrayCount = 0;
		Passenger[] arrayOfObj;
		System.out.println("Enter the number of records");
		records = AllValidationChecks.integerCheck();
		arrayOfObj = new Passenger[records];
		boolean isValid = true;
		do {
			switch (menuToChooseOption()) {
			case 1:
				arrayCount = addDetails(arrayOfObj, records, arrayCount);
				break;
			case 2:
				String message = bookTicket(arrayOfObj, arrayCount);
				System.out.println(message);
				break;
			case 3:
				diaplayCustomers(arrayOfObj, arrayCount);
				break;
			case 4:
				System.out.println("Exiting...\nVisit again & Good bye");
				isValid = false;
				break;
			default:
				System.out.println("Enter the correct value btw 1-4:");
			}
		} while (isValid);
	}

	// Case1
	private static int addDetails(Passenger[] arrayOfObj, int records, int arrayCount) {
		if (arrayCount < records) {
			System.out.println("Add Customer details");
			System.out.println("Enter the id");
			int id = AllValidationChecks.integerCheck();
			System.out.println("Enter the name");
			AllValidationChecks.stringLineCheck();
			String name = AllValidationChecks.stringLineCheck();
			System.out.println("Enter the age");
			int age = AllValidationChecks.integerCheck();
			System.out.println("Enter the mobile number");
			String mobilenumber = AllValidationChecks.stringMobileNumberCheck();
			System.out.println("Enter the date of brith");
			String dateofbirth = AllValidationChecks.validateDate();
			System.out.println("Enter the city");
			AllValidationChecks.stringLineCheck();
			String city = AllValidationChecks.validateStringAddress();
			arrayOfObj[arrayCount] = new Passenger(id, age, name, mobilenumber, dateofbirth, city);
			arrayCount++;
		} else {
			System.out.println("Currently facing some technical issue #No space to add your data");
		}
		return arrayCount;
	}
//Case1 End	

//Case2
	private static String bookTicket(Passenger[] arrayOfObj, int arrayCount) {
		String source = "";
		String destination = "";
		if (arrayCount > 0) {
			boolean flag = true, flag1 = true;
			int todayDate = 18;
			int thisMonth = 01;
			int thisYear = 2021;
			System.out.println("Enter the Customer id");
			int custId = AllValidationChecks.integerCheck();
			System.out.println("Enter the mobile number");
			String custMobileNumber = AllValidationChecks.stringMobileNumberCheck();
			System.out.println("Enter the name of Customer ");
			String custName = AllValidationChecks.stringCheck();
			System.out.println("Enter the source");
			source = AllValidationChecks.stringCheck();
			System.out.println("Enter the destination");
			destination = AllValidationChecks.stringCheck();
			System.out.println("Enter the date of journey dd/mm/yyyy");
			String dateOfJourney = AllValidationChecks.validateDate();
			System.out.println("Eneter the time in the formart hh:mm");
			String time = AllValidationChecks.validateTime();
//spliting dateofJourrney & time
			String dojSplit[] = AllValidationChecks.splittingMethod(dateOfJourney, '/');
			String timeSplit[] = AllValidationChecks.splittingMethod(time, ':');
//converting string values to integer and storing them in intArray
			int[] timeSplitArray = new int[timeSplit.length];
			for (int i = 0; i < timeSplit.length; i++) {
				timeSplitArray[i] = AllValidationChecks.parseIntMethod(timeSplit[i]);
			}
//checking time 
			if (timeSplitArray[0] < 0 || timeSplitArray[0] > 24) {
				flag = false;
				System.out.println("Please enter correct hours 0-24");
			}
			if (timeSplitArray[1] < 0 || timeSplitArray[1] > 60) {
				flag = false;
				System.out.println("please enter correct minutes 0-59");
			}
//converting string values to integer and storing them in intArray
			int[] dateArray = new int[dojSplit.length];
			for (int i = 0; i < dateArray.length; i++) {
				dateArray[i] = AllValidationChecks.parseIntMethod(dojSplit[i]);
			}
//checking date
			if (dateArray[2] != thisYear) {
				System.out.println("please enter correct year");
				flag = false;
			}
			if (dateArray[1] != thisMonth) {
				flag = false;
				System.out.println("please enter correct month");
			}
			if (dateArray[0] <= todayDate) {
				flag = false;
				System.out.println("please enter valid date");
			}
//checking whether data exist in the database or not
			if (arrayCount > 0) {
				for (int i = 0; i < arrayCount; i++) {
					String str = arrayOfObj[i].getName();
					String str2 = arrayOfObj[i].getMobileNumber();
					if (str.equals(custName) && str2.equals(custMobileNumber)) {
						break;
					} else {
						flag1 = false;
					}
				}
			} else {
				flag1 = false;
			}
//checking whether source & destination are not same
			if (source.equals(destination)) {
				System.out.println("Please enter the differnt source and destination");
				flag1 = false;
			}
//Printing Ticket after satisfying all the cases/validations
			if (flag && flag1) {
				System.out.println("...................Ticket..............................");
				System.out.println("...........wishing you a Happy Journey.................");
				System.out.println("PASSENGER Details:");
				System.out.println("Passenger id" + "      " + ":" + " " + custId);
				System.out.println("Passenger name" + "    " + ":" + " " + custName);
				System.out.println("Source Point" + "      " + ":" + " " + source);
				System.out.println("Destination Point" + " " + ":" + " " + destination);
				System.out.println("Date Of Journey" + "   " + ":" + " " + dateOfJourney);
				System.out.println("Bus Timings" + "       " + ":" + " " + time);
				System.out.println("...........Thank you & visit again.....................");
			} else {
				System.out.println("Invalid Details");
				System.out.println("Please enter valid details");
				System.out.println("Sorry,Your booking is cancelled");
			}
		} else {
			System.out.println("#There are no Registered customers in the database");
			return "HINT:To Book a Ticket, Register First";
		}
		return "Ticket Booked successfully from " + source + "to " + destination;
	}

//case 2 ends
//case 3
	// methods to display customers
	private static void diaplayCustomers(Passenger[] arrayOfObj, int arrayCount) {
		boolean isValid = true;
		if (arrayCount > 0) {
			System.out.println("Choose 1 Display custumers based on city names");
			System.out.println("Choose 2 Display customers based on ID");
			System.out.println("Choose 3 Display customer Names in sorted order");
			System.out.println("Choose 4 to Exit");
			do {
				switch (AllValidationChecks.integerCheck()) {
				case 1:
					customerBasedOnCity(arrayOfObj, arrayCount);
					break;
				case 2:
					customerBasedOnIds(arrayOfObj, arrayCount);
					break;
				case 3:
					customerNamesInSortedOrder(arrayOfObj, arrayCount);
					break;
				case 4:
					System.out.println("Exiting....Bye");
					isValid = false;
					break;
				default:
					System.out.println("choose correct option btw (1-4)");
				}
			} while (isValid);
		} else {
			System.out.println("There are no customer details to display");
		}
	}

//Display based on citynames 
	private static void customerBasedOnCity(Passenger[] arrayOfObj, int arrayCount) {
		System.out.println("Display Customers based on city names");
		for (int i = 0; i < arrayCount; i++) {
			System.out.println(arrayOfObj[i].getCity() + " " + arrayOfObj[i].getName() + " " + arrayOfObj[i].getAge()
					+ " " + arrayOfObj[i].getMobileNumber());
		}
	}

//Display based on ids
	private static void customerBasedOnIds(Passenger[] arrayOfObj, int arrayCount) {

		System.out.println("Display customers based on ID's");
		for (int i = 0; i < arrayCount; i++) {
			System.out.println(arrayOfObj[i].getId() + " " + arrayOfObj[i].getName() + " " + arrayOfObj[i].getAge()
					+ " " + arrayOfObj[i].getMobileNumber());
		}
	}

//display data after sorting(sorting Based on Names)
	private static void customerNamesInSortedOrder(Passenger[] arrayOfObj, int arrayCount) {
		boolean isValid = true;
		System.out.println("Display customer Names in sorted order");
		System.out.println("Choose 1 to perform BubbleSort\nChoose 2 to perform InsertionSort\nChoose 3 to Exit");
		do {
			switch (AllValidationChecks.integerCheck()) {
			case 1:
				usingBubbleSort(arrayOfObj, arrayCount);
				break;
			case 2:
				usingInsertionSort(arrayOfObj, arrayCount);
				break;
			case 3:
				System.out.println("Exiting...Bye");
				diaplayCustomers(arrayOfObj, arrayCount);
				isValid = false;
				break;
			}
		} while (isValid);

	}

//sorting using bubble sort
	private static void usingBubbleSort(Passenger[] arrayOfObj, int arrayCount) {
		System.out.println("Used bubble sort");
		for (int i = 0; i < arrayCount; i++) {
			for (int j = 0; j < arrayCount - i - 1; j++) {
				if (arrayOfObj[j].getName().compareTo(arrayOfObj[j + 1].getName()) > 0) {
					Passenger temp = arrayOfObj[j];
					arrayOfObj[j] = arrayOfObj[j + 1];
					arrayOfObj[j + 1] = temp;

				}
			}
		}

		for (int i = 0; i < arrayCount; i++) {
			System.out.println(arrayOfObj[i].getName() + " " + arrayOfObj[i].getId() + " "
					+ arrayOfObj[i].getMobileNumber() + " " + arrayOfObj[i].getAge() + " " + arrayOfObj[i].getCity()
					+ " " + arrayOfObj[i].getDateofbirth());
		}
	}
//sorting using bubble sort ends

//sorting using insertion sort
	private static void usingInsertionSort(Passenger[] arrayOfObj, int arrayCount) {
		System.out.println("Used insertion sort");
		for (int i = 1; i < arrayCount; i++) {
			Passenger key = arrayOfObj[i];
			int j = i - 1;
			while (j >= 0 && arrayOfObj[j].getName().compareTo(key.getName()) > 0) {
				arrayOfObj[j + 1] = arrayOfObj[j];
				j--;
			}
			arrayOfObj[j + 1] = key;
		}

		for (int i = 0; i < arrayCount; i++) {
			System.out.println(arrayOfObj[i].getName() + " " + arrayOfObj[i].getId() + " "
					+ arrayOfObj[i].getMobileNumber() + " " + arrayOfObj[i].getAge() + " " + arrayOfObj[i].getCity()
					+ " " + arrayOfObj[i].getDateofbirth());
		}

	}
//sorting using insertion sort ends

//case 3 ends

//Main menu
	private static int menuToChooseOption() {
		System.out.println("......................MENU......................");
		System.out.println("Enter the choice");
		System.out.println("1. Add customer details");
		System.out.println("2. Book a ticket");
		System.out.println("3. Display customers");
		System.out.println("4. Exit");
		int opt = AllValidationChecks.integerCheck();
		return opt;
	}
}
