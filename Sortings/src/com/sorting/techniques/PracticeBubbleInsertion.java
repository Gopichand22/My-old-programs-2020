package com.sorting.techniques;

import java.util.Scanner;

public class PracticeBubbleInsertion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String str2 = "";

		for (int i = 0; i < str.length(); i++) {
			if (str2 == "") {
				str2 += str.charAt(i);
			} else {
				boolean flag = true;
				for (int k = 0; k < str2.length(); k++) {
					if (str.charAt(i) == str2.charAt(k)) {
						flag = false;
						break;
					}
				}
				if (flag) {
					str2 += str.charAt(i);
				}

			}
		}
		System.out.println(str2);
	}
}
