package com.test.two;

import java.util.Scanner;

public class Two {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		System.out.println("Enter a char");
		char ch = sc.nextLine().charAt(0);
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == ch) {
				sb.deleteCharAt(i);
			}
		}
		System.out.println(sb.toString());
		sc.close();
	}
}
