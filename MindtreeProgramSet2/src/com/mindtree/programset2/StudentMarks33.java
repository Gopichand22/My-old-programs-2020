package com.mindtree.programset2;

public class StudentMarks33 {
	public static void main(String args[]) {
		StudentDetails studentsData = new StudentDetails(578, "Gopichand Reddy", true);
		if (studentsData.secondchance == false) {
			studentsData.identifymarks(60);
			System.out.println("Id:" + studentsData.getStid());
			System.out.println("Name:" + studentsData.getName());
			System.out.println("Marks:" + studentsData.getMarks());
		} else {
			studentsData.identifymarks(60, 70);
			System.out.println("Id:" + studentsData.getStid());
			System.out.println("Name:" + studentsData.getName());
			System.out.println("Marks:" + studentsData.getMarks());

		}
	}

}
