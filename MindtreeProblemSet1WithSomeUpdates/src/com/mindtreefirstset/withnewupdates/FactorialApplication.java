/*
 *
 *  *  * @author Gopichand Reddy *  *  *  
 *
 */
package com.mindtreefirstset.withnewupdates;

import com.mindtreefirstset.validations.AllValidationChecks;

/*
*
*  *  * Factorial of a number *  *  * 
*
*/

public class FactorialApplication {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		fact(AllValidationChecks.integerCheck());
	}

	// Methods
	private static void fact(int number) {
		long fact = 1;
		if (number == 0) {
			System.out.println(fact);
		} else {
			for (int i = 1; i <= number; i++) {
				fact = fact * i;
			}
			System.out.println("Factorial of " + number + "  is " + fact);
		}

	}

}
