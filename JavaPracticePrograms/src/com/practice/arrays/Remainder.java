package com.practice.arrays;

public class Remainder {

	public static void main(String[] args) {
		int num = 45;
		int rem, count = 0, zeros = 0;
		while (num != 0) {
			rem = num % 2;
			if (rem == 1) {
				count++;
			} else {
				zeros++;
			}
			num = num / 2;
		}
		System.out.println("1's: " + count);
		System.out.println("0's: " + zeros);
	}

}
