package com.mindtree.groupb;

import java.util.Scanner;

public class ChangeToStarAtSpecialChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		sc.close();
		String star = "*";
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || str.charAt(i) >= '0' && str.charAt(i) <= '9'
					|| str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				temp = temp + str.charAt(i);
			} else {
				if (str.charAt(i) == '*') {
					temp = temp + star;
					continue;
				}
				temp = temp + star;
			}
		}
		System.out.println(temp);
	}

}
