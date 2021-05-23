package prac;

public class WordByWord {

	public void capsWord(String string) {
		String str = "";
		for (int i = 0; i < string.length(); i++) {
			if (i == 0 || i == string.length() - 1) {
				if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') {
					str += string.charAt(i);
				} else {
					str += (char) (string.charAt(i) - 32);
				}
			} else {
				str += string.charAt(i);
			}
		}
		System.out.print(str + " ");
	}

}
