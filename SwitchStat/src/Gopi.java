import com.mindtreefirstset.validations.AllValidationChecks;

public class Gopi {

	public static void main(String[] args) {
		String str;
		str = AllValidationChecks.stringCheck();
		System.out.println(str);
		int number = AllValidationChecks.integerCheck();
		System.err.println(number);

	}

}
