package com.begintoend.coding;

import java.util.Scanner;

import com.mindtreefirstset.validations.AllValidationChecks;

public class MonsterGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input:");
		System.out.println("Enter no of monsters:");
		int monsters = sc.nextInt();
		int[] monstersPower = new int[monsters];
		int[] victoryBonus = new int[monsters];
		System.out.println("Enter ur power/points");
		int myPower = AllValidationChecks.positiveIntegerCheck();
		for (int i = 0; i < monsters; i++) {
			System.out.println("Enter monster - " + i + "'s Power points");
			monstersPower[i] = AllValidationChecks.positiveIntegerCheck();
			System.out.println("Enter monster - " + i + "'s Bonus");
			victoryBonus[i] = AllValidationChecks.positiveIntegerCheck();
		}
		int count = 0;
		for (int j = 0; j < monsters; j++) {
			int min = 1;
			for (int i = 0; i < monsters; i++) {
				if (min > 0 && min <= monstersPower[i]) {
					min = i;
				}
			}
			if (monstersPower[min] >= myPower) {
				monstersPower[min] = 0;
				myPower += victoryBonus[min];
				count++;
			}
		}
		System.out.println("Output:");
		System.out.println(count);
	}

}
