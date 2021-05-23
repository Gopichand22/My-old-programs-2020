package com.mindtree.programset2;

import com.mindtreefirstset.validations.AllValidationChecks;

public class Employee {

	private int id;
	private String name;
	private String Desigination;
	private String Department;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id > 0) {
			this.id = id;
		} else {
			System.out.println("please enter corret id\n(which is greater than ZERO)\nEmp id:");
			setId(AllValidationChecks.integerCheck());
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null) {
			System.out.println("Please enter the name");
		}
		this.name = name;
	}

	public String getDesigination() {
		return Desigination;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public void setDesigination(String Desigination) {
		int flag = 0;
		String s[] = new String[] { "developer", "tester", "lead", "manager" };
		for (int i = 0; i < s.length - 1; i++) {
			if (s[i].equalsIgnoreCase(Desigination)) {
				flag = 1;
			}
		}
		if (flag == 1) {
			this.Desigination = Desigination;
		} else {
			System.out.println("Please enter correct Desigination");
			setDesigination(AllValidationChecks.stringCheck());
		}
	}
}
