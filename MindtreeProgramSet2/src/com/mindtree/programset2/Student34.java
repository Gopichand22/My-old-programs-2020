package com.mindtree.programset2;

public class Student34 {

	int id;
	String name;
	String branch;
	double marks;

	public Student34(int id, String name, String branch, double marks) {
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.marks = marks;
	}

	public Student34() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public void dispaly(String[] sn, String[] sbranch) {
		for (int i = 0; i < sn.length; i++) {
			System.out.print(sn[i] + " " + sbranch[i] + "\n");
		}
		System.out.println();
	}

	public void dispaly(int[] studentId, String[] studentName1) {

		for (int i = 0; i < studentId.length; i++) {
			System.out.print(studentId[i] + " " + studentName1[i] + "\n");
		}
		System.out.println();
	}

	public void highest(double[] smarks, String[] sn2) {
		double maxmarks = 0;
		String name1 = "";
		for (int i = 0; i < smarks.length; i++) {
			if (smarks[i] > maxmarks) {
				maxmarks = smarks[i];
				name1 = sn2[i];
			}
		}
		System.out.println("Marks:" + " " + maxmarks + "  " + "name:" + "  " + name1);
	}
}
