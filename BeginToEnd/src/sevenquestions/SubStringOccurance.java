package sevenquestions;

import com.mindtreefirstset.validations.AllValidationChecks;

public class SubStringOccurance {

	public static void main(String[] args) {
		System.out.println("Enter String/Sentance:");
		String string = AllValidationChecks.stringLineCheck();
		String[] words = AllValidationChecks.splittingMethod(string, ' ');
		System.out.println("Enter a word to check whether \n it is presnt in the given String or not");
		String subString = AllValidationChecks.stringCheck();
		int count = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].indexOf(subString) != -1) {
				count++;
			}
		}
		System.out.println("The " + subString + " is present \n and repeated: " + count + " Times");
	}

}
