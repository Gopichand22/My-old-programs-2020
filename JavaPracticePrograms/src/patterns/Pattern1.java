package patterns;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		SquarePatterns sqPatterns = new SquarePatterns();
		TrianglePatterns triPatterns = new TrianglePatterns();
		PyramidPatterns pyrPatterns = new PyramidPatterns();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size/height that you wanna print:");
		int n = sc.nextInt();
		boolean flag = false;
		do {
			System.out.println("1.square\n2.triangles\n3.pyramids\n4.Reboot\n5.exit");
			System.out.println("Enter the option:");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				do {
					System.out.println("which type of Square:");
					System.out.println("1.with symbols\n2.with numbers\n3.with alphas\n4.Reboot\n5.exit");
					int ch1 = sc.nextInt();
					switch (ch1) {
					case 1:
						sqPatterns.symbolsSquarePattern(n);
						break;
					case 2:
						sqPatterns.numericSquarePattern(n);
						break;
					case 3:
						sqPatterns.alphaSquarePattern(n);
						break;
					case 4:
						System.out.println("Exiting and rebooting \n\n");
						flag = true;
						break;
					case 5:
						System.out.println("\nExiting good bye.... ");
						return;
					default:
						System.out.println("Enter correct input");
						break;
					}
				} while (flag);
				break;
			case 2:
				do {
				System.out.println("which type of triangle:");
				System.out.println("1.with symbols\n2.with numbers\n3.with alphas\n4.Reboot	\n5.exit");
				int ch11 = sc.nextInt();
				switch (ch11) {
				case 1:
					triPatterns.symbolsTrianglePattern(n);
					break;
				case 2:
					triPatterns.numericTrianglePattern(n);
					break;
				case 3:
					triPatterns.alphaTrianglePattern(n);
					break;
				case 4:
					System.out.println("Exiting and rebooting \n");
					flag = true;
					break;
				case 5:
					System.out.println("\nExiting good bye.... ");
					return;
				default:
					System.out.println("Enter correct input");
					break;
				}
			} while (flag);
				break;
			case 3:
				do {
					System.out.println("which type of pyramid:");
					System.out.println("1.with symbols\n2.with numbers\n3.with alphas\n4.Reboot	\n5.exit");
					int ch11 = sc.nextInt();
					switch (ch11) {
					case 1:
						pyrPatterns.symbolsPyramidPattern(n);
						break;
					case 2:
						pyrPatterns.numericPyramidPattern(n);
						break;
					case 3:
						pyrPatterns.alphaPyramidPattern(n);
						break;
					case 4:
						System.out.println("Exiting and rebooting \n");
						flag = true;
						break;
					case 5:
						System.out.println("\nExiting good bye.... ");
						return;
					default:
						System.out.println("Enter correct input");
						break;
					}
				} while (flag);
				break;
			case 4:
				System.out.println("Exiting and rebooting \n");
				flag = true;
				break;
			case 5:
				System.out.println("\nExiting good bye.... ");
				flag = false;
				break;
			default:
				System.out.println("Please choose the correct option");
				System.out.println("You can choose numbers between 1-3.");
				break;
			}
		} while (flag);
	}

}
