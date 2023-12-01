package com.test.three;

import java.util.Scanner;

public class Nine {
	static int fact = 1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		fact(num);
		sc.close();
		System.out.println("Factorial of given number : " + fact);
	}

	private static void fact(int num) {
		if (num != 1) {
			int i = num;
			fact = fact * i;
			fact(num - 1);
		}
	}
}