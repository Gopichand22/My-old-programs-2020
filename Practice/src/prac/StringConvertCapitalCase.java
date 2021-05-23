package prac;

public class StringConvertCapitalCase {

	public static void main(String[] args) {
		String name = "gopichand reddy pulagam";
		String result = "";
		for (int i = 0; i < name.length(); i++) {
			if (i % 2 != 0) {

				if (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') {
					result = result + name.charAt(i);
				} else {
					result = result + (char) (name.charAt(i) - 32);
				}
			} else {
				result = result + name.charAt(i);
			}
		}
		System.out.print(result);
	}

}
