
package com.mindtreefirstset.withnewupdates;

import com.mindtreefirstset.validations.AllValidationChecks;

/**
 * @author Gopichand
 *
 */
public class MultiplicationTableApplication {

	public static void main(String[] args) {
		System.out.println("Enter a number for multiplication table:");
		multiply(AllValidationChecks.integerCheck());
	}

//Methods
	private static void multiply(int table) {
		for (int i = 1; i <= 12; i++) {
			System.out.format("%d X %d = %d", table, i, table * i).println();
		}
	}

}
