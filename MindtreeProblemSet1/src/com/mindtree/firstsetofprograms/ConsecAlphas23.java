package com.mindtree.firstsetofprograms;

import java.util.Scanner;

public class ConsecAlphas23 {
		public static void main(String[] args) {
			String ourString;
			String y = "";
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the String:");
			ourString = sc.nextLine();
			for (int i = 0; i < ourString.length(); i++) {
				int ch = ourString.charAt(i);
				if(ch>=97&&ch<=122) {
					ch=ch-32;
					y=y+(char)ch;
				}
				else {
					y=y+(char)ch;
				}		
			}
					printConsecutiveChars(y);
					sc.close();
		}
		static void printConsecutiveChars(String a) {
			int i, f, j = 65, c;
			char x='0';
			char y='0';
			while(j<=90) {
				c=f=0;
				for(i=1;i<a.length();i++) {
					if((a.charAt(i-1)==(char)(j))&&(a.charAt(i)==(char)(j+1))) {
						x=a.charAt(i-1);
						y=a.charAt(i);
						c++;
						f++;
					}
				}
				if(f>0) {
					System.out.print(x);
					System.out.println(y+": "+c);
				}
				j++;
			}
			
		}
	}

