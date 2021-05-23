package com.interestcalcu.me;

import java.math.BigDecimal;

public class SICalculator {
	BigDecimal principal;
	BigDecimal interest;

	public SICalculator(String principal, String interest) {
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
	}

	public BigDecimal calcuTotalVal(int noOfYears) {
		BigDecimal noOfYearsToBig = new BigDecimal(noOfYears);
		BigDecimal totalVal = principal.add(principal.multiply(interest).multiply(noOfYearsToBig));
		return totalVal;
	}


}
