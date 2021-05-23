package com.mindtree.firstsetofprograms;

public class Factorial {

	long FactOfN(int num) {
		long fact = 1;
		if (num == 0) {
			return 1;
		}
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;

	}

}
