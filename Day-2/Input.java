package com.mit;

import java.util.Scanner;
public class Input {
	public static void main(String[] args) {
		int counter = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int num = scan.nextInt();
		System.out.println("This is the multiplication tbale for: "+ num);
		while (counter<11) {
			System.out.println(num * counter);
			counter++;
		}
	}

}
