
public class StrRunner {

	public static void main(String[] args) {

		String[] dayOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		String daywithMostChar = " ";
		for (String day : dayOfWeek) {
			if (day.length() > daywithMostChar.length()) {
				daywithMostChar = day;
			}
		}
		System.out.println(daywithMostChar);
	}

}
