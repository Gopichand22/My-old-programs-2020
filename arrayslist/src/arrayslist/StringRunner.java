package arrayslist;

public class StringRunner {

	public static void main(String[] args) {
		String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "thursday", "Friday", "Saturday" };
		String dayWithMostChars = "";
		for (String day : daysOfWeek) {
			if (day.length() > dayWithMostChars.length()) {
				dayWithMostChars = day;
	}
}
System.out.println("Day with most nu of chars : " + dayWithMostChars);
for (int i = daysOfWeek.length - 1; i >= 0; i--) {
	System.out.println(daysOfWeek[i]);
}
}

}
