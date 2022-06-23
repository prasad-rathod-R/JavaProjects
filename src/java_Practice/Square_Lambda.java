package java_Practice;

import java.util.Scanner;
import java.util.function.*;

public class Square_Lambda {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int a = sc.nextInt();
		Function<Integer, Integer> f = i -> i * i;
		System.out.println("Square of " + a + " is " + f.apply(a));
		sc.close();
	}
}
