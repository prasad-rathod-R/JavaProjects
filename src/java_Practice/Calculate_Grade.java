package java_Practice;

import java.util.*;

public class Calculate_Grade {
	public static void main(String[] args) {
		int m1, m2, m3, Total, Average;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of m1");
		m1 = sc.nextInt();
		System.out.println("Enter marks of m2");
		m2 = sc.nextInt();
		System.out.println("Enter marks of m3");
		m3 = sc.nextInt();
		Total = m1 + m2 + m3;
		System.out.println("Your Total Marks is " + Total);
		Average = Total / 3;
		System.out.println("Your Average is " + Average);

		if (Average >= 70) {
			System.out.println("Grade A");
		} else if (Average >= 60 && Average <= 70) {
			System.out.println("Grade B");
		} else if (Average >= 50 && Average <= 60) {
			System.out.println("Grade C");
		} else if (Average >= 40 && Average <= 50) {
			System.out.println("Grade B");
		} else {
			System.out.println("Fail");
		}
		sc.close();
	}
}
