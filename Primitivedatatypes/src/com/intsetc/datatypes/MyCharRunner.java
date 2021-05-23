package com.intsetc.datatypes;

public class MyCharRunner {

	public static void main(String[] args) {
		MyChar myChar = new MyChar('Z');
		System.out.println(myChar.isVowel());
		System.out.println(myChar.isConsonent());
		System.out.println(myChar.isNumber());
		System.out.println(myChar.isAlpha());

	}

}
