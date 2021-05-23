package com.mindtreefirstset.withnewupdates;

import com.mindtreefirstset.validations.AllValidationChecks;

public class AlphaFrequencyApplication {

	public static void main(String[] args) {
		System.out.println("Enter a String");
		String string = AllValidationChecks.stringCheck();
		String result = "";
		char[] ch = new char[100];
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') {
				ch[i] = (char) (string.charAt(i) + 32);
			} else {
				ch[i] = (string.charAt(i));
			}
		}
		int count, index = 0, k;
		while (ch[index] != '\0') {
			count = 0;
			char character = ch[index];
			for (k = index; ch[k] == character; k++)
				count++;
			result = result + character + count;
			index = index + count;
		}
		System.out.println(result);
	}

}
