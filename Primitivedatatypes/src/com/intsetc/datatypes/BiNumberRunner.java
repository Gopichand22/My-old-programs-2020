package com.intsetc.datatypes;

public class BiNumberRunner {

	public static void main(String[] args) {
		BiNumber nums = new BiNumber(2,3);
		
		System.out.println(nums.add());
		System.out.println(nums.mul());
		nums.doubleVal();
		System.out.println(nums.getNumber1());
		System.out.println(nums.getNumber2());
	}

}
