package com.march.practice;

import java.util.Scanner;

import com.mindtreefirstset.validations.AllValidationChecks;

/*
 * 
 * After analysing the question
 * In this program we have 2 entity classes
 * 1 is Customer -> id name age
 * 2 is Medicine -> name,quantity,price
 * here 1 customer can purchase n number of medicines
 * so i am taking multiple data through arrays(name[],quantity[],price[])
 * 1.enter the details of the customer
 * Here we dont have any medicine database so the customer itself enters the data of the medicine
 * 2.display bill of the particular customer here we have to take care while generating bill we need to check for seniorcitizen or not
 * 3.If the customer is senior citizen then 5% discount is applicable
 * 4.sort based on age -> i used bubble sort & insertion sort for sorting using switch
 * 5.delete the data of a customer with reference to id 
 */

public class MedicalStoreApp {
//Scanner obj is created
	static Scanner sc = new Scanner(System.in);

//main method
	public static void main(String[] args) {
		int arrayCount = 0, records;
		// for controlling while loop
		boolean isValid = true;
		System.out.println("Enter the number of records");
		records = AllValidationChecks.integerCheck();
		// array of Obj for medicine class
		Medicine[] medicineObject = new Medicine[records];
		// array of Obj for customer class
		Customer[] customerObject = new Customer[records];
		do {
			switch (chooseOptions()) {
			case 1:
				// add details of the customer and required medicine
				arrayCount = enterCustomerDetails(customerObject, medicineObject, arrayCount, records);
				break;
			case 2:
				// Billing ammount generated here
				String Bill = billingCustomer(customerObject, medicineObject, arrayCount);
				// priting the bill
				System.out.println(Bill);
				break;
			case 3:
				// check for discount if the customer is a senior citizen and display the
				// discount ammount to the user/customer
				String seniorCitezen = seniorCitizen(customerObject, medicineObject, arrayCount);
				System.out.println(seniorCitezen);
				break;
			case 4:
				// sort customers on the basis of age
				customerObject = sortBasedOnCustomerAge(customerObject, medicineObject, arrayCount);
				// displaying the data after sorting data
				display(customerObject, medicineObject, arrayCount);
				break;
			case 5:
				// deleting the customer details based onn id

				customerObject = deleteAParticularCustomerDetails(customerObject, medicineObject, arrayCount);
				break;
			case 6:
				// exiting from the program
				isValid = false;
				System.out.println("Exiting...\nThankYou\nHave a nice day");
				break;
			default:
				// when you choose wrong option this get invoked
				System.out.println("Please choose the correct option btw 1-6");
				break;
			}
//controlling while loope using isValid
		} while (isValid);
	}

//This method is used to get the details of the customer and medicine
	private static int enterCustomerDetails(Customer[] customerObject, Medicine[] medicineObject, int arrayCount,
			int records) {
		// Validating whether data exists are not
		if (arrayCount < records) {
			System.out.println("Enter Id:");
			int id = AllValidationChecks.positiveIntegerCheck();
			System.out.println("Enter Customer Name:");
			AllValidationChecks.stringLineCheck();
			String customerName = AllValidationChecks.stringLineCheck();
			System.out.println("Enter Customer age");
			int age = AllValidationChecks.positiveIntegerCheck();
			System.out.println("Enter no of medicines that you want to enter:");
			int size = AllValidationChecks.positiveIntegerCheck();
			String[] medicine = getMedicineNames(size);
			int[] quantity = getQuantity(medicine);
			double[] price = getPrice(medicine);
			// passing data to the customer entity class
			customerObject[arrayCount] = new Customer(id, customerName, age, medicine, quantity, price);
			// passing data to the medicine entity class
			arrayCount++;

		} else {
			System.out.println("There is no data in the database");
		}
		return arrayCount;
	}

	private static String[] getMedicineNames(int size) {
		String medicine[] = new String[size];
		AllValidationChecks.stringLineCheck();
		// loop to enter medicines into an array
		int count = 1;
		for (int i = 0; i < size; i++) {
			System.out.println("Enter medicine " + count + ":");
			medicine[i] = AllValidationChecks.stringLineCheck();
			count++;
		}
		return medicine;
	}

