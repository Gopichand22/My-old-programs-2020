package com.practice.problems;

import com.mindtreefirstset.validations.AllValidationChecks;

public class Library {

	public static void main(String[] args) {
		boolean isValid = true;
		int noOfBooks, arrayCount = 0;
		System.out.println("Enter no of Books:");
		noOfBooks = AllValidationChecks.positiveIntegerCheck();
		BookInLibrary[] bookObject = new BookInLibrary[noOfBooks];
		do {
			switch (chooseOption()) {
			case 1:
				arrayCount = addBookDetails(bookObject, arrayCount, noOfBooks);
				break;
			case 2:
				seachABookByItsName(bookObject, arrayCount);
				break;
			case 3:
				sortBookByItsAuthor(bookObject, arrayCount);
				break;
			case 4:
				updateNoOfCopiesById(bookObject, arrayCount);
				break;
			case 5:
				System.out.println("Exiting..Bye");
				isValid = false;
				break;
			default:
				System.out.println("please choose 1");
				break;
			}

		} while (isValid);
	}

	private static int chooseOption() {
		System.out.println("1.Add book details & display existing book details");
		System.out.println("2.Search for a book by its name");
		System.out.println("3.Sort books by its author");
		System.out.println("4.Update no of copies of book by its Id");
		System.out.println("5.Exit");
		return AllValidationChecks.positiveIntegerCheck();
	}

	private static int addBookDetails(BookInLibrary[] bookObject, int arrayCount, int noOfBooks) {
		if (arrayCount < noOfBooks) {
			System.out.println("Enter Id:");
			int id = AllValidationChecks.positiveIntegerCheck();
			System.out.println("Enter Book Name:");
			AllValidationChecks.stringLineCheck();
			String name = AllValidationChecks.stringLineCheck();
			System.out.println("Enter Publisher name:");
			String publisher = AllValidationChecks.stringLineCheck();
			System.out.println("Enter Author name:");
			String author = AllValidationChecks.stringLineCheck();
			System.out.println("No of copies:");
			int copies = AllValidationChecks.positiveIntegerCheck();
			bookObject[arrayCount] = new BookInLibrary(id, name, publisher, author, copies);
			arrayCount++;

			display(bookObject, arrayCount);

		} else {
			System.out.println("There is no space in the database");
		}
		return arrayCount;
	}

	private static void display(BookInLibrary[] bookObject, int arrayCount) {
		for (int i = 0; i < arrayCount; i++) {
			System.out.println(
					bookObject[i].getId() + "\t" + bookObject[i].getName() + "\t" + bookObject[i].getPublisher() + "\t"
							+ bookObject[i].getAuthor() + "\t" + bookObject[i].getCopies());
		}
	}

	private static void seachABookByItsName(BookInLibrary[] bookObject, int arrayCount) {
		if (arrayCount > 0) {
			boolean flag = true;
			System.out.println("Enter book name to get that details of that book");
			AllValidationChecks.stringLineCheck();
			String name = AllValidationChecks.stringLineCheck();
			for (int i = 0; i < arrayCount; i++) {
				if (name.equals(bookObject[i].getName())) {
					String updatedName = alternativeUppercase(name);
					System.out.println(updatedName + " " + bookObject[i].getId() + "\t" + bookObject[i].getPublisher()
							+ "\t" + bookObject[i].getAuthor() + "\t" + bookObject[i].getCopies());
					flag = false;
				}
			}
			if (flag) {
				System.out.println("Entered id does not exist in the database");
				display(bookObject, arrayCount);
			}

		} else {
			System.out.println("There is no data in the database");
		}
	}

	private static String alternativeUppercase(String name) {
		String temp = "";
		for (int i = 0; i < name.length(); i++) {
			if (i % 2 != 0) {
				if (name.charAt(i) >= 97 && name.charAt(i) <= 122) {
					temp = temp + (char) (name.charAt(i) - 32);
				} else {
					temp = temp + (name.charAt(i));
				}
			} else {
				temp = temp + (name.charAt(i));
			}
		}
		return temp;
	}

//sorting based on author
	private static BookInLibrary[] sortBookByItsAuthor(BookInLibrary[] bookObject, int arrayCount) {
		if (arrayCount > 0) {

			System.out.println("sorting based on charges");
			System.out.println("................................................");
			for (int i = 0; i < arrayCount; i++) {
				for (int j = 0; j < arrayCount - i - 1; j++) {
					if (bookObject[j].getAuthor().compareTo(bookObject[j + 1].getAuthor()) > 0) {
						BookInLibrary temp = bookObject[j];
						bookObject[j] = bookObject[j + 1];
						bookObject[j + 1] = temp;
					}
				}
			}
//display the data after sorting
			display(bookObject, arrayCount);

		} else {
			System.out.println("There is no data in the database");
		}
		return bookObject;
	}

	private static void updateNoOfCopiesById(BookInLibrary[] bookObject, int arrayCount) {
		if (arrayCount > 0) {
			System.out.println("Enter id");
			int id = AllValidationChecks.positiveIntegerCheck();
			for (int i = 0; i < arrayCount; i++) {
				if (id == bookObject[i].getId()) {
					System.out.println("Enter new copies to add into :");
					int newCopies = bookObject[i].getCopies() + AllValidationChecks.positiveIntegerCheck();
					bookObject[i].setCopies(newCopies);
				}
			}

		} else {
			System.out.println("There is no data in the database");
		}
	}

}
