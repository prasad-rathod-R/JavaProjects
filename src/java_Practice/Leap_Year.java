package java_Practice;

import java.util.*;

public class Leap_Year {
	public static void main(String[] args) {
		int Year;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year");
		Year = sc.nextInt();
		if (Year % 4 == 0) {
			if (Year % 100 == 0) {
				if (Year % 400 == 0) {
					System.out.println("Leap Year");
				} else {
					System.out.println("not leap Year");
				}
			} else {
				System.out.println("Its Leap Year");
			}
		} else {
			System.out.println("Not a Leap Year");
		}
	}

}