	private static int[] getQuantity(String[] medicine) {
		int quantity[] = new int[medicine.length];
		// loop to enter quantity of the medicine
		for (int i = 0; i < medicine.length; i++) {
			System.out.println("Enter quantity of " + medicine[i] + " tablets:");
			quantity[i] = AllValidationChecks.positiveIntegerCheck();
		}
		return quantity;
	}

	private static double[] getPrice(String[] medicine) {
		double price[] = new double[medicine.length];
		// loop to enter price of the medicine
		for (int i = 0; i < medicine.length; i++) {
			System.out.println("Enter price of " + medicine[i] + " tablet:");
			price[i] = AllValidationChecks.positiveIntegerCheck();
		}
		return price;
	}

//Final billing is done here by checking whether the customer is senior citizen or not
	private static String billingCustomer(Customer[] customerObject, Medicine[] medicineObject, int arrayCount) {
		String finalBill = "";
		if (arrayCount > 0) {
			boolean flag = true;
			int index = 0;
			System.out.println("Enter id of the customer to generate bill:");
			int id = AllValidationChecks.positiveIntegerCheck();
			for (int i = 0; i < arrayCount; i++) {
				if (id == customerObject[i].getId()) {
					flag = false;
					// we need this index to get the nested array elements from the
					// arrayOfObjects(Medicine)
					index = i;
				}
			}
			if (flag) {
				System.out.println("Sorry there is no id present in the database");
			} else {
				boolean seniorCitizen = findSeniorCitizen(customerObject, medicineObject, arrayCount, index);
				finalBill += getTheBill(customerObject, medicineObject, arrayCount, seniorCitizen, index);
			}
		} else {
			System.out.println("There is no data in the database");
		}
		return finalBill;
	}

//This method is used to get the final calculated bill Paymet
	private static String getTheBill(Customer[] customerObject, Medicine[] medicineObject, int arrayCount,
			boolean seniorCitizen, int i) {
		double finalPayment = 0;
		if (seniorCitizen) {
			System.out.println("You get a discont of 5%:");
			for (int j = 0; j < medicineObject[i].getPrice().length; j++) {
				finalPayment = finalPayment + (medicineObject[i].getPrice()[j] * medicineObject[i].getQuantity()[j]);
			}
			finalPayment -= (0.05 * finalPayment);
			return "Billing" + "\n" + "Customer name:\t" + customerObject[i].getCustomerName() + "BillAmount:\t"
					+ finalPayment;
		} else {
			for (int j = 0; j < medicineObject[i].getPrice().length; j++) {
				finalPayment = finalPayment + (medicineObject[i].getPrice()[j] * medicineObject[i].getQuantity()[j]);
			}
			return "Billing" + "\n" + "Customer name:\t" + customerObject[i].getCustomerName() + "BillAmount:\t"
					+ finalPayment;
		}

	}

//This method is checking for seniorCitizen or not 
	private static boolean findSeniorCitizen(Customer[] customerObject, Medicine[] medicineObject, int arrayCount,
			int i) {
		if (customerObject[i].getAge() >= 60) {
			// if true returns true
			return true;
		} else {
			// else returns false
			return false;
		}

	}

//This method is used to get the discount that is obtained by the customer once he/she got verified as senior citizen
	private static String seniorCitizen(Customer[] customerObject, Medicine[] medicineObject, int arrayCount) {
		boolean flag = true, flag1 = true;
		double discount = 0;
		if (arrayCount > 0) {
			System.out.println("Enter Id of the customer:");
			int id = AllValidationChecks.positiveIntegerCheck();
			for (int i = 0; i < arrayCount; i++) {
				if (id == customerObject[i].getId()) {
					// this triggers that id is preset
					flag = false;
					if (customerObject[i].getAge() >= 60) {
						// this triggers that the customer is senior citizen
						flag1 = false;
						System.out.println("You got a discount of 5%");
						// this loop is to calculate the customers medicines price
						for (int j = 0; j < medicineObject[i].getPrice().length; j++) {
							discount += (0.05 * medicineObject[i].getPrice()[j] * medicineObject[i].getQuantity()[j]);
						}
					}
				}
			}
		} else {
			System.out.println("There is no data in the database");
		}
		return SeniorCitizenOrNot(flag, flag1, discount);

	}

