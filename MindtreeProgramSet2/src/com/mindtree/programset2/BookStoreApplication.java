package com.mindtree.programset2;

import java.util.Scanner;

import com.mindtreefirstset.validations.AllValidationChecks;

public class BookStoreApplication {
	private static Book[] obj;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the records");
		int records = AllValidationChecks.integerCheck();
		obj = new Book[records];
		for (int i = 0; i < records; i++) {
			System.out.println("Enter the name of the book" + " " + (i + 1));
			String bookname = AllValidationChecks.stringCheck();
			System.out.println("Enter the name of author" + " " + (i + 1));
			String author = AllValidationChecks.stringCheck();
			System.out.println("Enter the price of book" + " " + (i + 1));
			double price = AllValidationChecks.doubleCheck();
			System.out.println("Enter the year of publication" + " " + (i + 1));
			int yearofpublication = sc.nextInt();
			obj[i] = new Book(bookname, author, price, yearofpublication);

		}
		for (int i = 0; i < records; i++) {
			System.out.println("Title of the book: " + obj[i].getBookname());
			System.out.println("Author of the book: " + obj[i].getAuthor());
			System.out.println("Price of the book: $" + obj[i].getCost());
			System.out.println("Year of Publication the book: " + obj[i].getPublication() + "\n\n");
		}
	}
}
