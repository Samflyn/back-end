package com.test.one;

import java.util.Scanner;

public class Six {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		sb.reverse();
		if (str.equals(sb.toString())) {
			System.out.println("String is palindrom");
		} else {
			System.out.println("String is not a palindrom");
		}
		sc.close();
	}
}