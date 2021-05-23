package allconcepts;

import com.mindtreefirstset.validations.AllValidationChecks;

public class LargestWordAndSmallestWord {

	public static void main(String[] args) {
		// enter a sentance
		System.out.println("Enter a sentance");
		String sentance = AllValidationChecks.stringLineCheck();
		// store all words in the array
		String[] words = AllValidationChecks.splittingMethod(sentance, ' ');
		// find min and max at once
		int min = words[0].length();
		int max = words[0].length();
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() < min) {
				min = i;
			}
			if (words[i].length() > max) {
				max = i;
			}
		}

		System.out.println("Largest word: " + words[max] + ":" + words[max].length());
		System.out.println("Largest word: " + words[min] + ":" + words[min].length());
	}

}