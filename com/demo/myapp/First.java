package com.demo.myapp;

public class First {
	
	public static void main(String[] args) {
		sum(34, 55);

		System.out.println("Argments passed:" + args.length);
		System.out.println("Hello World");
	}

	/**
	 * Sums two numbers
	 * @param a The first number
	 * @param b The Second number
	 * @return int The sum of a and b
	 */
	public static int sum(int a, int b) {
		return a + b;
	}
}