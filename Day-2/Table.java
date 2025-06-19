package com.mit;

public class Table {
	public static void main(String[] args) {
		int table_of = 71, counter = 1;
		System.out.println("This is the table of: "+ table_of);
		while (counter <11) {
			System.out.println(table_of * counter);
			counter ++;
		}
	}

}