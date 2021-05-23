package com.mindtree.programset2;

public class StudentMarks {
	public static void main(String args[]) {
		Student highMarks[] = new Student[100];
		highMarks[0] = new Student(1, "Gopichand", "cse", 578);
		highMarks[1] = new Student(2, "Sangi", "ase", 532);
		highMarks[2] = new Student(3, "Goutham Reddy", "bse", 815);

		Student hmarks = new Student();

		double studentMarks[] = new double[3];
		for (int i = 0; i < 3; i++) {
			studentMarks[i] = highMarks[i].getMarksOfTheStudent();
		}
		double highestMarks = hmarks.highest(studentMarks);
		System.out.println(highestMarks);
	}

}
