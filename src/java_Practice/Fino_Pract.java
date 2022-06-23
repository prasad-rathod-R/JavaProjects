package java_Practice;

import java.util.Scanner;

public class Fino_Pract {
	public static void main(String[] args) {
		int s, a = 0, b = 0, c = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		s = sc.nextInt();
		System.out.println("Fibonacci series is ");
		for (int i = 1; i <= s; i++)
			;
		{
			a = b;
			b = c;
			c = a + b;
			System.out.println(a + "");
		}
		sc.close();

	}
}
