package com.gopi.firstjava;

public class Multiplication {
	void print() {
		print(5);

	}
	
	void print(int table) {
		print(table, 1, 3);
	}
	void print(int table,int  from,int to) {
		for( int i=from;i<=to;i++) {
			System.out.printf("%d * %d = %d",table,i,table*i).println();
			}
	}
}