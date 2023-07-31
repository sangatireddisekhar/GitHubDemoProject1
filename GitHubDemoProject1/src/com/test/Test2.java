package com.test;

public class Test2 {

	public static void main(String[] args) {
		
		String eligible="yes";
		
		if (eligible=="yes" || eligible=="y") {
			System.out.println("Eligible1");
			System.out.println("Eligible2");
			System.out.println("Eligible6");
		}
		else {
			System.out.println("Not Eligible");
		}
	}
}
