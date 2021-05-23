package com.mindtreefirstset.withnewupdates;

import com.mindtreefirstset.validations.AllValidationChecks;

public class AreaOfShapeApplication {
	public static void main(String[] args) {
		AreaOfShapesLogic shapes = new AreaOfShapesLogic();
		System.out.println("Please enter the geometric shape which you want to calculate:");
		shapes.userShape(AllValidationChecks.stringCheck());
	}
}
