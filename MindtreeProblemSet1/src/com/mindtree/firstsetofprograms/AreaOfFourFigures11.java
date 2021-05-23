package com.mindtree.firstsetofprograms;

import java.util.Scanner;

public class AreaOfFourFigures11 {
	public static void main(String[] args) {
		Shapes shapes = new Shapes();
		AllValidationChecks validate = new AllValidationChecks();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the geometric shape which you want to calculate:");
		String shape = sc.next();
		String checkShape = validate.stringCheck(shape);
		shapes.userShape(checkShape);
	}

	}

