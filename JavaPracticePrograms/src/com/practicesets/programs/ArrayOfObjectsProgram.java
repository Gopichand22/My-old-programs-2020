package com.practicesets.programs;

public class ArrayOfObjectsProgram {

	public static void main(String[] args) {
		car[] cr;
		cr = new car[10];
		cr[0] = new car(200, 6);
		cr[1] = new car(400, 4);
		cr[2] = new car(500, 5);
		cr[3] = new car(100, 3);
		cr[4] = new car(800, 6);
		System.out.println("Details");
		cr[0].showData();
		cr[1].showData();
		cr[2].showData();
		cr[3].showData();
		cr[4].showData();

	}

}
