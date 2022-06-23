package java_Practice;

import java.util.*;

public class Day_Finder {
	public static void main(String[] args) {
		int Day;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A day Number");
		Day = sc.nextInt();
		if (Day == 1) {
			System.out.println("Its Monday");
		} else if (Day == 2) {
			System.out.println("Its Tuesday ");
		} else if (Day == 3) {
			System.out.println("Its wedensaday");
		} else if (Day == 4) {
			System.out.println("Its thursday ");
		} else if (Day == 5) {
			System.out.println("Its Friday ");
		} else if (Day == 6) {
			System.out.println("Its Saturdat ");
		} else if (Day == 7) {
			System.out.println("Its Sunday ");
		} else {
			System.out.println("Invalid Day");
		}
	}

}
