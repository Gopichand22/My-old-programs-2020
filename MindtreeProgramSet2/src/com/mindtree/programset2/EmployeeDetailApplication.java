package com.mindtree.programset2;

import com.mindtreefirstset.validations.AllValidationChecks;

public class EmployeeDetailApplication {

	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println("Enter Employee details");
		System.out.println("Emp id:");
		emp.setId(AllValidationChecks.integerCheck());
		System.out.println("Emp Name:");
		emp.setName(AllValidationChecks.stringCheck());
		System.out.println("Emp Designation:");
		emp.setDesigination(AllValidationChecks.stringCheck());
		System.out.println("Emp Department:");
		emp.setDepartment(AllValidationChecks.stringCheck());
		System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getDesigination() + " " + emp.getDepartment());

	}
}
