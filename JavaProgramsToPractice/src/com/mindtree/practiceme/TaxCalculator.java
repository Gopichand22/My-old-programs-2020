package com.mindtree.practiceme;

import com.mindtreefirstset.validations.AllValidationChecks;

public class TaxCalculator {

	public static void main(String[] args) {

		System.out.println("Enter eanrnig of an emplpoyee:");
		double tax, earning = AllValidationChecks.doubleCheck();
		if (earning < 0) {
			System.out.println("Enter valid ammout to calculate tax");
		} else {
			
			if (earning >= 0 && earning <= 50000)
				tax = 0;
			else if (earning <= 60000)
				tax = 0.1 * (earning - 50000);
			else if (earning <= 150000)
				tax = (0.2 * (earning - 60000)) + (0.1 * 10000);
			else
				tax = (0.3 * (earning - 150000)) + (0.2 * 90000) + (0.1 * 10000);
			System.out.println("Income tax amount is " + tax);
		}
	}

}
