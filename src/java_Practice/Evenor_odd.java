package java_Practice;

import java.util.Scanner;

public class Evenor_odd {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number");
		n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println("number is Even");
		} else {
			System.out.println("Number is Odd");
		}
		sc.close();
	}

}
