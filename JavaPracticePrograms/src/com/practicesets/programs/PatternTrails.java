package com.practicesets.programs;

public class PatternTrails {

	public static void main(String[] args) {
		for (int i = 5; i <= 9; i++) {
			for (int j = 5; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
