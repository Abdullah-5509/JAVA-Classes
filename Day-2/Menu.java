package com.mit;

import java.util.Scanner;
public class Menu {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice;
		do {
		System.out.println("Menu: \n1.Addidtion\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
		
		choice = scan.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Addition selected");
			break;
		case 2:
			System.out.println("Subtraction selected");
			break;
		case 3:
			System.out.println("Multiplication selected");
			break;
		case 4:
			System.out.println("Division selected");
			break;
		case 5:
			System.out.println("Exiting...");
			break;
		default:
			System.out.println("Invalid option");
		
		}
		} while(choice!=5);
	}

}
