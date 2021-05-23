package com.practice.problems;

import com.mindtreefirstset.validations.AllValidationChecks;

public class TicketBooking {

	public static void main(String[] args) {
		boolean isValid = true;
		int arrayCount = 0;
		System.out.println("Enter no of travellers");
		int noOfTravellers = AllValidationChecks.positiveIntegerCheck();
		Traveller[] travellerObject = new Traveller[noOfTravellers];
		do {
			switch (chooseOption()) {
			case 1:
				arrayCount = EnterTravellerDetails(travellerObject, arrayCount, noOfTravellers);
				break;
			case 2:
				displayTicket(travellerObject, arrayCount);
				break;
			case 3:
				travellerObject = sortListByID(travellerObject, arrayCount);
				break;
			case 4:
				updateDestinationById(travellerObject, arrayCount);
				break;
			case 5:
				System.out.println("Thank You\nVisit Again");
				isValid = false;
				break;
			default:
				System.out.println("Enter correct number btw 1-5");
				break;
			}

		} while (isValid);
	}

	private static int EnterTravellerDetails(Traveller[] travellerObject, int arrayCount, int noOfTravellers) {
		boolean flag = true;
		if (arrayCount < noOfTravellers) {
			int id = validateId(travellerObject, arrayCount);
			System.out.println("Enter passenger name:");
			AllValidationChecks.stringLineCheck();
			String name = AllValidationChecks.stringLineCheck();
			System.out.println("Enter passenger age:");
			int age = AllValidationChecks.positiveIntegerCheck();
			System.out.println("Enter Start Point:");
			AllValidationChecks.stringLineCheck();
			String source = AllValidationChecks.convertToUpperCase(AllValidationChecks.stringLineCheck());
			System.out.println("Enter End Point:");
			String destination = AllValidationChecks.convertToUpperCase(AllValidationChecks.stringLineCheck());
			System.out.println("Travel date(dd/mm/yyyy):");
			String dateOfJourney = AllValidationChecks.validateDate();

			if (source.equals(destination)) {
				System.out.println("Source and destination cant not be same.So please try again.");
				flag = false;
			}
			if (flag) {
				travellerObject[arrayCount] = new Traveller(id, name, age, source, destination, dateOfJourney);
				arrayCount++;
			} else {
				System.out.println("Sorry Please try again with a valid data inputs");
				return EnterTravellerDetails(travellerObject, arrayCount, noOfTravellers);
			}
		} else {
			System.out.println("There is not data in the database");
		}
		return arrayCount;
	}

	private static void displayTicket(Traveller[] travellerObject, int arrayCount) {
		System.out.println("Enter Passenger name who already booked a ticket");
		AllValidationChecks.stringLineCheck();
		String name = AllValidationChecks.stringLineCheck();
		for (int i = 0; i < arrayCount; i++) {
			if (travellerObject[i].getName().equals(name)) {
				int stars = name.length() + travellerObject[i].getSource().length()
						+ travellerObject[i].getDestination().length() + 17;
				for (int j = 0; j < stars; j++) {
					System.out.print("*");
				}
				System.out.println("\n***  " + travellerObject[i].getName() + " : " + travellerObject[i].getSource()
						+ " TO " + travellerObject[i].getDestination() + "\n" + "***  Travel Date" + " : "
						+ travellerObject[i].getDateOfJourney() + "\n");
				// stars
				for (int j = 0; j < stars; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				System.out.println("There is no passenger with that name");
			}
		}
	}

	private static Traveller[] sortListByID(Traveller[] travellerObject, int arrayCount) {
		if (arrayCount > 0) {

			System.out.println("sorting based on ID of the ticket");
			for (int i = 0; i < arrayCount; i++) {
				for (int j = 0; j < arrayCount - i - 1; j++) {
					if (travellerObject[j].getId() > travellerObject[j + 1].getId()) {
						Traveller temp = travellerObject[j];
						travellerObject[j] = travellerObject[j + 1];
						travellerObject[j + 1] = temp;
					}
				}
			}
			System.out.println("dispaly users based on ID");
			System.out.println("...................................................................");
			display(travellerObject, arrayCount);

		} else {
			System.out.println("No data found");
		}
		return travellerObject;
	}

	private static void updateDestinationById(Traveller[] travellerObject, int arrayCount) {
		System.out.println("Enter id to rebook ticket with new destination");

		int id = AllValidationChecks.positiveIntegerCheck();
		for (int i = 0; i < arrayCount; i++) {
			if (id == travellerObject[i].getId()) {
				System.out.println("Enter new destination Point:");
				AllValidationChecks.stringLineCheck();
				String destination = AllValidationChecks.convertToUpperCase(AllValidationChecks.stringLineCheck());
				if (!destination.equals(travellerObject[i].getSource())) {
					travellerObject[i].setDestination(destination);
					System.out.println("New Destination is updated.Now Go to option 2 to collect your ticket");
				}
			} else {
				System.out.println("Sorry Id not found");
				updateDestinationById(travellerObject, arrayCount);
			}
		}
	}

	private static int validateId(Traveller[] travellerObject, int arrayCount) {
		boolean flag = true;
		System.out.println("Enter passenger id:");
		int id = AllValidationChecks.positiveIntegerCheck();
		for (int i = 0; i < arrayCount; i++) {
			if (id == travellerObject[i].getId()) {
				flag = false;
			}
		}
		if (flag) {
			return id;
		} else {
			System.out.println("id already exists");
			return validateId(travellerObject, arrayCount);
		}
	}

	private static void display(Traveller[] travellerObject, int arrayCount) {
		for (int i = 0; i < arrayCount; i++) {
			System.out.println(travellerObject[i].getId() + " " + travellerObject[i].getName() + " "
					+ travellerObject[i].getAge() + " " + travellerObject[i].getSource() + " "
					+ travellerObject[i].getDestination() + " " + travellerObject[i].getDateOfJourney() + "\n");
		}
	}

	private static int chooseOption() {
		System.out.println("1.Enter Traveller/Ticket details");
		System.out.println("2.Display Traveller/Ticket details");
		System.out.println("3.Sort Traveller list based on ID");
		System.out.println("4.Update destination details based on traveller ID");
		System.out.println("5.Exit");
		return AllValidationChecks.positiveIntegerCheck();
	}

}
