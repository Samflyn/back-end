package com.test.two;

import java.util.Arrays;
import java.util.Scanner;

public class One {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String first = sc.nextLine();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter another String");
		String second = sc1.nextLine();
		char[] ch = first.toCharArray();
		char[] ch1 = second.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		StringBuffer sb = new StringBuffer().append(ch);
		StringBuffer sb1 = new StringBuffer().append(ch1);
		if (sb.toString().equals(sb1.toString())) {
			System.out.println("Strings are anagram");
		} else {
			System.out.println("Strings are not anagram");
		}
		sc.close();
		sc1.close();
	}
}
