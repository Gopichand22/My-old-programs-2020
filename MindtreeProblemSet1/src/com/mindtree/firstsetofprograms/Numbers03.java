package com.mindtree.firstsetofprograms;

public class Numbers03 {

	public void hStone(int num) {
		int steps = 0;
		if (num <= 0) {
			System.out.println("Invalid input");
		}
		else {
		while (num != 1) {
			if (num % 2 == 0) {
				System.out.println(num + " is even so i am take half: " + num / 2);
				num /= 2;
				steps++;
			} else {
				System.out.println(num + " is odd so i make 3n+1: " + (num * 3 + 1));
				num = num * 3 + 1;
				steps++;
			}
		}
		System.out.println("There are total " + steps + " steps to reach 1");
	}

	}
}
