package com.mindtree.firstsetofprograms;

import java.util.Scanner;

public class TestUSN21 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String name;
		name = sc.nextLine();
		if (name.length() == 10) {

			if ((name.charAt(0) == '1' || name.charAt(0) == '2') && (name.charAt(1) >= 'A' && name.charAt(1) <= 'Z')
					&& (name.charAt(2) >= 'A' && name.charAt(2) <= 'Z') && (name.charAt(3) >= '0' && name.charAt(3) <= '9')
					&& (name.charAt(4) >= '0' && name.charAt(4) <= '9') && (name.charAt(5) == 'C' && name.charAt(6) == 'S')
					|| (name.charAt(5) == 'I' && name.charAt(6) == 'S')
					|| (name.charAt(5) == 'E' && name.charAt(6) == 'C')
					|| (name.charAt(5) == 'M' && name.charAt(6) == 'E') && (name.charAt(7) >= '0' && name.charAt(7) <= '9')
							&& (name.charAt(8) >= '0' && name.charAt(8) <= '9')
							&& (name.charAt(9) >= '0' && name.charAt(9) <= '9')) {
				System.out.println("Success");
			} else {
				System.out.println("Failure");

			}

		}
	}
}
