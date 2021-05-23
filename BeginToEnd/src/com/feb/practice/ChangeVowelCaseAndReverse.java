package com.feb.practice;

import java.util.Scanner;

public class ChangeVowelCaseAndReverse {

	// ANALYSIS BEFORE WRITING THE CODE

	// Enter a string/sentance
	// check char by char and find out the vowel case(upper/lower)
	// if vowel is upper convert it to lower and if it is lower convert it to upper
	// + if it is not a vowel just concat it.
	// reverse the string word by word and return it
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentance:");
		// Enter the string/sentance
		String sentance = sc.nextLine();// ref:-i am gopi
		// this method is used to swap vowel cases (if a vowel is in lowerCase
		// then change it to upperCase)
		String afterSwappingVowelCase = swapVowelCase(sentance);
		// after reversing the words in a sentance those words are stored in this string
		// array
		String[] afterReversingWords = splitWordsAndReverseTheWords(afterSwappingVowelCase, ' ');
		// this method is used to display the final value
		displaySentance(sentance, afterReversingWords);
	}

//***************************method to display final output*****************************
	private static void displaySentance(String sentance, String[] afterReversingWords) {
		// printing original sentance
		System.out.println("Original senatance:" + sentance);
		// loop to print the converted string/sentance
		System.out.println("After reversing every word in the sentance");
		for (int i = afterReversingWords.length - 1; i > 0; i--) {
			// print the converted words
			System.out.print(afterReversingWords[i] + " ");
		}
		System.out.print(afterReversingWords[0]);
	}

//**************method to split each and every word in a sentance w.r.t space********************
	private static String[] splitWordsAndReverseTheWords(String afterSwappingVowelCase, char ch) {
		int count = findTotalNoOfWordsInAString(afterSwappingVowelCase, ' ');
		// create an array to store the words
		String words[] = new String[count];
		// here temp is used to store char by char until
		String temp = "";
		int j = 0;
		// this loop is used to store Sentance in reverse order
		for (int i = afterSwappingVowelCase.length() - 1; i >= 0; i--) {
			// if space is triggered then if() fails and goes to else part
			if (afterSwappingVowelCase.charAt(i) != ch) {
				// temp stores the value until space is triggered
				temp = temp + afterSwappingVowelCase.charAt(i);
				words[j] = temp;
			} else {
				// j is an index for new string array
				j++;
				// remove the previous word which is present in temp variable
				temp = "";
			}
		}
		// return output
		return words;
	}

//**************method is used to find the no of words in a string/sentance***********
	private static int findTotalNoOfWordsInAString(String afterSwappingVowelCase, char ch) {
		// the count is used to find the no of words present in a string
		int count = 1;
		for (int i = 0; i < afterSwappingVowelCase.length(); i++) {
			// where ever the space is triggered the count gets incremented
			if (afterSwappingVowelCase.charAt(i) == ch) {
				count++;
			}
		}
		// return count to split method
		return count;
	}

// **************method is used to swap the vowel case upper to lower & lower to upper******************
	private static String swapVowelCase(String sentance) {
		String temporaryString = "";
		// loop is used to travel from start to end of the string
		for (int i = 0; i < sentance.length(); i++) {
			// if the vowel is uppercase then make it lowercase
			if (sentance.charAt(i) == 'A' || sentance.charAt(i) == 'E' || sentance.charAt(i) == 'I'
					|| sentance.charAt(i) == 'O' || sentance.charAt(i) == 'U') {
				// A+32 = 65+32 = 97. ascii value of 97 is 'a'.
				temporaryString += (char) (sentance.charAt(i) + 32);
				// if the vowel is lowercase then make it uppercase
			} else if (sentance.charAt(i) == 'a' || sentance.charAt(i) == 'e' || sentance.charAt(i) == 'i'
					|| sentance.charAt(i) == 'o' || sentance.charAt(i) == 'u') {
				// a-32 = 97-32 = 65. ascii value of 65 is 'A'.
				temporaryString += (char) (sentance.charAt(i) - 32);
			} else {
				temporaryString += sentance.charAt(i);
			}
		}
		System.out.println("After changing the vowel case:\n" + temporaryString);
		// return output
		return temporaryString;
	}

}
