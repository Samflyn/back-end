package com.test.one;

import java.util.Scanner;

public class Ten {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int num = Integer.parseInt(str);
		int sum = 0;
		while (num != 0) {
			int j = num % 10;
			sum = sum + j;
			num = num / 10;
		}
		sc.close();
		System.out.println(sum);
	}
}
