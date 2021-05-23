package sevenquestions;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println("Expected : 123786");
		String str = "12go32pi78786";
		String result = "";
		for (int i = 0; i < str.length(); i++) {// travelling one by one char
			boolean flag = true;
			if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {// checking for number
				for (int j = i; j < str.length() - 1; j++) {
					if (str.charAt(i) == str.charAt(j + 1)) {// 1==g //1==1
						flag = false;
						break;
					}
				}
				if (flag) {
					result += str.charAt(i);
				}
			} else {

			}
		}
		System.out.println("My Output : " + result);

	}

}
