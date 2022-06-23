package com.prasad.java.programs;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String args[]) {
		Scanner prasad = new Scanner(System.in);
		System.out.print("Enter number:");
		int n = prasad.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + n * i);
		}
		prasad.close();
	};
}
