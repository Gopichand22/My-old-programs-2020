package com.begintoend.coding;

import java.util.Scanner;

import com.mindtreefirstset.validations.AllValidationChecks;

public class EventsInAYear {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int arrayCount = 0, events;
		System.out.println("Enter the number of events");
		events = AllValidationChecks.integerCheck();
		Event[] eventObject = null;
		eventObject = new Event[events];

		boolean isValid = true;
		do {
			switch (chooseOption()) {
			case 1:
				arrayCount = noOfEvents(eventObject, arrayCount, events);
				break;
			case 2:
				displayAllEventsInAMonth(eventObject, arrayCount);
				break;
			case 3:
				eventsNotHappenOnNationalHoliday(eventObject, arrayCount);
				break;
			case 4:
				sortBasedOnEventNames(eventObject, arrayCount);
				break;
			case 5:
				searchAnEventByName(eventObject, arrayCount);
				break;
			case 6:
				System.out.println("Exiting....");
				isValid = false;
				break;
			default:
				System.out.println("Please choose correct optioin btw 1-6:");
			}

		} while (isValid);

	}

	private static void searchAnEventByName(Event[] eventObject, int arrayCount) {
		if (arrayCount > 0) {
			int left = 0, right = arrayCount - 1, mid;
			System.out.println("Enter the name of the event:");
			String name = AllValidationChecks.stringLineCheck();
			AllValidationChecks.stringLineCheck();
			boolean flag = true;
			while (left <= right) {
				mid = (left + right) / 2;
				if (name == eventObject[mid].getName()) {
					System.out.println("Key Found at index" + mid);

					flag = false;
					break;
				} else if (name.compareTo(eventObject[mid].getName()) > 0) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			}
			if (flag) {
				System.out.println("Key not found");
			}
		} else {
			System.out.println("No data in the database");
		}
	}

	private static void sortBasedOnEventNames(Event[] eventObject, int arrayCount) {
		if (arrayCount > 0) {
			System.out.println("Used bubble sort");
			for (int i = 0; i < arrayCount; i++) {
				for (int j = 0; j < arrayCount - i - 1; j++) {
					if (eventObject[j].getName().compareTo(eventObject[j + 1].getName()) > 0) {
						Event temp = eventObject[j];
						eventObject[j] = eventObject[j + 1];
						eventObject[j + 1] = temp;
					}
				}
			}

			for (int i = 0; i < arrayCount; i++) {
				System.out.println(eventObject[i].getName() + " " + eventObject[i].getId() + " "
						+ eventObject[i].getDateOfEvent());
			}
		} else {
			System.out.println("No data in the database");
		}
	}

	private static void eventsNotHappenOnNationalHoliday(Event[] eventObject, int arrayCount) {
		if (arrayCount > 0) {
			for (int i = 0; i < arrayCount; i++) {
				if (eventObject[i].isNationalHoliday() == false) {
					System.out.println(eventObject[i].getId() + " " + eventObject[i].getName() + " "
							+ eventObject[i].getDateOfEvent());
				}
			}
		} else {
			System.out.println("No data in the database");
		}
	}

	private static void displayAllEventsInAMonth(Event[] eventObject, int arrayCount) {
		if (arrayCount > 0) {
			System.out.println("Enter the month to display all events from that particular month 1-12");
			int month = sc.nextInt();
			for (int i = 0; i < arrayCount; i++) {
				if (month == eventObject[i].getDateOfEvent()) {
					System.out.println(eventObject[i].getId() + " " + eventObject[i].getName() + " "
							+ eventObject[i].getDateOfEvent());
				}
			}
		} else {
			System.out.println("No data in the database");
		}

	}

	private static int noOfEvents(Event[] eventObject, int arrayCount, int events) {

		if (arrayCount < events) {
			System.out.println("Enter Event Id:");
			int id = AllValidationChecks.integerCheck();
			System.out.println("Event Name:");
			AllValidationChecks.stringLineCheck();
			String name = AllValidationChecks.stringLineCheck();
			System.out.println("Month of Occurance(month in number(1-12)):");
			int monthOfEvent = AllValidationChecks.integerCheck();
			System.out.println("Is it happening on national holiday true/false");
			boolean nationalHoliday = sc.nextBoolean();
			eventObject[arrayCount] = new Event(id, name, monthOfEvent, nationalHoliday);
			arrayCount++;
		} else {
			System.out.println("Currently facing some technical issue #No space to add your data");
		}
		return arrayCount;
	}

	private static int chooseOption() {
		System.out.println("......................MENU......................");
		System.out.println("Enter the choice");
		System.out.println("1. Enter Details of events");
		System.out.println("2. Display all events by particular month");
		System.out.println("3. Display all events which are not happening on national holiday");
		System.out.println("4. Display all events in a sorted order");
		System.out.println("5. Search an event based on its name and display it");
		System.out.println("6. Exit");
		int opt = AllValidationChecks.integerCheck();
		return opt;
	}

}
