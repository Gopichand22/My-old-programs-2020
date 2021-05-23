package loopsexercise;

public class LoopsRunner {

	public static void main(String[] args) {
		MyNumber num = new MyNumber(5);
		boolean isPrime = num.isPrime();
		System.out.println("isPrime" + isPrime);
		int sum = num.sumOfN();
		System.out.println("sum of n numbers : " + sum);

		int div = num.sumOfDiv();
		System.out.println("sum of n numbers : " + div);
		num.printTriangle();
	}

}
