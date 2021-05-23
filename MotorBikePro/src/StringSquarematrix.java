import java.util.Scanner;

public class StringSquarematrix {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		char[][] chararr = null;
		do {
			menu();
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Dimesions of the matrix");
				String dim = Getdiminons(chararr);
				System.out.println(dim);
				System.out.println();
				break;
			case 2:
				System.out.println("Enter the matrix");
				chararr = loadmatrix();
				print(chararr);
				System.out.println();
				break;
			case 3:
				System.out.println("Get a String");
				boolean flag;
				flag = stringinput(chararr);
				if (flag == false) {
					System.out.println("The string not present");
				} else {
					System.out.println("The string is present");
				}
				break;
			case 4:
				System.out.println("4.Exit");
				return;
			default:
				System.out.println("Enter the correct value");

			}
		} while (true);
	}

	private static boolean stringinput(char[][] chararr) {
		// TODO Auto-generated method stub
		boolean flag = false;

		System.out.println("Enter the string to be searched");
		String str = sc.nextLine();
		int rows = chararr.length;
		int col = chararr[0].length;
		String dim1 = "", dim2 = "", dim3 = "", dim4 = "";
		int tempvalue = 0, tempvalue1 = 0;
		int k = 0;
		String[] check = new String[2 * rows * col + 1];
		if (chararr[0][0] == '\0') {
			System.out.println("The char array is empty please fill the matrix");
			return false;
		} else {
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < col; j++) {
					if (i == j) {
						dim1 = dim1 + chararr[i][j];
					}
				}
			}
			check[k++] = dim1;
			while (tempvalue < chararr.length) {
				for (int j = col - 1; j >= 0; j--) {
					dim2 = dim2 + chararr[tempvalue][j];
					tempvalue++;
				}
			}
			check[k++] = dim2;
			for (int i = rows - 1; i >= 0; i--) {
				for (int j = col - 1; j >= 0; j--) {
					if (i == j) {
						dim3 = dim3 + chararr[i][j];
					}
				}
			}
			check[k++] = dim3;
			while (tempvalue1 < chararr.length) {
				for (int j = col - 1; j >= 0; j--) {
					dim4 = dim4 + chararr[j][tempvalue1];
					tempvalue1++;
				}
			}
			check[k++] = dim4;

		}
		String temprow = "";
		for (int i = 0; i < rows; i++) {
			temprow = "";
			for (int j = 0; j < col; j++) {
				temprow = temprow + chararr[i][j];
			}
			check[k++] = temprow;
		}
		String temprow2 = "";
		for (int i = rows - 1; i >= 0; i--) {
			temprow2 = "";
			for (int j = col - 1; j >= 0; j--) {
				temprow2 = temprow2 + chararr[i][j];
			}
			check[k++] = temprow2;
		}
		String tempcol = "";
		for (int i = 0; i < col; i++) {
			tempcol = "";
			for (int j = 0; j < rows; j++) {
				tempcol = tempcol + chararr[j][i];
			}
			check[k++] = tempcol;
		}
		String tempcol2 = "";
		for (int i = col - 1; i >= 0; i--) {
			tempcol2 = "";
			for (int j = rows - 1; j >= 0; j--) {
				tempcol2 = tempcol2 + chararr[j][i];
			}
			check[k++] = tempcol2;
		}
		for (int i = 0; i < k; i++) {
			if (check[i].equals(str)) {
				flag = true;
			}
		}
		return flag;

	}

	private static void print(char[][] chararr) {
		// TODO Auto-generated method stub
		int rows = chararr.length;
		int col = chararr[0].length;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(chararr[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static char[][] loadmatrix() {
		System.out.println("Enter the no of rows");
		int rows = sc.nextInt();
		System.out.println("Enter the cols of matrix");
		int col = sc.nextInt();
		System.out.println("Enter the character matrix");
		char[][] chararr = new char[rows][col];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				chararr[i][j] = sc.next().charAt(0);
			}
		}
		return chararr;
	}

	private static String Getdiminons(char[][] chararr) {
		int rows = chararr.length;
		int col = chararr[0].length;
		String dim1 = "", dim2 = "", dim3 = "", dim4 = "", rest = "";
		int tempvalue = 0, tempvalue1 = 0;
		if (chararr[0][0] == '\0') {
			System.out.println("The char array is empty please fill the matrix");
			return null;
		} else {
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < col; j++) {
					if (i == j) {
						dim1 = dim1 + chararr[i][j];
					}
				}
			}
			while (tempvalue < chararr.length) {
				for (int j = col - 1; j >= 0; j--) {
					dim2 = dim2 + chararr[tempvalue][j];
					tempvalue++;
				}
			}
			for (int i = rows - 1; i >= 0; i--) {
				for (int j = col - 1; j >= 0; j--) {
					if (i == j) {
						dim3 = dim3 + chararr[i][j];
					}
				}
			}
			while (tempvalue1 < chararr.length) {
				for (int j = col - 1; j >= 0; j--) {
					dim4 = dim4 + chararr[j][tempvalue1];
					tempvalue1++;
				}
			}

		}

		rest = "The dimesions" + " " + dim1 + " " + dim2 + " " + dim3 + " " + dim4;
		return rest;

	}

	private static void menu() {
		// TODO Auto-generated method stub
		System.out.println(".........MENU......");
		System.out.println("Enter the choice");
		System.out.println("1.Get the deminsions of the matrix");
		System.out.println("2.Fill the Matrix");
		System.out.println("3.Get a string");
		System.out.println("4.Exit");
	}

	}


