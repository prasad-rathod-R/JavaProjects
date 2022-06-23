package com.prasad.java.programs;

import java.util.Date;
import java.util.Scanner;

public class javaWellcome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name");
		String name = sc.next();
		System.out.println("Hi " + name);
		Date now = new Date();
		System.out.println("current time is" + now);
		sc.close();
	}
}
