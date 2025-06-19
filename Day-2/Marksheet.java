package com.mit;

import java.util.Scanner;
public class Marksheet {
	public static void main (String[] args) {
		
		int english, physics, chemistry, mathematics, biology, hindi, total_score;
		float percent_score;
		System.out.println("Enter grades: ");
		System.out.println("Enter marks for English");
		Scanner scan1 = new Scanner(System.in);
		english = scan1.nextInt();
		System.out.println("Enter marks for Physics");
		Scanner scan2 = new Scanner(System.in);
		physics = scan2.nextInt();
		System.out.println("Enter marks for Chemistry");
		Scanner scan3 = new Scanner(System.in);
		chemistry = scan3.nextInt();
		System.out.println("Enter marks for Mathematics");
		Scanner scan4 = new Scanner(System.in);
		mathematics = scan4.nextInt();
		System.out.println("Enter marks for Biology");
		Scanner scan5 = new Scanner(System.in);
		biology = scan5.nextInt();
		System.out.println("Enter marks for Hindi");
		Scanner scan6 = new Scanner(System.in);
		hindi = scan6.nextInt();
		
		total_score =(english+physics+chemistry+mathematics+biology+hindi);
		percent_score = ((total_score/600)*100);
		System.out.println("Your total score is: "+(total_score));
		System.out.println("Your score in percentage is: "+percent_score+"%");
		
		
	}

}
