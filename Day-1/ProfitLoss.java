package com.mit;

public class ProfitLoss {

	public static void main(String[] args) {
		float sellprice = 234, costprice = 256;
		float loss = (costprice - sellprice);
		float profit = (sellprice - costprice);
		System.out.println("Given cost price is: "+costprice);
		System.out.println("Given selling price is: "+sellprice);
		if (sellprice > costprice) {
			System.out.println("The profit is: "+ profit);
			} else if (sellprice == costprice) {
				System.out.println("No profit no loss");
				} else {
					System.out.println("The loss is: "+ loss);
					}
		}
	}

