package arrayslist;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Student(String name, int... marks) {
		this.name = name;

		for (int mark : marks)
			this.marks.add(mark);
	}

	public int getNoOfMarks() {

		return marks.size();
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}

	public int getmax() {
		return Collections.max(marks);
	}

	public int getMin() {
		return Collections.min(marks);
	}

	public BigDecimal getAvgMarks() {
		int sum = getTotalSumOfMarks();
		int number = getNoOfMarks();
		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
	}

	@Override
	public String toString() {
		return name + marks;
	}

	public void addMark(int mark) {
		marks.add(mark);
	}

	public void removeMarksWithIndex(int index) {
		marks.remove(index);
	}

}
