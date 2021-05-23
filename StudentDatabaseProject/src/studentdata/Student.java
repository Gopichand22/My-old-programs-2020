package studentdata;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private String gradeYear;
	private String studentId;
	private String courses;
	private int tutionBal = 0;
	private static int priceOfCourse = 600;
	private static int id = 1000;

	// constuctor user enter student name & year
	public Student() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first name:");
		this.firstName = sc.nextLine();
		System.out.println("Enter the last name:");
		this.lastName = sc.nextLine();
		System.out.println("1 - Junior\n2 - secondyear\n3 - thirdyear\n4 - senior  Enter the year:");
		this.gradeYear = sc.nextLine();
		System.out.println(firstName + " " + lastName + " " + gradeYear);
		setStudentId();
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentId);
	}
	// generate ID
	private void setStudentId() {
		id++;
		this.studentId = gradeYear + "" + id;

	}

	// enrolling courses
	public void enroll() {
		// get inside a loop until 0
		do {
		System.out.println("Enter course to enroll (Press Q to quit): ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String course = sc.nextLine();
		if (!course.equals("Q")) {
			courses = courses + "\n" + course;
			tutionBal = tutionBal + priceOfCourse;
		}
		else {
			break;
		}
	} while (true);
		System.out.println("Enrolled in : " + courses);
		System.out.println("Tution Balance : " + tutionBal);

	}
	// view bal

	// pay tution fee

	// show status

}
