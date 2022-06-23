package java_Practice;

import java.util.*;

public class Upper_case_to_Lower_case {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Alphabet");
		String str = sc.nextLine();
		System.out.println("Lower Case Alphabet is : " + str.toLowerCase());
		System.out.println("Upper case Alphabet is : " + str.toUpperCase());
		sc.close();
	}
}
