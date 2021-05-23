package com.mindtree.programset2;

import com.mindtreefirstset.validations.AllValidationChecks;

public class BankBalance30 {
	public static SavingAccount accountObject;

	public static void main(String[] args) {
		System.out.println("Enter the account number:");
		int accountNumber=AllValidationChecks.integerCheck();
		System.out.println("Enter the balance:");
		double balance=AllValidationChecks.doubleCheck();
		System.out.println("Enter the Rate of interest:");
		double rateOfInterest = AllValidationChecks.doubleCheck();
		accountObject = new SavingAccount(accountNumber, balance, rateOfInterest);
		boolean isValid=true;	
		do{
			switch(menuItems()) {	
			case 1:
				System.out.println("Enter the amount to withdraw:");
				double amt = AllValidationChecks.doubleCheck();
				withdraw(amt);
				break;
			case 2:

				break;
			case 3:

				break;
			default:
				System.out.println("Please enter correct option between 1-3");
			}
			}while(isValid);
		}

//Withdraw amount if exists
		private static void withdraw(double amt) {
			if (amt > accountObject.getBal()) {
				System.out.println("Insufficient funds");
				System.out.println("Your avail balance is " + accountObject.getBal());
			} else {
				double remainingBalance = accountObject.getAc() - amt;
				accountObject.setBal(remainingBalance);
				System.out.println("Withdrawn amount: " + amt + "\n Remaining balance: " + accountObject.getBal());
			}

		}

//MenuItems||Options
		private static int menuItems() {

			System.out.println("Enter the Choice");
			System.out.println("1.Withdraw");
			System.out.println("2.Rate of interst");
			System.out.println("Exit");
			int opt = AllValidationChecks.integerCheck();
			return opt;
		}
	}


