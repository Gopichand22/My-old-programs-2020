package loopsexercise;

public class MyWhilee {

	private int limit;

	public MyWhilee(int limit) {
		this.limit = limit;
	}

	public void isSquare() {
		int i=1;
		while (i * i < limit) {
			System.out.print(i * i + " ");
			i++;
		}
	}

}
