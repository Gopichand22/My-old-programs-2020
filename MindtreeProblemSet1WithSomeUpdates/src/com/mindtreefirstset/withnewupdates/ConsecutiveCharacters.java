package com.mindtreefirstset.withnewupdates;

import java.util.Scanner;

public class ConsecutiveCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string1;
		String lowerCase = "";
		System.out.println("Enter the String:");
		string1 = sc.nextLine();
		for (int i = 0; i < string1.length(); i++) {
			int ch = string1.charAt(i);
			if (ch >= 97 && ch <= 122) {
				ch = ch - 32;
				lowerCase = lowerCase + (char) ch;
			} else {
				lowerCase = lowerCase + (char) ch;
			}
		}
		printConsecutiveChars(lowerCase);

	}

	static void printConsecutiveChars(String a) {
		int i, check, j = 65, count;
		char ch1 = '0';
		char ch2 = '0';
		while (j <= 90) {
			count = check = 0;
			for (i = 1; i < a.length(); i++) {
				if ((a.charAt(i - 1) == (char) (j)) && (a.charAt(i) == (char) (j + 1))) {
					ch1 = a.charAt(i - 1);
					ch2 = a.charAt(i);
					count++;
					check++;
				}
			}
			if (check > 0) {
				System.out.print(ch1);
				System.out.println(ch2 + ": " + count);
			}
			j++;
		}

	}

}
