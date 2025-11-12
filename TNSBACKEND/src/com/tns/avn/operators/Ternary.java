package com.tns.avn.operators;

public class Ternary {

	public static void main(String[] args) {
		
		
		int a = 50;
		int b = 80;
		
		
		
		System.out.println("Value of a: "+a);
		System.out.println("Value of a: "+b+"\n");
		
		int max= (a>b)?a:b;
		System.out.println("Max: "+max+"\n");
		
		int min= (a<b)?a:b;
		System.out.println("Min: "+min);
	}

}
