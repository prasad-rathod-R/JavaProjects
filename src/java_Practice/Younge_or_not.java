package java_Practice;

import java.util.Scanner;

public class Younge_or_not {
	public static void main(String[] args) {
		int age;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Age");
		age = s.nextInt();
		if (age >= 14 && age <= 55) {
			System.out.println("Yo are Younge");

		} else {
			System.out.println("You are not younge");
		}
	}
}
