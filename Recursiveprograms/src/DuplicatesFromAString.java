import java.util.Scanner;

public class DuplicatesFromAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String str = sc.nextLine();
		sc.close();
		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		String[] words = new String[count];

		int j = 0;
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				temp = temp + str.charAt(i);
				words[j] = temp;
			} else {
				j++;
				temp = "";
			}
		}

//		for (String word : words) {
//			System.out.print(word);
//		}

		// String[] sortedWords = sortMe(words);
		String[] sortingInsertion = sortMe2(words);



		for (int i = 0; i < sortingInsertion.length; i++) {
			System.out.println(words[i]);
		}

	}

	private static String[] sortMe2(String[] words) {
		for(int i=1;i<words.length;i++) {
			String key=words[i];
			int j=i-1;
			while (j >= 0 && words[j].compareTo(key) > 0) {
				words[j+1]=words[j];
				j--;
			}
			words[j + 1] = key;
		}
		
		return words;
	}

//	private static String[] sortMe(String[] words) {
//		for (int i = 0; i < words.length; i++) {
//			for (int j = 0; j < words.length - i - 1; j++) {
//				if (words[j].compareTo(words[j + 1]) > 0) {
//					String temp = words[j];
//					words[j] = words[j + 1];
//					words[j + 1] = temp;
//				}
//			}
//
//		}
//		return words;
//	}
}
