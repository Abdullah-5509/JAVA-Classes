package com.mit;

import java.util.Scanner;
public class ATM {
	public static void main (String [] args) {
		int choice1, choice2, choice3, balence = 5000, pin =5509, check_pin;
		
		System.out.println("Hello welcom to THE BANK");
		System.out.println("Enter your pin: ");
		Scanner scan1 = new Scanner(System.in);
		check_pin = scan1.nextInt();
		
		if(check_pin == pin) {
			do {
				System.out.println("Main menu:\n1.Check Balence\n2.Withdraw Cash\n3.Deposit Cash\n4.Exit");
				
				Scanner scan2 = new Scanner(System.in);
				choice1= scan2.nextInt();
				switch(choice1) {
				case 1:
					System.out.println("Your Balence is: $"+balence);
				break;
				case 2:
					System.out.println("Ammout to withdraw:\n1.$10\n2.$20\n3.$50\n4.$100");
					Scanner scan3 = new Scanner(System.in);
					choice2 = scan3.nextInt();
					switch(choice2) {
					case 1:
						balence = (balence - 10);
						System.out.println("Current balence is: $"+ balence);
						break;
					case 2:
						balence = (balence - 20);
						System.out.println("Current balence is: $"+ balence);
						break;
					case 3:
						balence = (balence - 50);
						System.out.println("Current balence is: $"+ balence);
						break;
					case 4:
						balence = (balence - 100);
						System.out.println("Current balence is: $"+ balence);
						break;
					default:
						System.out.println("Invalid Input");
						break;
					}
				break;
				case 3:
					System.out.println("Ammout to Deposit:\n1.$10\n2.$20\n3.$50\n4.$100");
					Scanner scan4 = new Scanner(System.in);
					choice3 = scan4.nextInt();
					switch(choice3) {
					case 1:
						balence = (balence + 10);
						System.out.println("Current balence is: $"+ balence);
						break;
					case 2:
						balence = (balence + 20);
						System.out.println("Current balence is: $"+ balence);
						break;
					case 3:
						balence = (balence + 50);
						System.out.println("Current balence is: $"+ balence);
						break;
					case 4:
						balence = (balence + 100);
						System.out.println("Current balence is: $"+ balence);
						break;
					default:
						System.out.println("Invalid Input");
						break;
					}
				break;
				case 4:
					System.out.println("Exiting.....");
				break;
				default:
					System.out.println("Invalid Response");
				break;
				}
			} while (choice1 != 4);
		} else {
			System.out.println("Invalid pin");
		}
		
	}

}
