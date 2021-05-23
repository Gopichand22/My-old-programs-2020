package com.mindtreefirstset.validations;

import java.util.Scanner;

public class AllValidationChecks {
	static Scanner sc = new Scanner(System.in);
	// *******************//
////**LIST OF ALL METHODS**////
	// *******************//
	// validate positive integer
	// validate positive Long integer
	// String check for Word
	// checking mobile number
	// checking weather the given Data is integer
	// checking integer array values
	// checking double or not
	// string line check
	// check address containig -/. & alphas & numbers
	// splitting based on ' '
	// adding a string side by side for rotational string check
	// long checking
	// sortChars in a string
	// substring of a string from required index to last(size-1)
	// convert to lower case
	// convert to upper case
	// Substring of a string
	// validate account type @bank
	// validate date
	// converting string numeric to integer(ParseInt)
	// validate time

// --------------------------------------------------------------------------------------

// validate positive integer
	public static int positiveIntegerCheck() {
		do {
			int num = sc.nextInt();
			if (num >= 0) {
				return num;
			} else {
				System.out.println("Please enter a Positive value:");
			}
		} while (true);
	}
// -------------------------------------------------------------------------------------------

//validate positive long integer
	public static long positiveLongCheck() {
		do {
			long num = sc.nextLong();
			if (num >= 0) {
				return num;
			} else {
				System.out.println("Please enter a Positive value:");
			}
		} while (true);
	}

// -------------------------------------------------------------------------------------------
// String check for Word
	public static String stringCheck() {
		String string1 = sc.next();
		for (int i = 0; i < string1.length(); i++) {
			if ((string1.charAt(i) >= 'A' && string1.charAt(i) <= 'Z')
					|| (string1.charAt(i) >= 'a' && string1.charAt(i) <= 'z')) {

			} else {
				System.out.println("Please enter Only alphs");
				string1 = stringCheck();
			}

		}
		return string1;
	}

// --------------------------------------------------------------------------------------

//checking mobile number as string -- checking for number only 
	public static String stringMobileNumberCheck() {
		String string1;
		string1 = sc.next();
		if (string1.length() == 10) {
			for (int i = 0; i < string1.length(); i++) {
				int k = string1.charAt(i) - 48;
				if (k >= 0 && k <= 9) {

				} else {
					System.out.println("Please enter your mobile number only");
					string1 = stringMobileNumberCheck();
				}
			}
		} else {
			System.out.println("Please enter your 10digit mobile number");
			string1 = stringMobileNumberCheck();
		}

		return string1;
	}

// ----------------------------------------------------------------------------------------

// checking weather the given Data is integer +/- values
	public static int integerCheck() {
		do {
			int num = sc.nextInt();
			if (num >= 0 || num < 0) {
				return num;
			} else {
				System.out.println("Please enter an integer value:");
			}
		} while (true);
	}

//------------------------------------------------------------------------------------------

//checking integer array values
	public static int[] integerArrayCheck(int size) {
		int[] arr = new int[size];
		System.out.println("Enter elements");
		for (int i = 0; i < size; i++) {
			arr[i] = integerCheck();

		}
		return arr;
	}

// ------------------------------------------------------------------------------------------

// checking double or not
	public static double doubleCheck() {
		do {
			double number = sc.nextDouble();
			if (number >= 0) {
				return number;
			} else {
				System.out.println("please enter an Double value:");
			}
		} while (true);
	}
//--------------------------------------------------------------------------------------------

//string line check
	public static String stringLineCheck() {
		String string1 = sc.nextLine();
		for (int i = 0; i < string1.length(); i++) {
			if ((string1.charAt(i) >= 'A' && string1.charAt(i) <= 'Z')
					|| (string1.charAt(i) >= 'a' && string1.charAt(i) <= 'z') || string1.charAt(i) == ' ') {

			} else {
				System.out.println("Please enter Only alphs");
				string1 = stringLineCheck();
			}

		}
		return string1;
	}

// -------------------------------------------------------------------------------------

//check address containig -/., & alphas & numbers
	public static String validateStringAddress() {
		String string2 = sc.nextLine();
		for (int i = 0; i < string2.length(); i++) {
			if ((string2.charAt(i) >= 44 && string2.charAt(i) <= 57)
					|| (string2.charAt(i) >= 'A' && string2.charAt(i) <= 'Z')
					|| (string2.charAt(i) >= 'a' && string2.charAt(i) <= 'z') || string2.charAt(i) == ' ') {

			} else {
				System.out.println("Enter the correct address");
				string2 = validateStringAddress();
			}
		}
		return string2;
	}

// -----------------------------------------------------------------------------------------

//splitting based on ' ' 
	public static String[] splittingMethod(String sentance, char ch) {
		int count = 1;
		for (int i = 0; i < sentance.length(); i++) {
			if (sentance.charAt(i) == ch) {
				count++;
			}
		}
		String words[] = new String[count];
		String temp = "";
		int j = 0;
		for (int i = 0; i < sentance.length(); i++) {
			if (sentance.charAt(i) != ch) {
				temp = temp + sentance.charAt(i);
				words[j] = temp;
			} else {
				j++;
				temp = "";
			}
		}
		return words;
	}

// -----------------------------------------------------------------------------------------

// adding a string side by side for rotational string check
	public static String addStrings(String string1) {
		String result = "";
		int l = 0;
		int size = (string1.length() * 2);
		for (int i = 0; i < size; i++) {
			if (i < (size / 2)) {
				result += string1.charAt(i);
			} else {
				result += string1.charAt(l);
				l++;
			}
		}
		return result;
	}

// ----------------------------------------------------------------------------------------

//long checking
	public static long longCheck() {
		long num = sc.nextLong();
		if (num >= 0 || num < 0) {
			return num;
		} else {
			System.out.println("Please enter an integer value:");
			num = longCheck();
		}
		return num;
	}

// -----------------------------------------------------------------------------------------

//sortChars in a string
	public static char[] sortChars(char[] chars) {
		for (int i = 0; i < chars.length; i++) {
			for (int j = 0; j < chars.length - i - 1; j++) {
				if (chars[j] > chars[j + 1]) {
					char temp = chars[j];
					chars[j] = chars[j + 1];
					chars[j + 1] = temp;
				}
			}
		}

		return chars;
	}

// ------------------------------------------------------------------------------------------

//substring of a string from required index to last(size-1)
	public static String subStringMethod(String s, int num) {
		String temp = "";
		for (int i = num; i < s.length(); i++) {
			temp = temp + s.charAt(i);
		}
		return temp;
	}

// ------------------------------------------------------------------------------------------

//convert to lower case
	public static String convertToLowerCase(String str) {
		String lower = "";
		for (int j = 0; j < str.length(); j++) {
			if (str.charAt(j) >= 65 && str.charAt(j) <= 90) {
				lower += (char) (str.charAt(j) + 32);
			} else {
				lower += str.charAt(j);
			}
		}
		return lower;
	}

// ------------------------------------------------------------------------------------------

//convert to upper case
	public static String convertToUpperCase(String str) {
		String upper = "";
		for (int j = 0; j < str.length(); j++) {
			if (str.charAt(j) >= 97 && str.charAt(j) <= 122) {
				upper += (char) (str.charAt(j) - 32);
			} else {
				upper += str.charAt(j);
			}
		}
		return upper;
	}

// -------------------------------------------------------------------------------------------

//Substring of a string
	public static String subStringMethod2(String text, int start, int end) {
		String str = "";
		for (int i = start; i < end; i++) {
			str = str + text.charAt(i);
		}
		return str;
	}

// ------------------------------------------------------------------------------------------

//validate Bank account type
	public static String validateAccountType() {
		String str = stringCheck();
		if (str.equals("savings") || str.equals("Current") || str.equals("loan")) {
			return str;
		} else {
			System.out.println("Please choose proper Account type");
			str = validateAccountType();
		}
		return str;
	}

// ------------------------------------------------------------------------------------------

//Date validation
	public static String validateDate() {
		String checkValidDate = sc.next();// 22/06/1997
		// split date based on / and -
		String[] date = splittingMethod(checkValidDate, '/');

		for (int i = 0; i < date.length - 2; i++) {
			for (int j = 0; j < date[i].length() - 1; j++) {
				int k = date[i].charAt(j) - 48;
				int l = date[i].charAt(j + 1) - 48;
				if (k == 0) {
					if (l >= 1 && l <= 9) {

					} else {
						System.out.println("Invalid @Date");
						checkValidDate = validateDate();
					}
				} else if (k >= 1 && k <= 2) {
					if (l >= 0 && l <= 9) {

					} else {
						System.out.println("Invalid @Date");
						checkValidDate = validateDate();
					}
				} else if (k == 3) {
					if (l == 0 || l == 1) {

					} else {
						System.out.println("Invalid @Date");
						checkValidDate = validateDate();
					}
				}
			}

		}
		for (int i = 1; i < date.length - 1; i++) {
			for (int j = 0; j < date[i].length() - 1; j++) {
				int k = date[i].charAt(j) - 48;
				int l = date[i].charAt(j + 1) - 48;
				if (k == 0) {
					if (l >= 1 && l <= 9) {

					} else {
						System.out.println("Invalid @Month");
						checkValidDate = validateDate();
					}
				} else if (k == 1) {
					if (l >= 0 && l <= 2) {

					} else {
						System.out.println("Invalid @Month");
						checkValidDate = validateDate();
					}
				} else {
					System.out.println("Invalid @Month");
					checkValidDate = validateDate();
				}
			}

		}
		for (int i = 2; i < date.length; i++) {
			if (date[i].length() == 4) {
				int year = parseIntMethod(date[i]);
				if (year >= 1950 && year <= 2020) {

				} else {
					System.out.println("Invalid @year");
					checkValidDate = validateDate();
				}
			} else {
				System.out.println("Invalid @year");
				checkValidDate = validateDate();
			}
		}
		return checkValidDate;
	}

// -------------------------------------------------------------------------------------------
//for making string numeric to integer(parseInt) 
	public static int parseIntMethod(String string) {
		int num = 0;
		char ch;
		for (int i = 0; i < string.length(); i++) {
			ch = string.charAt(i);
			int k = ch - 48;
			num = num * 10 + k;
		}

		return num;
	}

// -------------------------------------------------------------------------------------------
//time validation
	public static String validateTime() {
		String string1 = sc.next();
		String[] time = splittingMethod(string1, ':');

		for (int i = 0; i < time.length - 1; i++) {
			for (int j = 0; j < time[i].length() - 1; j++) {
				int k = time[i].charAt(j) - 48;
				int l = time[i].charAt(j + 1) - 48;
				if (k >= 0 && k <= 1) {
					if (l >= 0 && l <= 9) {

					} else {
						System.out.println("Invalid time Format");
						string1 = validateTime();
					}
				} else if (k == 2) {
					if (l >= 0 && l <= 4) {

					} else {
						System.out.println("Invalid time Format");
						string1 = validateTime();
					}
				}
			}
		}
		for (int i = 1; i < time.length; i++) {
			for (int j = 0; j < time[i].length() - 1; j++) {
				int k = time[i].charAt(j) - 48;
				int l = time[i].charAt(j + 1) - 48;
				if (k >= 0 && k <= 5) {
					if (l >= 0 && l <= 9) {

					} else {
						System.out.println("Invalid time Format");
						string1 = validateTime();
					}
				}
			}
		}
		return string1;
	}

// -------------------------------------------------------------------------------------------

//Split month (dd/mm)
	public static String splitMonth(String date, char c) {

		int count = 1;
		for (int i = 0; i < date.length(); i++) {
			if (date.charAt(i) == c) {
				count++;
			}
		}
		String words[] = new String[count];
		String temp = "";
		int j = 0;
		for (int i = 0; i < date.length(); i++) {
			if (date.charAt(i) != '/') {
				temp = temp + date.charAt(i);
				words[j] = temp;
			} else {
				j++;
				temp = "";
			}
		}
		return words[1];
	}

}
