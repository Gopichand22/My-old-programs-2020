package prac;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println("Enter the name"); String name = sc.next(); String revName
		 * = ""; for (int i = name.length() - 1; i >= 0; i--) { revName +=
		 * name.charAt(i); } System.out.println(name);
		 * System.out.println(name.hashCode()); System.out.println(revName);
		 * System.out.println(revName.hashCode()); System.out.println("\n\n");
		 */
		// converting
		String name2 = "Gopichand Reddy";
		String name3 = "";
		String star = "*";
		for (int i = 0; i < name2.length(); i++) {
			if (i % 2 != 0) {
				name3 += star;
			} else {
				name3 += name2.charAt(i);
			}
		}
			System.out.println(name2);
			System.out.println(name2.hashCode());
			System.out.println(name3);
			System.out.println(name3.hashCode());
	}


}
