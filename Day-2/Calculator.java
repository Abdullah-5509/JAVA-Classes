package com.mit;

import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		int choice, input1, input2;
		System.out.println("Input 1st number: ");
		Scanner scan1 = new Scanner(System.in);
		input1 = scan1.nextInt();
		System.out.println("Input 2nd numeber: ");
		Scanner scan2 = new Scanner(System.in);
		input2 = scan2.nextInt();
		Scanner scan3 = new Scanner(System.in);
		
	
		
		do {
			System.out.println("Menu: \n1.Addidtion\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
			
			choice = scan3.nextInt();
			switch(choice) {
			case 1:
				System.out.println((input1+input2));
				break;
			case 2:
				System.out.println((input1-input2));
				break;
			case 3:
				System.out.println((input1*input2));
				break;
			case 4:
				System.out.println((input1/input2));
				break;
			case 5:
				System.out.println("Exiting.....");
				break;
			default:
				System.out.println("Invalid option");
				break;
			}

		} while (choice !=5);
				
	}

}
