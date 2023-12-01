package com.test.two;

import java.util.Scanner;

public class Three {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		System.out.println("char to check no.of occurance");
		String rep = sc.nextLine();
		String replace = str.replace(rep, "");
		System.out.println("no of occurance : " + (str.length() - replace.length()));
		sc.close();
	}
}
