package com.mindtreefirstset.withnewupdates;

public class HailStoneLogic {

	public void calculation(int positiveNumber) {
		int steps=0;
		if (positiveNumber <= 0) {
			System.out.println("Invalid Number");
		} else {
			while (positiveNumber != 1){
				if (positiveNumber % 2 == 0) {
					System.out.println(positiveNumber + " is even so i take half: " + positiveNumber / 2);
					positiveNumber /= 2;
					steps++;
				} else {
					System.out.println(positiveNumber + " is odd so i make 3n+1: " + (positiveNumber * 3 + 1));
					positiveNumber = positiveNumber * 3 + 1;
					steps++;
				}
			}
			System.out.println("There are total " + steps + " steps to reach 1");
			}
		}
	}
