package com.march.practice;

import com.mindtreefirstset.validations.AllValidationChecks;

/*Inventory Management
Write a menu driver program for inventory management where Product(id, name, quantity, price_per_unit).
1. Add new product in inventory.
2. Update the quantity of particular product.
3. Display products where quantity is less than provided by a user.
4. Display product sort on the basis of quantity.
5. Delete a particular product from inventory.
6. Exit*/

/*create pojo class Product
 * 	attibutes -> id, name, quantity, pricePerUnit
 * 	encapsulate the data members
 * 	create getters & setters which are used to access the data 
 * 
 * Business Class
 * 	add details of the produst and send through param constructor
 * 	make id as unique id
 * 	update quantity of a particual product
 * 	display products where quantity is less than the user entry
 * 	sort the data on the basis of quantity
 * 	delete a particular product
 * 	finally exit.
 * 	
 * */
public class InventoryApp {

	public static void main(String[] args) {
		int arrayCount = 0, records;
		boolean isValid = true;
		System.out.println("Enter no of products:");
		records = AllValidationChecks.positiveIntegerCheck();
		Product[] productObjs = new Product[records];
		int choice = chooseOption();
		do {
			switch (choice) {
			case 1:
				if (arrayCount < records) {
					productObjs = addProduct(productObjs, arrayCount, records);
					arrayCount++;
				} else {
					System.out.println(
							"*************************Sorry for the incovinience******************************");
					System.out.println("There is no space in the database");
					System.out.println("*********************************************************************");
				}
				break;
			case 2:
				if (arrayCount > 0) {
					productObjs = updateQuantityOfParticularProductBasedOnId(productObjs, arrayCount);
				} else {
					errorMessage();
				}
				break;
			case 3:
				if (arrayCount > 0) {
					System.out.println("Enter the quantity:");
					AllValidationChecks.positiveIntegerCheck();
					int quantity = AllValidationChecks.positiveIntegerCheck();
					Product[] resultArray = DisplayProductsWhichAreLessThanUserInput(productObjs, arrayCount, quantity);
					display(resultArray, resultArray.length);
				} else {
					errorMessage();
				}
				break;
			case 4:
				if (arrayCount > 0) {
					Product[] sortedObjs = sortProductBasedOnQuantity(productObjs, arrayCount);
					display(sortedObjs, arrayCount);
				}
				errorMessage();
				break;
			case 5:
				if (arrayCount > 0) {
					System.out.println("List of Products Details:");
					System.out.println("*************************Products List:******************************");
					display(productObjs, arrayCount);
					System.out.println("*********************************************************************");
					productObjs = deleteProductBasedOnId(productObjs, arrayCount);

				}
				break;
			case 6:
				System.out.println("Exiting...Bye");
				isValid = false;
				break;
			default:
				System.out.println("Please enter between options between 1-6:");

			}
		} while (isValid);

	}

	private static void display(Product[] productObjs, int arrayCount) {
		for (int i = 0; i < productObjs.length; i++) {
			System.out.println(productObjs[i].getId() + "\t" + productObjs[i].getName() + "\t"
					+ productObjs[i].getQuantity() + "\t" + productObjs[i].getPrice());
		}
	}

	private static Product[] deleteProductBasedOnId(Product[] productObjs, int arrayCount) {
		boolean flag = true;
		if (arrayCount > 0) {
			System.out.println("choose id that you want to delete");
			display(productObjs, arrayCount);
			System.out.println("Enter the id of the customer that you want to delete");
			int id = AllValidationChecks.integerCheck();
			flag = deleteMe(id, productObjs, arrayCount);

			// this method return a success note whether its deleted or not / required data
			// exists or not
			arrayCount = displayMessage(productObjs, arrayCount, flag);
		} else {
			System.out.println("There is no data in the database");
		}
		return productObjs;
	}

//deleting  a product after fetching it
	private static boolean deleteMe(int id, Product[] productObjs, int arrayCount) {
		// TODO Auto-generated method stub
		boolean flag = true;
		for (int i = 0; i < arrayCount; i++) {
			if (productObjs[i].getId() == id) {
				if (arrayCount == 1) {
					System.out.println("last element is deleting");
					flag = false;
					arrayCount--;
				} else {
					for (int j = i; j < arrayCount - 1; j++) {
						productObjs[j] = productObjs[j + 1];
						flag = false;
						arrayCount--;
					}
				}
			}
		}
		return flag;
	}

