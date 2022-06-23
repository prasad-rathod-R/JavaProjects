package com.prasad.java.programs;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		String original, reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string or number to check the palindrome or not");
		original = sc.nextLine();
		int length = original.length();
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);
		if (original.equals(reverse)) {
			System.out.println("this is palindrome");
		} else {
			System.out.println("this is not palindrome ");
		}

	}
}