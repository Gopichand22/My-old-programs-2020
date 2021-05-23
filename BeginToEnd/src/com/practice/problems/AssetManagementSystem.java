package com.practice.problems;

import java.util.Scanner;

import com.mindtreefirstset.validations.AllValidationChecks;

public class AssetManagementSystem {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int arrayCount = 0, noOfAssets = 0;
		System.out.println("Enter no of assets");
		noOfAssets = AllValidationChecks.positiveIntegerCheck();
		Asset[] assetObjects = new Asset[noOfAssets];
		boolean isValid = true;
		do {
			switch (chooseOption()) {
			case 1:
				addAssetDetails(assetObjects, arrayCount, noOfAssets);
				break;
			case 2:
				searchBasedOnMonthAndSortBasedOnModel(assetObjects, arrayCount);
				break;
			case 3:
				DisplayDataBasedOnModel(assetObjects, arrayCount);
				break;
			case 4:
				UpdateQuantityBasedOnModelAndDisplay(assetObjects, arrayCount);
				break;
			case 5:
				System.out.println("Exiting...");
				isValid = false;
				break;
			default:
				System.out.println("Please choose correct option btw 1-5:");
				break;

			}

		} while (isValid);
	}

	private static int addAssetDetails(Asset[] assetObjects, int arrayCount, int noOfAssets) {
		if (arrayCount < noOfAssets) {
			System.out.println("Enter serial number:");
			String serialNumber = sc.next();
			String model = validateModel();
			System.out.println("Enter alloted month(JAN, FEB, MAR,........ DEC):");
			String allotedMonth = AllValidationChecks.convertToUpperCase(AllValidationChecks.stringCheck());
			System.out.println("Enter Quantity:");
			int quantity = AllValidationChecks.positiveIntegerCheck();
			assetObjects[arrayCount] = new Asset(serialNumber, model, allotedMonth, quantity);
			arrayCount++;
			display(assetObjects, arrayCount);
		} else {
			System.out.println("There is no space in the database");
		}
		return arrayCount;
	}

//*****************************display methods*********************************8
	private static void display(Asset[] assetObjects, int arrayCount) {
		for (int i = 0; i < assetObjects.length; i++) {
			System.out.println(assetObjects[i].getSerialNumber() + "\t" + assetObjects[i].getModel() + "\t"
					+ assetObjects[i].getAllotedMonth() + "\t" + assetObjects[i].getQuantity());
		}

	}

	private static void display(int count, String model) {
		System.out.println("The total quantity of " + model + "is " + count);
	}

//*****************************display methods*********************************8

	// validate model
	private static String validateModel() {
		System.out.println("Enter Model(HP,Lenovo,Dell):");
		String model = AllValidationChecks.convertToLowerCase(AllValidationChecks.stringLineCheck());
		if (model.equals("hp") || model.equals("lenovo") || model.equals("dell")) {
			return model;
		} else {
			System.out.println("Invalid model please choose valid model:");
			return validateModel();
		}
	}

	private static void searchBasedOnMonthAndSortBasedOnModel(Asset[] assetObjects, int arrayCount) {
		System.out.println("Enter month(JAN, FEB, MAR,........ DEC):");
		boolean flag = true;
		String month = AllValidationChecks.convertToUpperCase(AllValidationChecks.stringCheck());
		for (int i = 0; i < arrayCount; i++) {
			if (month == assetObjects[i].getAllotedMonth()) {
				flag = false;
				for (int j = 0; j < arrayCount - i - 1; j++) {
					if (assetObjects[j].getModel().compareTo(assetObjects[j + 1].getModel()) > 0) {
						Asset temp = assetObjects[j];
						assetObjects[j] = assetObjects[j + 1];
						assetObjects[j + 1] = temp;
					}
				}
			}
		}
		if (!flag) {
			display(assetObjects, arrayCount);
		} else {
			System.out.println("There are no assets in this month");
		}

	}

	private static void DisplayDataBasedOnModel(Asset[] assetObjects, int arrayCount) {
		System.out.println("Enter the Model name to get the details of that model(HP,LENOVO,DELL):");
		String model = AllValidationChecks.convertToLowerCase(AllValidationChecks.stringCheck());
		int count = 0;
		for (int i = 0; i < arrayCount; i++) {
			if (model == assetObjects[i].getModel()) {
				count += assetObjects[i].getQuantity();
			}
		}
		display(count, model);
	}

	private static void UpdateQuantityBasedOnModelAndDisplay(Asset[] assetObjects, int arrayCount) {

	}

	private static int chooseOption() {
		System.out.println("1.Add asset details");
		System.out.println("2.Search assets for given month and sort the data by model");
		System.out.println("3.Display total quantity allotted for given model");
		System.out.println("4.Update quantity for given model and display the updated details");
		System.out.println("5.Exit");
		return AllValidationChecks.positiveIntegerCheck();
	}

}
