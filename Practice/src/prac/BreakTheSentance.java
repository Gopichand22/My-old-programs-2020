package prac;

public class BreakTheSentance {

	public static void main(String[] args) {
		WordByWord wordsConverter = new WordByWord();
		String str = "i am from andhrapradesh india";
		int noOfWords = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				noOfWords++;
				System.out.println("indexes of spaces:" + i);
			}
		}
		System.out.println("Total number of spaces:" + noOfWords);
		System.out.println("Total number of chars:" + str.length());

		String[] str1 = new String[noOfWords + 1];
		String temp = "";
		int j = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				temp = temp + str.charAt(i);
				str1[j] = temp;
			} else {
				j++;
				temp = "";
			}
		}
		System.out.println("Making string into caps start & end");
		for (String element : str1) {
			wordsConverter.capsWord(element);
		}
	}

}
