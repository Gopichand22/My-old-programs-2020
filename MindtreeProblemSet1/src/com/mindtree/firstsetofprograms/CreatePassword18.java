package com.mindtree.firstsetofprograms;

import java.util.Scanner;

public class CreatePassword18 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name: ");
		String firstName = sc.next();
		System.out.println("Enter Middle Name: ");
		String middleName = sc.next();
		System.out.println("Enter LastName Name: ");
		String lastName = sc.next();
		System.out.println("Enter age: ");
		String age = sc.next();
		Student st = new Student(firstName, middleName, lastName, age);
		System.out.println(st.getFirstName().substring(0, 1) + st.getMiddleName().substring(0, 1)
				+ st.getLastName().substring(0, 1) + st.getAge());
}
}