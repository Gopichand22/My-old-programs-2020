/**
 * HailStone
 */
package com.mindtreefirstset.withnewupdates;

import com.mindtreefirstset.validations.AllValidationChecks;

/**
 * @author Gopichand
 *
 */
public class HailStoneApplication {


	public static void main(String[] args) {

		HailStoneLogic hailStone = new HailStoneLogic();
		System.out.println("Enter a Positive Number:");
		hailStone.calculation(AllValidationChecks.integerCheck());
	}

}
