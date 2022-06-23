package com.prasad.java.programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindingWordFromFile {
	public static void main(String args[]) throws FileNotFoundException {
		// Reading the word to be found from the user
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = sc1.next();
		boolean flag = false;
		int count = 0;
		// Reading the contents of the file
		Scanner sc2 = new Scanner(new FileInputStream("input.txt"));
		while (sc2.hasNextLine()) {
			String line = sc2.nextLine();
			if (line.indexOf(word) != -1) {
				flag = true;
			}
		}
		if (flag) {
			System.out.println(word + " found");

		} else {
			System.out.println(word + " not found, NO alternatives found too");
		}
	}
}