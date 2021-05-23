package com.gopi.oopsintro;

public class BookRunner {

	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book();
		Book effectiveJava = new Book();
		Book cleanCode = new Book();

		artOfComputerProgramming.setnoOfCopies(100);
		effectiveJava.setnoOfCopies(120);
		cleanCode.setnoOfCopies(60);

		cleanCode.increasecopy(50);

		System.out.println();
	}

}
