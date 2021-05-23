package com.newconcepts.objs;

import java.util.Scanner;

public class PrintStudentWithDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfStudents;
		System.out.println("Enter the number of students that you want to enter: ");
		noOfStudents = sc.nextInt();
		Student students[] = new Student[noOfStudents];
		System.out.println(students.length);
		int j = 0;
		for (int i = 0; i < noOfStudents; i++) {
			students[i] = new Student();
			System.out.format("Enter Student %d Name:", ++j);
			sc.nextLine();
			students[i].name = sc.nextLine();
			System.out.println("Enter Student Marks:");
			students[i].marks = sc.nextInt();
			System.out.println("Enter Student Section:");
			students[i].section = sc.next().charAt(0);

		}
		sc.close();

		for (int i = 0; i < noOfStudents; i++) {
			System.out.println("Mr/Mrs. " + students[i].name + " in section " + students[i].section + " got "
					+ students[i].marks + " Marks. ");
		}

	}

}
