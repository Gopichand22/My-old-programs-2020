package arraymethods;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		Student student = new Student("Gopichand", 94, 54, 74, 85, 76);
		int number = student.getNumberOfMarks();
		System.out.println("Number of marks " + number);
		int sum = student.getSumOfMarks();
		System.out.println("Sum of marks " + sum);
		int maxvalue = student.getMaxNumber();
		System.out.println("Max value is " + maxvalue);
		int minvalue = student.getMinValue();
		System.out.println("Min value is " + minvalue);
		BigDecimal avgg = student.getAvgMarks();
		System.out.println("Average of all marks " + avgg);
	}

}
