package com.mindtree.programset2;

import com.mindtreefirstset.validations.AllValidationChecks;

public class StudentMarksAndDetail34 {

	public static void main(String args[]) {
		int ch;
		int indexValue = 3;
		Student34 topmarks[] = new Student34[100];
		topmarks[0] = new Student34(1, "Gopichand", "cse", 578);
		topmarks[1] = new Student34(2, "Sangi", "ase", 532);
		topmarks[2] = new Student34(3, "Goutham Reddy", "bse", 815);
		do {
			Student34 highestMarks = new Student34();
			System.out.println("Enter the choice");
			System.out.println("1.Create new student data");
			System.out.println("2.Display the name according to the branch");
			System.out.println("3.Display the id's of students in ascending order");
			System.out.println("4.Display highest marks scored by the student");
			System.out.println("5.Exit");
			ch = AllValidationChecks.integerCheck();
			switch (ch) {
			case 1:
				System.out.println("Enter the student id no:");
				highestMarks.setId(AllValidationChecks.integerCheck());
				System.out.println("Enter the name of the student");
				highestMarks.setName(AllValidationChecks.stringCheck());
				System.out.println("Enter the barnch of the student");
				highestMarks.setBranch(AllValidationChecks.stringCheck());
				System.out.println("Enter the marks of the student");
				highestMarks.setMarks(AllValidationChecks.doubleCheck());

				topmarks[indexValue] = new Student34(highestMarks.getId(), highestMarks.getName(),
						highestMarks.getBranch(), highestMarks.getMarks());
				indexValue++;
				break;
			case 2:
				String studentName[] = new String[indexValue];
				String studentBranch[] = new String[indexValue];
				String temp, temp1;
				for (int i = 0; i < indexValue; i++) {
					studentName[i] = topmarks[i].name;
					studentBranch[i] = topmarks[i].branch;
				}
				for (int i = 0; i < indexValue; i++) {
					for (int j = i + 1; j < indexValue; j++) {
						if (studentBranch[i].compareTo(studentBranch[j]) > 0) {
							temp = studentBranch[i];
							studentBranch[i] = studentBranch[j];
							studentBranch[j] = temp;
							temp1 = studentName[i];
							studentName[i] = studentName[j];
							studentName[j] = temp1;
						}
					}
				}
				highestMarks.dispaly(studentName, studentBranch);
				break;
			case 3:
				int studentId[] = new int[indexValue];
				String studentName1[] = new String[indexValue];
				for (int i = 0; i < indexValue; i++) {
					studentId[i] = topmarks[i].id;
					studentName1[i] = topmarks[i].name;
				}
				int temp2;
				String temp3;
				for (int i = 0; i < indexValue; i++) {
					for (int j = i + 1; j < indexValue; j++) {
						if (studentId[i] > studentId[j]) {
							temp2 = studentId[i];
							studentId[i] = studentId[j];
							studentId[j] = temp2;
							temp3 = studentName1[i];
							studentName1[i] = studentName1[j];
							studentName1[j] = temp3;
						}
					}
				}
				highestMarks.dispaly(studentId, studentName1);
				break;
			case 4:
				double studentMarks[] = new double[indexValue];
				String studentName2[] = new String[indexValue];

				for (int i = 0; i < indexValue; i++) {
					studentMarks[i] = topmarks[i].marks;
					studentName2[i] = topmarks[i].name;
				}
				highestMarks.highest(studentMarks, studentName2);

				break;
			case 5:
				System.out.println("Exiting\nGood Bye");
				return;
			}
		} while (true);
	}

}
