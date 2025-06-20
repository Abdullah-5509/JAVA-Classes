package com.mit;

class Class{
	public int method() {
		System.out.println("Factorial called");
		return 0;
	}
}
public class Factorial {
	
	public static void main(String[] args) {
		Class cl = new Class();
		int res = cl.method();
		System.out.println(res);
		
	}
}
