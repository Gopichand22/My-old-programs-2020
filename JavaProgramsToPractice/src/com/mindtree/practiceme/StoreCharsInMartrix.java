package com.mindtree.practiceme;

import com.mindtreefirstset.validations.AllValidationChecks;

public class StoreCharsInMartrix {
	private static char[][] letters;
	private static int size = 0;

	public static void main(String[] args) {
		boolean isValid = true;
		do {
			switch (optionsOfTheProgram()) {
			case 1:
				size = dimensionsForSqMatrix();
				break;
			case 2:
				if (size == 0) {
					System.out.println("Initially please choose option 1 for assigning size for matrix \n\t\t OR");
					System.out.println("Enter size greater than ZERO");
					optionsOfTheProgram();
				} else {
					letters = passData(size);
					for (char[] letter : letters) {
						for (int j = 0; j < letters.length; j++) {
							System.out.print(letter[j] + "\t");
						}
						System.out.println();
					}

				}
				break;
			case 3:
				if (size == 0) {
					System.out.println("Initially please choose option 1 for assigning size for matrix \n\t\t OR");
					System.out.println("Enter size greater than ZERO");
					optionsOfTheProgram();
				} else {
					stringFromUser(size);
				}
				break;
			case 4:
				System.out.println("\n\nExiting...");
				System.out.println("Bye Have a nice day");
				isValid = false;
				break;
			default:
				System.out.println("***choose correct option between 1-5:\n");
			}

		} while (isValid);
	}

	private static void stringFromUser(int size) {
		System.out.println("Enter string to check in martix:");
		String str = AllValidationChecks.stringCheck();
		System.out.println(str.length() + "  " + size);
		boolean flag = true;
		if (str.length() == size) {
			String[] words = new String[(size * 2) + 2];
			String temp = "";
//		storing all rows into string an array [words]
			int k = 0, rowSpot = 1, colSpot = 1;
			for (int i = 0; i < size; i++, rowSpot++) {
				for (int j = 0; j < size; j++) {
					temp = temp + letters[i][j];
					words[k] = temp;
				}
				if (str.compareTo(words[k]) == 0) {
					System.out.println(words[k] + "String exists at row " + rowSpot);
					flag = false;
					break;
				}
				k++;
				temp = "";
			}
//			storing all cols into an array [words] 
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++, colSpot++) {
					temp = temp + letters[j][i];
					words[k] = temp;
				}
				if (str.compareTo(words[k]) == 0) {
					System.out.println(words[k] + "String exists at column " + colSpot);
					flag = false;
					break;
				}
				k++;
				temp = "";
			}
//			storing left to rigth diagonal
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					if (i == j) {
						temp = temp + letters[i][j];
						words[k] = temp;
					}
				}
			}
			if (str.compareTo(words[k]) == 0) {
				System.out.println(words[k] + "String exists in a diagonal(left to right)");
				flag = false;
			}
			k++;
			int start = 0, end = size - 1;
			for (int i = 0; i < size; i++) {
				temp = temp + letters[start][end];
				words[k] = temp;
				start++;
				end--;
			}
			if (str.compareTo(words[k]) == 0) {
				System.out.println(words[k] + "String exists in a diagonal(right to left)");
				flag = false;
			}

		} else {
			System.out.println("Sorry the size of the rows/columns/diagonals are exceeded");
			System.out.println("Size of the string should not be greater than the size of Sq matrix: " + size);
		}

		if (flag) {
			System.out.println("String not found in the matrix");
		}

	}

	private static char[][] passData(int size) {
		if (size == 0) {
			System.out.println("Initially please choose option 1 for assigning size for matrix");
			optionsOfTheProgram();
		}
		System.out.println("Enter characters one by one to store in a 2D matrix (i.e:a-z,A-Z)");
		char[][] alphas = new char[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				alphas[i][j] = AllValidationChecks.stringCheck().charAt(0);
			}
		}
		return alphas;
	}

	private static int dimensionsForSqMatrix() {
		@SuppressWarnings("unused")
		int size;
		System.out.println("Enter the size of square matrix");
		return size = AllValidationChecks.integerCheck();
	}

	private static int optionsOfTheProgram() {
		System.out.println("Option 1.Get dimensions for matrix");
		System.out.println("Option 2.Fill the matrix with chars");
		System.out.println("Option 3.Get a string from the user");
		System.out.println("Option 4.Exit");
		System.out.println("Enter your option between 1-4:");
		int option = AllValidationChecks.integerCheck();
		return option;
	}

}
