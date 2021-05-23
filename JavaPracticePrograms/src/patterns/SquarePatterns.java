package patterns;

public class SquarePatterns {
//=================================================================
	void alphaSquarePattern(int n) {

//printing ABCDE pattern i.e:Square
		for (int i = 1; i <= n; i++) {
			for (int j = 65; j < 65 + n; j++) {
				char alpha = (char) j;
				System.out.print(alpha);
			}
			System.out.println();
		}
	}

//=================================================================
	void numericSquarePattern(int n) {

//printing 12345 pattern i.e:Square
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();

//printing 11111 pattern i.e:Square
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println();

//printing 54321 pattern i.e:Square
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > 0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();

//printing 55555 pattern i.e:Square
		for (int i = n; i > 0; i--) {
			for (int j = 1; j <= n; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

//printing 
	}

//===========================================================
	void symbolsSquarePattern(int n) {
//printing * pattern i.e:Square
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

//printing # pattern i.e:Square
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();

//printing $ pattern i.e:Square
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("$");
			}
			System.out.println();
		}
	}

}
