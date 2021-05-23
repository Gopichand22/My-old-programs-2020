package com.mindtree.programset2;

public class SavingAccount {
	private int ac;
	private double bal;
	private double interest;

	public SavingAccount(int accountNumber, double balance, double rateOfInterest) {
		ac = accountNumber;
		bal = balance;
		interest = rateOfInterest;

	}

	public int getAc() {
		return ac;
	}

	public void setAc(int ac) {
		this.ac = ac;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}


	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}



}
