package com.mit;

public class Starpattern {
	public static void main (String[] args) {
		int limit =5;
		for (int row = 1; row <= limit; row++)
		{
			for (int col =1; col <= row; col++) {
				System.out.print("*");
				}
			System.out.print("\n");
		}
		
	}

}
