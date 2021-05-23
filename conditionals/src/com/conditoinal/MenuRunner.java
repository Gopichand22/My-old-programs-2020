package com.conditoinal;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number1: ");
		int number1 = scanner.nextInt();

		System.out.println("Enter number 2: ");
		int number2 = scanner.nextInt();
		System.out.println("Available choices are:");
		System.out.println("1 - Add");
		System.out.println("2 - Substract");
		System.out.println("3 - Divide");
		System.out.println("4 - Multiply");
		System.out.println("Choice : ");
		int choosen = scanner.nextInt();

		performswitchoperation(number1, number2, choosen);
	}
	private static void performswitchoperation(int number1, int number2, int choosen) {
		if (choosen == 1) {
			System.out.println("Result " + (number1 + number2));
		} else if (choosen == 2) {
			System.out.println("Result " + (number1 - number2));
		} else if (choosen == 3) {
			System.out.println("Result " + (number1 / number2));
		} else if (choosen == 4) {
			System.out.println("Result " + (number1 * number2));
		}

	}
}
