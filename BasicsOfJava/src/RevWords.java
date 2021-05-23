import com.mindtreefirstset.validations.AllValidationChecks;

public class RevWords {

	public static void main(String[] args) {
		String string = "suraj Mishal how are you";

		String[] words = AllValidationChecks.splittingMethod(string, ' ');// gopi.... how .... are ... you
		String[] reverse = reverseWords(words, words.length);// ipog..... woh...... era..... uoy.....

		System.out.println("Print the text here");

		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i] + " | " + reverse[i] + " ");
		}

	}

//method to reverse string/word.
	private static String[] reverseWords(String[] words, int length) {
		String temp = "";
		String[] rev = new String[length];
		for (int i = 0; i < length; i++) {
			for (int j = words[i].length() - 1; j >= 0; j--) {
				temp += words[i].charAt(j);
				rev[i] = temp;
			}
			temp = "";
		}
		return rev;
	}

}
