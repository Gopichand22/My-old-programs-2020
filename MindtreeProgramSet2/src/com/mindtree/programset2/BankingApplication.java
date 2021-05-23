package com.mindtree.programset2;

import com.mindtreefirstset.validations.AllValidationChecks;

public class BankingApplication {

	public static void main(String args[]) {
		int arrayCount = 0, records;
		boolean isValid = true;
		Customer[] customerObject;
		System.out.println("Enter the number of records");
		records = AllValidationChecks.integerCheck();
		customerObject = new Customer[records];
		do {
			switch (menuToChooseOption()) {
			case 1:
				arrayCount = createBankAccount(customerObject, arrayCount, records);
				break;
			case 2:
				customerObject = updateDetails(customerObject, arrayCount);
				break;
			case 3:
				arrayCount = deleteAccount(customerObject, arrayCount);
				break;
			case 4:
				dispalyBankCustomers(customerObject, arrayCount);
				break;
			case 5:
				System.out.println("Exiting...Bye");
				isValid = false;
				break;
			default:
				System.out.println("enter the correct choice btw 1-5");
			}

		} while (isValid);
	}

// case 1-Creating/Opening an account in the bank
	private static int createBankAccount(Customer[] customerObject, int arrayCount, int records) {
		if (arrayCount < records) {
			System.out.println("Enter the account number");
			long accountNumber = AllValidationChecks.integerCheck();
			System.out.println("Enter the account holder name");
			AllValidationChecks.stringLineCheck();
			String customerName = AllValidationChecks.stringLineCheck();
			System.out.println("Enter the account type");
			String accountType = AllValidationChecks.validateAccountType();
			System.out.println("Enter the date of birth(dd/mm/yyyy) or (dd-mm-yyyy)");
			String dateOfBirth = AllValidationChecks.validateDate();
			System.out.println("Enter the address");
			AllValidationChecks.validateStringAddress();
			String address = AllValidationChecks.validateStringAddress();
			System.out.println("Enter the amount");
			double balance = AllValidationChecks.doubleCheck();
			customerObject[arrayCount] = new Customer(accountNumber, customerName, accountType, dateOfBirth, address,
					balance);
			arrayCount++;
		} else {
			System.out.println("Currently facing some technical issue #No space to add your data");
		}
		return arrayCount;
	}

// case 2- updating details like changing Name & changing Address based on
// Account number
	private static Customer[] updateDetails(Customer[] customerObject, int arrayCount) {
		boolean isValid = true;
		System.out.println("Choose 1 to change name \nChoose 2 to change address\nChoose 3 to Exit");
		do {
			switch (AllValidationChecks.integerCheck()) {
			case 1: {
				System.out.println(updateName(customerObject, arrayCount));
				break;
			}
			case 2:
				System.out.println(updateAddress(customerObject, arrayCount));
				break;
			case 3:
				System.out.println("Exiting.... Bye");
				isValid = false;
				break;
			}

		} while (isValid);
		return customerObject;
	}

	public static String updateName(Customer[] customerObject, int arrayCount) {
		int k = 0;
		System.out.println("Enter the account number to be updated");
		long acNumber = AllValidationChecks.integerCheck();
		for (int i = 0; i < arrayCount; i++) {
			if (customerObject[i].getAccountnumber() == acNumber) {
				System.out.println("Please enter the name to change in the Bank database");
				customerObject[i].setName(AllValidationChecks.stringCheck());
			} else {
				return "AccountNumber does not exist in the database";
			}
		}

		return "Updated Details are " + customerObject[k].getAccountnumber() + " " + customerObject[k].getName();
	}

