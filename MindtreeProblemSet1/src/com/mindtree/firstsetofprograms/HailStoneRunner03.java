package com.mindtree.firstsetofprograms;

import java.util.Scanner;

public class HailStoneRunner03 {

	public static void main(String[] args) {
		Numbers03 seq = new Numbers03();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a +ve number");
		int num = sc.nextInt();
		sc.close();
		seq.hStone(num);
	}
}
