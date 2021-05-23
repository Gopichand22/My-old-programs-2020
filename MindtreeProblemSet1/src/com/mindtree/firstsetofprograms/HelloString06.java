package com.mindtree.firstsetofprograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloString06 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Name: ");
		String name = br.readLine();
		addToString(name);
	}

	private static void addToString(String name) {
		System.out.println("Hello, " + name);
	}

}
