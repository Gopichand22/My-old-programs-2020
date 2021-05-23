package arraymethods;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {

	private String name;
	private int[] marks;

	public Student(String name, int... marks) {
		this.name = name;
		this.marks = marks;
	}

	public int getNumberOfMarks() {
		return marks.length;
	}

	public int getSumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum = sum + mark;
		}
		return sum;
	}

	public int getMaxNumber() {
		int maxx = Integer.MIN_VALUE;
		for (int mark : marks) {
			if (mark > maxx) {
				maxx = mark;
			}
		}
		return maxx;
	}

	public int getMinValue() {
		int minn = Integer.MAX_VALUE;
		for (int mark : marks) {
			if (mark < minn) {
				minn = mark;
			}
		}
		return minn;
	}

	public BigDecimal getAvgMarks() {
		int sum = getSumOfMarks();
		int numb = getNumberOfMarks();
		return new BigDecimal(sum).divide(new BigDecimal(numb), 3, RoundingMode.UP);
	}

}
