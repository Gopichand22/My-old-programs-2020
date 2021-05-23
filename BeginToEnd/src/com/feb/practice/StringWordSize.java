package com.feb.practice;

import java.util.Scanner;

public class StringWordSize {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentance:");
		// Enter a sentance
		String sentance = sc.nextLine();
		// Create string array to store all the words in a sentance
		// i created a method called splitIntoWords by passing string and trigger as
		// space(' ')
		String words[] = splitIntoWords(sentance, ' ');
		// loop to print all words and their sizes
		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i] + words[i].length());
		}
	}

//method to split each and every word in a sentance w.r.t space
	private static String[] splitIntoWords(String sentance, char ch) {
		// the count is used to find the no of words present in a string
		int count = 0;
		for (int i = 0; i < sentance.length(); i++) {
			// where ever the space is triggered the count gets incremented
			if (sentance.charAt(i) == ch) {
				count++;
			}
		}
		// create an array to store the words
		String words[] = new String[count];
		// here temp is used to store char by char until
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
}
