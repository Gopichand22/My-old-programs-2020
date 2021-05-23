package com.mindtree.firstsetofprograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExtractCapitals17 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter name with you Initial:");
		String name = br.readLine();
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) >= 65 && name.charAt(i) <= 90) {
				System.out.print(name.charAt(i));
			}

		}
	}

}
