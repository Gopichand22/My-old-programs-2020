
public class BiNumbersRunner {

	public static void main(String[] args) {
		BiNimbers numbers = new BiNimbers(2, 4);
		System.out.println(numbers.add());
		System.out.println(numbers.multi());
		numbers.doubleVal();
		System.out.println(numbers.getNumber1());
		System.out.println(numbers.getNumber2());
	}

}
