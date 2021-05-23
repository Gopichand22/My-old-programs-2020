package com.mindtree.firstsetofprograms;

import java.util.Scanner;

public class Shapes {
	public void userShape(String shape) {
		Scanner sc = new Scanner(System.in);
		double area;
		switch (shape) {
		case "triangle": {

			double base = sc.nextDouble();
			double height = sc.nextDouble();
			sc.close();

			area = (0.5 * (base * height));

			System.out.printf("The area of triangle: %.2f", area);

		}
			break;
		case "rectangle": {

			double width = sc.nextDouble();
			double length = sc.nextDouble();
			sc.close();
			area = (width * length);

			System.out.printf("The area of rectangle: %.2f", area);
		}
			break;
		case "square": {

			double side = sc.nextDouble();
			sc.close();
			area = (side * side);

			System.out.printf("The area of square: %.2f", area);
		}
			break;
		case "circle": {

			double radius = sc.nextDouble();
			sc.close();
			area = (3.14 * radius * radius);
			System.out.printf("The area of circle: %.2f", area);
		}
			break;
		default:
			System.out
					.println("Let me guide you there are Four Figures\ntriangle\nrectangle\nsquare\ncircle");
		}
	}

}
