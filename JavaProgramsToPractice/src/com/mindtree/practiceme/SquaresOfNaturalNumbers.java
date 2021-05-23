package com.mindtree.practiceme;

public class SquaresOfNaturalNumbers {

	public static void main(String[] args) {
		int[] naturalSquares = new int[10];
		int k = 0;
		for (int i = 1; i <= 10; i++) {
			naturalSquares[k] = i * i;
			k++;
			System.out.print(i + " : ");
			System.out.print(naturalSquares[k]);
			System.out.println();
		}
		for (int i : naturalSquares) {
			System.out.println(i);
		}
	}

}
