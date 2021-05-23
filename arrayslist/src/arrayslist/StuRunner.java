package arrayslist;

import java.math.BigDecimal;

public class StuRunner {

	public static void main(String[] args) {
		Student student = new Student("Chand", 91, 100);

		int number = student.getNoOfMarks();
		System.out.println("number of marks : " + number);

		int sum = student.getTotalSumOfMarks();
		System.out.println("Total no of Marks : " + sum);

		int max = student.getmax();
		System.out.println("max value is : " + max);

		int min = student.getMin();
		System.out.println("min value is : " + min);

		BigDecimal average = student.getAvgMarks();
		System.out.println("Avg value is : " + average);
		System.out.println(student);

		student.addMark(24);
		System.out.println(student);
		student.removeMarksWithIndex(1);
		System.out.println(student);

	}

}
