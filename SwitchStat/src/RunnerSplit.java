
public class RunnerSplit {
	public static void main(String args[]) {
		String[] a;
		String b = "Sanfoundary 1000 Java Programs";
		a = b.split(" ");
		for (String element : a) {
			System.out.println(element);
		}
		System.out.println("Using getChar() method:");
		char c[] = new char[115];
		b.getChars(0, 15, c, 4);
		for (int i = 0; i < 15; i++) {
			System.out.print(c[i]);
		}
	}
}
