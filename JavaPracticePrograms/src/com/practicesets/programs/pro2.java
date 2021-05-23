package com.practicesets.programs;

public class pro2 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= 10; i++) {
			if (n > 2 && n < 9) {
				continue;
			} else {
				System.out.println(i);
			}
		}
	}
}
