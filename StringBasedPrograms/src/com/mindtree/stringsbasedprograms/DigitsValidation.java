package com.mindtree.stringsbasedprograms;

import java.util.Scanner;

public class DigitsValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("checking a String which contains only numbers by using Regular expression");
		String string1 = sc.next();
		// regex-- checking wether it is a number or not
		if (string1.matches("^[0-9]*")) {
			System.out.println("String contains only numbers");
		} else {
			System.out.println("Please enter only numbers");
		}

	}
}