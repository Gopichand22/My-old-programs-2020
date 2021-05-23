package mytrailprogram;

public class Example {
	private int number;
	private String name;

	public Example(int number, String name) {
		this.number = number;
		this.name = name;

		if (number > 500) {
			return number;
		} else {
			System.out.println("U are not CSE");
		}
	}

}
