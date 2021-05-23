package com.feb.practice;

import java.util.Scanner;

import com.mindtreefirstset.validations.AllValidationChecks;

public class DisplayName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Take gender
		System.out.println("Enter gender(male/female)");
		String gender = AllValidationChecks.stringCheck();
		System.out.println("Enter Name:");
		// Enter name
		AllValidationChecks.stringLineCheck();
		String name = AllValidationChecks.stringLineCheck();
		// Store the final output string in this result
		// This method is used to check whether the user is male or female md then will
		// assign based on gender
		String result = checkGenderAndAssignTitles(gender, name);
		// finally print result
		System.out.println(result);
	}

//method used to find the gender and titles
	private static String checkGenderAndAssignTitles(String gender, String name) {
		// this holds the data related to male
		String maleResult = "";
		// this holds the data related to female
		String femaleResult = "";
		// flag is used to trigger
		boolean flag = true;
		// checking if male then do this *getTheNameOfMaleWithTitle
		if (gender.equals("male") || gender.equals("m") || gender.equals("M")) {// prakash //Pulagam gopi chand
			flag = false;
			maleResult = getTheNameWithTitle(name, flag);
			// checking else if female then do this *getTheNameOfFealeWithTitle
		} else if (gender.equals("female") || gender.equals("f") || gender.equals("F") || gender.equals("FEMALE")) {
			femaleResult = getTheNameWithTitle(name, flag);
		}
		if (flag) {
			return femaleResult;
		}
		return maleResult;
	}

	private static String getTheNameWithTitle(String name, boolean flag) {
		// TODO Auto-generated method stub
		String finalName = "";
		int count = findNumberOfwordsInName(name);
		if (count == 1) {
			// prakash
			System.out.println("Mr. " + name);
		} else if (count > 1) {
			// if count is greater than 0 then that means name contains more than 1 word
			// now we need to split it
			// take a string array to store the names
			String words[] = split(name, ' ');// pulagam ,gopi ,chand
			String initials = getInitials(words);
			if (flag) {
				finalName = "Miss. " + initials + words[words.length - 1];
			} else {
				finalName = "Mr. " + initials + words[words.length - 1];
			}
		}
		return finalName;

	}

	// to get the 1st alphas from name in capital
	private static String getInitials(String[] words) {
		String temp = "";
		for (int i = 0; i < words.length - 1; i++) {
			temp += subString(words[i], 1) + ". ";
		}
		return temp;
	}

//method to get 1st alpha and cnverting them to capital
	private static char subString(String s, int num) {
		char ch = 0;
		for (int i = 0; i < num; i++) {
			ch = s.charAt(i);
		}
		if (ch >= 'a' && ch <= 'z') {
			return (char) (ch - 32);
		} else {
			return ch;
		}
	}

// *******************Split method*****************************
	private static String[] split(String name, char ch) {
		int count = findNumberOfwordsInName(name);
		// create an array to store the words
		String words[] = new String[count];
		// here temp is used to store char by char until
		String temp = "";
		int j = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) != ch) {
				temp = temp + name.charAt(i);
				words[j] = temp;
			} else {
				j++;
				temp = "";
			}
		}
		return words;
	}

//Find count of spaces in the name to get no of words present
	private static int findNumberOfwordsInName(String name) {
		// TODO Auto-generated method stub
		int count = 1;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == ' ') {
				count++;
			}
		}
		return count;
	}

}