	private static String SeniorCitizenOrNot(boolean flag, boolean flag1, double discount) {
		if (!flag) {
			if (!flag1) {
				return "Discount ammount in rupees:" + discount;
			} else {
				return "Your are not applicable for discount";
			}
		} else {
			return "There is no such id present in the database";
		}
	}

//this method is used to sort based on age of the customer
	private static Customer[] sortBasedOnCustomerAge(Customer[] customerObject, Medicine[] medicineObject,
			int arrayCount) {
		Customer[] sortedCustomerObject = new Customer[arrayCount];
		if (arrayCount > 0) {

			System.out.println("sorting based on Id");
			System.out.println("................................................");
			for (int i = 0; i < arrayCount; i++) {
				for (int j = 0; j < arrayCount - i - 1; j++) {
					if (customerObject[j].getAge() > customerObject[j + 1].getAge()) {
						Customer temp = customerObject[j];
						sortedCustomerObject[j] = customerObject[j + 1];
						sortedCustomerObject[j + 1] = temp;
					}
				}
			}

		} else {
			System.out.println("There is no data in the database");
		}
		return sortedCustomerObject;
	}

//this method is deleting a particular customer data
	private static Customer[] deleteAParticularCustomerDetails(Customer[] customerObject, Medicine[] medicineObject,
			int arrayCount) {
		boolean flag = true;
		if (arrayCount > 0) {
			System.out.println("choose id that you want to delete");
			displayCustomers(customerObject, arrayCount);
			System.out.println("Enter the id of the customer that you want to delete");
			int id = AllValidationChecks.integerCheck();
			for (int i = 0; i < arrayCount; i++) {
				if (customerObject[i].getId() == id) {
					if (arrayCount == 1) {
						System.out.println("last element is deleting");
						flag = false;
						arrayCount--;
					}
				} else {
					for (int j = i; j < arrayCount - 1; j++) {
						customerObject[j] = customerObject[j + 1];
						flag = false;
					}
				}
			}
			// this method return a success note whether its deleted or not / required data
			// exists or not
			arrayCount = displayMessage(customerObject, arrayCount, flag);
		} else {
			System.out.println("There is no data in the database");
		}
		return customerObject;
	}

//displays a success message after deletion
	private static int displayMessage(Customer[] customerObject, int arrayCount, boolean flag) {
		if (!flag) {
			System.out.println("customer data sucesfully deleted");
			for (int i = 0; i < arrayCount; i++) {
				System.out.println(customerObject[i].getId() + " " + customerObject[i].getCustomerName() + " "
						+ customerObject[i].getAge());
				arrayCount--;
			}
		} else {
			System.out.println("Please enter the valid id ");
		}
		return arrayCount;
	}

//display the details of the customer and medicines that he/she purchased
	private static void display(Customer[] customerObjs, Medicine[] medicineObjs, int arraySize) {
		for (int i = 0; i < arraySize; i++) {
			System.out.print(customerObjs[i].getAge() + "\t" + customerObjs[i].getCustomerName() + "\t"
					+ customerObjs[i].getId() + "\n");
			System.out.println("Medicines list");
			for (int j = 0; j < medicineObjs[i].getMedicine().length; j++) {
				System.out.print(medicineObjs[i].getMedicine()[j] + "," + medicineObjs[i].getQuantity()[j] + ","
						+ medicineObjs[i].getPrice()[j] + "\n");
			}
		}

	}

//this method is used to dispaly the data of the customer
	private static void displayCustomers(Customer[] customerObjs, int arraySize) {
		for (int i = 0; i < arraySize; i++) {
			System.out.print(customerObjs[i].getAge() + "\t" + customerObjs[i].getCustomerName() + "\t"
					+ customerObjs[i].getId() + "\n");
		}
	}

//Menu of the program
	private static int chooseOptions() {
		System.out.println("1.Enter customer details & required medicine:");
		System.out.println("2.Dispaly bill for the particular customer");
		System.out.println("3.Discount for senior citizen Upto 5%:");
		System.out.println("4.Sort customers based on age:");
		System.out.println("5.Delete Medicine for a customer:");
		System.out.println("6.Exit");
		return AllValidationChecks.positiveIntegerCheck();
	}

}