	public static String updateAddress(Customer[] customerObject, int arrayCount) {
		int k = 0;
		System.out.println("Enter the account number to be updated");
		long acNumber = AllValidationChecks.integerCheck();
		for (int i = 0; i < arrayCount; i++) {
			if (customerObject[i].getAccountnumber() == acNumber) {
				System.out.println("Please enter the new address to be changed");
				customerObject[i].setAddress(AllValidationChecks.stringCheck());
				k = i;
			} else {
				return "AccountNumber does not exist in the database";
			}
		}
		return "Updated Details are " + customerObject[k].getAccountnumber() + " " + customerObject[k].getAddress();
	}

// case 3 Deleting account permanently
	private static int deleteAccount(Customer[] customerObject, int arrayCount) {
		System.out.println("choose account that you want to delete");
		for (int i = 0; i < arrayCount; i++) {
			System.out.println(customerObject[i].getAccountnumber() + " " + customerObject[i].getName());
		}
		boolean flag = true;
		System.out.println("Enter the account number to be deleted");
		long acNumber = AllValidationChecks.integerCheck();
		for (int i = 0; i < arrayCount; i++) {
			if (customerObject[i].getAccountnumber() == acNumber) {
				for (int j = i; j < arrayCount; j++) {
					customerObject[j] = customerObject[j + 1];
					flag = false;
				}
			}
		}

		if (!flag) {
			System.out.println("account sucesfully deleted");
			for (int i = 0; i < arrayCount; i++) {
				System.out.println(customerObject[i].getAccountnumber() + " " + customerObject[i].getName() + " "
						+ customerObject[i].getDateofbirth());
				arrayCount--;
			}
		} else {
			System.out.println("Please enter the valid account number");
		}
		return arrayCount;
	}

// case 4 displaying the data in various formats
	private static void dispalyBankCustomers(Customer[] customerObject, int arrayCount) {
		boolean isValid = true;
		System.out.println(
				"Choose 1 to get users based on account number\nChoose 2 to get users based on name\nChoose 3 to get users based on Positive balance\nChoose 4 to get users based on Address\nChoose 5 to exit.");
		do {
			switch (AllValidationChecks.integerCheck()) {
			case 1:
				usersBasedOnAcountNumber(customerObject, arrayCount);
				break;
			case 2:
				usersBasedOnName(customerObject, arrayCount);
				break;
			case 3:
				usersBasedOnPositiveBalance(customerObject, arrayCount);
				break;
			case 4:
				usersBasedOnAddress(customerObject, arrayCount);
				break;
			case 5:
				System.out.println("Exiting.. Bye");
				isValid = false;
				break;
			default:
				System.out.println("Please enter correct input btw 1-5:");

			}
		} while (isValid);
	}

//Display customers based on address
	private static void usersBasedOnAddress(Customer[] customerObject, int arrayCount) {
		if (arrayCount > 0) {

			System.out.println("Display by address");
			System.out.println("...................................................................");
			// bubble sort
			for (int i = 0; i < arrayCount; i++) {
				for (int j = 0; j < arrayCount - i - 1; j++) {
					if (customerObject[j].getAddress().compareTo(customerObject[j + 1].getAddress()) > 0) {
						Customer temp5 = customerObject[j];
						customerObject[j] = customerObject[j + 1];
						customerObject[j + 1] = temp5;
					}
				}
			}

			System.out.println("display users based on address");
			System.out.println("...................................................................");
			for (int i = 0; i < arrayCount; i++) {
				System.out.println(customerObject[i].getAddress() + " " + customerObject[i].getAccountnumber() + " "
						+ customerObject[i].getName() + "\n\n");
			}
		} else {
			System.out.println("No data found");
		}
	}

	// display customer accounts based on +ve balance i.e:Greater than ZERO.
	private static void usersBasedOnPositiveBalance(Customer[] customerObject, int arrayCount) {
		if (arrayCount > 0) {
			System.out.println("display account by who's balance not equal to zero");
			System.out.println("...................................................................");
			for (int i = 0; i < arrayCount; i++) {
				if (customerObject[i].getBalance() != 0) {
					System.out.println(customerObject[i].getAccountnumber() + " " + customerObject[i].getName() + " "
							+ customerObject[i].getBalance() + " " + customerObject[i].getAccounttype() + "\n\n");
				}
			}
		} else {
			System.out.println("No data found");
		}
	}

	// display users based on there names which are existing in the bank data
	private static void usersBasedOnName(Customer[] customerObject, int arrayCount) {
		if (arrayCount > 0) {

			System.out.println("Sorting based on name");
			System.out.println("...................................................................");
			for (int i = 0; i < arrayCount; i++) {
				for (int j = 0; j < arrayCount - i - 1; j++) {
					if (customerObject[j].getName().compareTo(customerObject[j + 1].getName()) > 0) {
						Customer temp5 = customerObject[j];
						customerObject[j] = customerObject[j + 1];
						customerObject[j + 1] = temp5;
					}
				}
			}
			System.out.println("dispaly users based on name");
			System.out.println("...................................................................");
			for (int i = 0; i < arrayCount; i++) {
				System.out.println(customerObject[i].getName() + " " + customerObject[i].getAccountnumber() + " "
						+ customerObject[i].getBalance() + " " + customerObject[i].getAccounttype() + "\n\n");
			}
		} else {
			System.out.println("No data found");
		}
	}

	// display users based on account number
	private static void usersBasedOnAcountNumber(Customer[] customerObject, int arrayCount) {
		if (arrayCount > 0) {

			System.out.println("sorting based on account number");
			System.out.println("................................................");
			for (int i = 0; i < arrayCount; i++) {
				for (int j = 0; j < arrayCount - i - 1; j++) {
					if (customerObject[j].getAccountnumber() > customerObject[j + 1].getAccountnumber()) {
						Customer temp6 = customerObject[j];
						customerObject[j] = customerObject[j + 1];
						customerObject[j + 1] = temp6;
					}
				}
			}
			System.out.println("dispaly users based on account number");
			System.out.println("...................................................................");
			for (int i = 0; i < arrayCount; i++) {
				System.out.println(customerObject[i].getAccountnumber() + " " + customerObject[i].getName() + " "
						+ customerObject[i].getBalance() + " " + customerObject[i].getAccounttype() + "\n\n");
			}
		} else {
			System.out.println("No data found");
		}
	}

//Main menu
	private static int menuToChooseOption() {

		System.out.println("......................MENU......................");
		System.out.println("Enter the choice");
		System.out.println("1. Create a bank user");
		System.out.println("2. Update the details of customer");
		System.out.println("3. Delete user details");
		System.out.println("4. Display user details");
		System.out.println("5. Exit");
		int opt = AllValidationChecks.integerCheck();
		return opt;

	}

	// All validations are in Another class called AllValidationChecks
}
