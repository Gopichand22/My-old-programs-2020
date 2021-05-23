package com.gopi.fanoppsconcepts;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan = new Fan("Manufacturer 1", 0.345, "green");
		fan.switchOn();
		fan.setSpeed((byte) 5);
		System.out.println(fan);
		fan.setSpeed((byte) 3);
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);
	}

}
