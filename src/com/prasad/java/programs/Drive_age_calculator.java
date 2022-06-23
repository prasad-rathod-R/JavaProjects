package com.prasad.java.programs;

import java.util.Scanner;

public class Drive_age_calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name");
		String name = sc.next();
		System.out.println(name + " enter your age ");
		int age = sc.nextInt();
		if (age >= 18) {
			System.out.println("Hi " + name + " you are eligible for driving");
		} else {
			System.out.println("Hi " + name + "Hi You are child come later ");
		}
		sc.close();
	}
}