	// displays a success message after deletion
	private static int displayMessage(Product[] productObjs, int arrayCount, boolean flag) {
		if (!flag) {
			System.out.println("customer data sucesfully deleted");
			for (int i = 0; i < arrayCount; i++) {
				System.out.println(productObjs[i].getId() + " " + productObjs[i].getName() + " "
						+ productObjs[i].getQuantity() + productObjs[i].getPrice());
				arrayCount--;
			}
		} else {
			System.out.println("Please enter the valid id ");
		}
		return arrayCount;
	}

	private static Product[] sortProductBasedOnQuantity(Product[] productObjs, int arrayCount) {

		System.out.println("sorting based on Quantity");
		System.out.println("................................................");
		for (int i = 0; i < arrayCount; i++) {
			for (int j = 0; j < arrayCount - i - 1; j++) {
				if (productObjs[j].getQuantity() > productObjs[j + 1].getQuantity()) {
					Product temp = productObjs[j];
					productObjs[j] = productObjs[j + 1];
					productObjs[j + 1] = temp;
				}
			}
		}

		return productObjs;

	}

//display the products which are lessthan user input
	private static Product[] DisplayProductsWhichAreLessThanUserInput(Product[] productObjs, int arrayCount,
			int quantity) {
		int k = 0;
		int arraySize = getSize(productObjs, arrayCount, quantity);
		Product[] resultArray = new Product[arraySize];
		if (arraySize == 0) {

		} else {
			for (int i = 0; i < arrayCount; i++) {
				if (productObjs[i].getQuantity() < quantity) {
					resultArray[k++] = productObjs[i];
				}
			}
		}
		return resultArray;
	}

	private static int getSize(Product[] productObjs, int arrayCount, int quantity) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < arrayCount; i++) {
			if (productObjs[i].getQuantity() < quantity) {
				count++;
			}
		}
		return count;
	}

	// updating the quantity for the particular id
	private static Product[] updateQuantityOfParticularProductBasedOnId(Product[] productObjs, int arrayCount) {
		int index = fetchId(productObjs, arrayCount);
		productObjs[index].setQuantity(AllValidationChecks.positiveIntegerCheck());
		return productObjs;
	}

//fetching Id and returning the index of that id
	private static int fetchId(Product[] productObjs, int arrayCount) {
		boolean flag = true;
		display(productObjs, arrayCount);
		System.out.println("Enter the ID that you want to modify/update");
		int i, id = AllValidationChecks.positiveIntegerCheck();
		for (i = 0; i < arrayCount; i++) {
			if (id == productObjs[i].getId()) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Sorry There is no such Id in the database,Try again");
			return fetchId(productObjs, arrayCount);
		} else
			System.out.println("ID is found,Now you can enter the quantity");
		return i;
	}

	private static Product[] addProduct(Product[] productObjs, int arrayCount, int records) {
		int id = validateId(productObjs, arrayCount);
		System.out.println("Enter product name:");
		AllValidationChecks.stringLineCheck();
		String name = AllValidationChecks.stringLineCheck();
		System.out.println("Enter quantity:");
		int quantity = AllValidationChecks.positiveIntegerCheck();
		System.out.println("Enter price per unit");
		double price = AllValidationChecks.doubleCheck();
		productObjs[arrayCount] = new Product(id, name, quantity, price);

		return productObjs;
	}

//Validating id
	private static int validateId(Product[] productObjs, int arrayCount) {
		boolean flag = true;
		System.out.println("Enter Id :");
		int id = AllValidationChecks.positiveIntegerCheck();
		for (int i = 0; i < arrayCount; i++) {
			if (id == productObjs[i].getId()) {
				flag = false;
				break;
			}
		}
		if (flag) {
			return id;
		} else {
			System.out.println("This Id already exists,Try a new Id");
			return validateId(productObjs, arrayCount);
		}
	}

	// Error message
	private static void errorMessage() {
		System.out.println("The database is empty to perform this operation");
		System.out.println("We need to add details into the database FIRST");
	}

	private static int chooseOption() {
		System.out.println("1.Enter Product detais:");
		System.out.println("2.Update quantity by Id");
		System.out.println("3.Display the items where the quantity is lessthan the user input:");
		System.out.println("4.Sort products based on Quantity:");
		System.out.println("5.Delete paricular product based on Id:");
		System.out.println("6.Exit from the application:");

		return AllValidationChecks.positiveIntegerCheck();
	}
}