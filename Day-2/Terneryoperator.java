package com.mit;

public class Terneryoperator {
	public static void main(String[] ergs) {
	int num =13,res;
	/*
	if (num % 2 ==0) {
		res = 0;
	} else {
		res =1;
	}
	System.out.println(res);
	*/
	res = num % 2 == 0? 0:1;
	System.out.println(res);
	}
}