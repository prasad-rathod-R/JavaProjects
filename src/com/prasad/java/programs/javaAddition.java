package com.prasad.java.programs;

import java.util.Scanner;

public class javaAddition {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of A ");
		int a = sc.nextInt();
		System.out.println("Enter value of B");
		int b = sc.nextInt();
		int result = a + b;
		int result2 = a * b;
		int result3 = a / b;
		int result4 = a - b;
		System.out.println("Sum is " + result);
		System.out.println("Multiplication is " + result2);
		System.out.println("Division is " + result3);
		System.out.println("Substraction is " + result4);
		sc.close();
	}
}
