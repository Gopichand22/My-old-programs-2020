package sevenquestions;

import java.util.Scanner;

import com.mindtreefirstset.validations.AllValidationChecks;

public class ReplaceNextConsonent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String sentance = AllValidationChecks.stringLineCheck();
		String result = replaceConsonentAfterVowel(sentance);
		System.out.println(result);
	}

	private static String replaceConsonentAfterVowel(String sentance) {
		String str = "";
		for (int i = 0; i < sentance.length() - 1; i++) {
			if (sentance.charAt(i) == 'a' || sentance.charAt(i) == 'e' || sentance.charAt(i) == 'i'
					|| sentance.charAt(i) == 'o' || sentance.charAt(i) == 'u' || sentance.charAt(i) == 'A'
					|| sentance.charAt(i) == 'E' || sentance.charAt(i) == 'I' || sentance.charAt(i) == 'O'
					|| sentance.charAt(i) == 'U') {
				if ((sentance.charAt(i + 1) != 'a' || sentance.charAt(i + 1) != 'e' || sentance.charAt(i + 1) != 'i'
						|| sentance.charAt(i + 1) != 'o' || sentance.charAt(i + 1) != 'u'
						|| sentance.charAt(i + 1) != 'A' || sentance.charAt(i + 1) != 'E'
						|| sentance.charAt(i + 1) != 'I' || sentance.charAt(i + 1) != 'O'
						|| sentance.charAt(i + 1) != 'U') && (sentance.charAt(i + 1) != ' ')) {
					str = str + sentance.charAt(i);// a o
					char ch = sentance.charAt(i + 1);// m+1 n d+1 e
					str = str + (char) (ch + 1);// n e
					i++;
				} else {
					str = str + sentance.charAt(i);
				}
			} else {
				str = str + sentance.charAt(i);
			}
		}
		return str;
	}
}
