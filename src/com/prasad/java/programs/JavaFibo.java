package com.prasad.java.programs;

import java.util.Scanner;

public class JavaFibo {
	public static void main(String args[]) {
		int s, a = 0, b = 0, c = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		s = sc.nextInt();
		System.out.print("fibonacci series is  :");
		for (int i = 1; i <= s; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.print(a + " ");
		}
	}
}
