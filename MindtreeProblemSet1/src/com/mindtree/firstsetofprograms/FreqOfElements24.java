package com.mindtree.firstsetofprograms;

import java.util.Scanner;

public class FreqOfElements24 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.next();
		String y = "";
		char[] n = new char[100];
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				n[i] = (char) (str.charAt(i) + 32);
			} else {
				n[i] = (str.charAt(i));
			}
		}
		int j, i = 0, k;
		while (n[i] != '\0') {
			j = 0;
			char c = n[i];
			for (k = i; n[k] == c; k++)
				j++;
				y = y + c + j;
				i = i + j;
			}
		System.out.println(y);
	}

}
