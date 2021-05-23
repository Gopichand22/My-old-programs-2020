package com.mindtreefirstset.withnewupdates;

import java.util.Scanner;

import com.mindtreefirstset.validations.AllValidationChecks;

public class AreaOfShapesLogic {
	public void userShape(String shape) {

		Scanner sc = new Scanner(System.in);
		double area;
		switch (shape) {
		case "triangle": {

			int base = AllValidationChecks.integerCheck();
			int height = AllValidationChecks.integerCheck();
			sc.close();

			area = (0.5 * (base * height));

			System.out.printf("The area of triangle: %.2f", area);

		}
			break;
		case "rectangle": {

			int width = AllValidationChecks.integerCheck();
			int length = AllValidationChecks.integerCheck();
			sc.close();
			area = (width * length);

			System.out.printf("The area of rectangle: %.2f", area);
		}
			break;
		case "square": {

			int side = AllValidationChecks.integerCheck();
			sc.close();
			area = (side * side);

			System.out.printf("The area of square: %.2f", area);
		}
			break;
		case "circle": {

			double radius = AllValidationChecks.integerCheck();
			sc.close();
			area = (3.14 * radius * radius);
			System.out.printf("The area of circle: %.2f", area);
		}
			break;
		default:
			System.out.println("Let me guide you there are Four Figures\ntriangle\nrectangle\nsquare\ncircle");
		}
	}

}
