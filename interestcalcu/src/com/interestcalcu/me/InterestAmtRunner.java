package com.interestcalcu.me;

import java.math.BigDecimal;

public class InterestAmtRunner {

	public static void main(String[] args) {
		SICalculator calcu = new SICalculator("4500.00", "7.5");
		BigDecimal totalVal = calcu.calcuTotalVal(5);// years
		System.out.println(totalVal);
	}

}
