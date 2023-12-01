package com.test.two;

import java.util.Scanner;

public class Eight {
	static int num;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int i = sc.nextInt();
		adding(i);
		System.out.println(num);
		sc.close();
	}

	public static void adding(int j) {
		if (j != 0) {
			int i = j % 10;
			num = num + i;
			j = j / 10;
			adding(j);
		}
	}
}
