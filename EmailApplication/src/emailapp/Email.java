package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int passwordLengthDefault = 10;
	private int mailboxCapacity;
	private String alternateEmail;

	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email Created : " + this.firstName + " " + this.lastName);

		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		this.password = randomPassword(8);
		System.out.println("UR password is :" + this.password);
	}


	private String setDepartment() {
		System.out.println("Enter the Department \n1. Sales \n2.development\n3.accounts\n0. NONE\n");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) {
			return "Sales";
		} else if (depChoice == 2) {
			return "Dev";
		} else if (depChoice == 3) {
			return "accounts";
		} else {
			return "";
		}
	}

	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789#$%@^&*(";
		char[] pass = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			pass[i] = passwordSet.charAt(rand);
		}
		return new String(pass);

	}

}
