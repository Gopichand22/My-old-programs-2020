import java.util.Scanner;

public class TrailCh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int[] count = new int[256];
		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);
			count[ch] += 1;
		}

		int maxcount = -1;
		char longest = 0;
		for (char ch : a.toCharArray()) {
			if (count[ch] > maxcount) {
				maxcount = count[ch];
				longest = ch;
			}

		}
		System.out.println(longest);
		System.out.println(maxcount);

	}
}
