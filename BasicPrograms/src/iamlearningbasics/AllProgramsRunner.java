package iamlearningbasics;

import java.util.Scanner;

public class AllProgramsRunner {

	public static void main(String[] args) {
		FirstProgram first = new FirstProgram();
		System.out.println("Enter a number to print that table: \n");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		first.table(x);
	}



}
