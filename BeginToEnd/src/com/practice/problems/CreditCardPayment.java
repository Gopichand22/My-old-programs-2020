package com.practice.problems;

import java.util.Scanner;

import com.mindtreefirstset.validations.AllValidationChecks;

public class CreditCardPayment {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int arrayCount = 0, noOfCreditCards = 0;
		System.out.println("Enter no of card details:");
		noOfCreditCards = AllValidationChecks.positiveIntegerCheck();
		Payment[] paymentObjects = new Payment[noOfCreditCards];
		boolean isValid = true;
		do {
			switch (chooseOpt()) {
			case 1:
				arrayCount = addPaymentDetail(paymentObjects, arrayCount, noOfCreditCards);
				break;
			case 2:
				searchByCardType(paymentObjects, arrayCount);
				break;
			case 3:
				sortPaymentDetailsBasedOnAmmountPaid(paymentObjects, arrayCount);
				break;
			case 4:
				updateExpiryDateBasedOnCustomerName(paymentObjects, arrayCount);
				break;
			case 5:
				System.out.println("Exiting....Bye");
				isValid = false;
				break;
			default:
				System.out.println("Please choose correct option 1-5:");

			}
		} while (isValid);
	}

	private static int chooseOpt() {
		System.out.println("1.Add Payment details & display existing details");
		System.out.println("2.Display all payment details based on enter card type");
		System.out.println("3.Sort payment details based on AmountPaid");
		System.out.println("4.Update expiry date for given name");
		System.out.println("5.Exit");
		return AllValidationChecks.positiveIntegerCheck();
	}

	private static String validateDate() {
		boolean flag = true;
		System.out.println("Enter card expiry month and year in this format(mm/yy):");
		String cardExpiry = sc.next();// 12/21
		String[] monthAndYear = AllValidationChecks.splittingMethod(cardExpiry, '/');
		int[] monthAndYear2 = new int[monthAndYear.length];
		for (int i = 0; i < monthAndYear.length; i++) {
			monthAndYear2[i] = AllValidationChecks.parseIntMethod(monthAndYear[i]);
		}
		if (!(monthAndYear2[0] >= 1 && monthAndYear2[0] <= 12)) {
			System.out.println("Entered month is not valid,please check it");
			flag = false;
		}
		if (!(monthAndYear2[1] >= 21 && monthAndYear2[1] <= 30)) {
			System.out.println("Entered year is not valid,please check it");
			flag = false;
		}
		if (flag) {
			return cardExpiry;
		} else {
			System.out.println("Please enter correct expiry date");
			return validateDate();
		}

	}

	private static String checkCreditCardNumber() {
		System.out.println("Enter your 16 digit credit card number:");
		String cardNumber = sc.next();
		if (cardNumber.length() == 16) {
			for (int i = 0; i < cardNumber.length(); i++) {
				if (!(cardNumber.charAt(i) >= 48 && cardNumber.charAt(i) <= 57)) {
					System.out.println("Invalid card number.\nCredit card contains only digits");
					return checkCreditCardNumber();
				}
			}
		} else {
			System.out.println("You entered " + cardNumber.length() + "Digits");
			System.out.println("Please enter valid 16digit Credit card number");
			return checkCreditCardNumber();
		}
		return AllValidationChecks.subStringMethod(cardNumber, 12);
	}

	private static String checkCardType() {
		System.out.println("Enter Card Type (master | visa | amex):");
		String string = AllValidationChecks.convertToLowerCase(AllValidationChecks.stringLineCheck());
		if (string.equals("master") || string.equals("visa") || string.equals("amex")) {
			return string;
		} else {
			System.out.println("Please enter valid cardType (master | visa | amex).");
			return checkCardType();
		}
	}

	private static int addPaymentDetail(Payment[] paymentObjects, int arrayCount, int noOfCards) {
		if (arrayCount < noOfCards) {
			System.out.println("Enter Id:");
			int id = AllValidationChecks.positiveIntegerCheck();
			System.out.println("Enter Customer name:");
			AllValidationChecks.stringLineCheck();
			String name = AllValidationChecks.stringLineCheck();
			System.out.println("Enter Amount Paid:");
			double amountPaid = AllValidationChecks.doubleCheck();
			AllValidationChecks.stringLineCheck();
			String cardType = checkCardType();
			String cardNumber = checkCreditCardNumber();
			String ExpiryDate = validateDate();
			paymentObjects[arrayCount] = new Payment(id, name, amountPaid, cardType, cardNumber, ExpiryDate);
			arrayCount++;
		} else {
			System.out.println("There is no space in the database,Please try after sometime");
		}
		return arrayCount;
	}

	private static void searchByCardType(Payment[] paymentObjects, int arrayCount) {
		System.out.println("Enter card type to get the details");
		String str = AllValidationChecks.stringCheck();
		for (int i = 0; i < arrayCount; i++) {
			if (str.equals(paymentObjects[i].getCardType())) {
				display(paymentObjects[i]);
			}
		}
	}

	private static void display(Payment payment) {
		System.out.println(payment.getId() + "\t" + payment.getName() + "\t" + payment.getAmountPaid() + "\t"
				+ payment.getCardType() + "\t" + payment.getCardNumber() + "\t" + payment.getExpiryDate());
	}

	private static Payment[] sortPaymentDetailsBasedOnAmmountPaid(Payment[] paymentObjects, int arrayCount) {
		if (arrayCount > 0) {
			System.out.println("sorting based on ID of the ticket");
			for (int i = 0; i < arrayCount; i++) {
				for (int j = 0; j < arrayCount - i - 1; j++) {
					if (paymentObjects[j].getAmountPaid() > paymentObjects[j + 1].getAmountPaid()) {
						Payment temp = paymentObjects[j];
						paymentObjects[j] = paymentObjects[j + 1];
						paymentObjects[j + 1] = temp;
					}
				}
			}
			System.out.println("dispaly users based on ID");
			System.out.println("...................................................................");
			display(paymentObjects, arrayCount);

		} else {
			System.out.println("No data found");
		}
		return paymentObjects;
	}

	private static void display(Payment[] paymentObjects, int arrayCount) {
		for (int i = 0; i < arrayCount; i++) {
			System.out.println(paymentObjects[i].getId() + "\t" + paymentObjects[i].getName() + "\t"
					+ paymentObjects[i].getAmountPaid() + "\t" + paymentObjects[i].getCardType() + "\t"
					+ paymentObjects[i].getCardNumber() + "\t" + paymentObjects[i].getExpiryDate());
		}
	}

	private static void updateExpiryDateBasedOnCustomerName(Payment[] paymentObjects, int arrayCount) {
		System.out.println("Enter customer name to update expiry card details:");
		String name = AllValidationChecks.stringLineCheck();
		for (int i = 0; i < arrayCount; i++) {
			if (paymentObjects[i].getName().equals(name)) {
				paymentObjects[i].setExpiryDate(validateDate());
			}
		}
	}

}
