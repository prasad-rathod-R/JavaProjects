package java_Practice;

import java.util.function.Predicate;

public class Even_or_odd {
	public static void main(String[] args) {
		Predicate<Integer> p = i -> i % 2 == 0;
		System.out.println(p.test(4));
	}
}
