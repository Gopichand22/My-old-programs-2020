package hackthon1;

import java.util.Scanner;

public class ReducedString {

	public static void main(String[] args) {
		/*
		 * Examples:- Input:aab. Output:b
		 * 
		 * Input:abba. Output:empty
		 */

		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		String input = sc.next();// baaba
		String temp = "";
		flag = findConseAlphs(flag, input);
		temp = reducedStringLogic(input);
		while (!flag) {

			temp = reducedStringLogic(temp);
			flag = findConseAlphs(flag, temp);
		}
		System.out.println(temp);
	}

	private static boolean findConseAlphs(boolean flag, String input) {
		if (input.length() == 1) {
			return true;
		}

		for (int i = 0; i < input.length() - 1; i++) {
			if (input.charAt(i) == input.charAt(i + 1)) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	private static String reducedStringLogic(String input) {
		String temp = "";
		for (int i = 0; i < input.length() - 1; i++) {
			if (input.charAt(i) == input.charAt(i + 1)) {// b==a
				i = i + 1;
				continue;
			} else {
				temp += input.charAt(i);// b
			}
		}
		if (input.length() == 1) {
			temp += input.charAt(input.length() - 1);
		}
		return temp;
	}
}
