package com.gopi.oopsintro;

public class MotarBikeRunner {

	public static void main(String[] args) {
		MotarBike ducati = new MotarBike();
		MotarBike honda = new MotarBike();

		ducati.start();
		honda.start();

		ducati.setSpeed(100);

		ducati.increaseSpeed(100);
		honda.increaseSpeed(100);

		ducati.decreaseSpeed(50);
		honda.decreaseSpeed(20);

		System.out.println(ducati.getSpeed());


		System.out.println(honda.getSpeed());
	}

}
