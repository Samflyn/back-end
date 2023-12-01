package com.test.three;

import java.util.Scanner;

public class One {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int i = num;
		int length = 0;
		while (i != 0) {
			length++;
			i = i / 10;
		}
		i = num;
		int sum = 0, no = 0;
		while (i != 0) {
			no = i % 10;
			sum = sum + power(no, length);
			i = i / 10;
		}
		if (num == sum)
			System.out.println(num + " is an Armstrong number");
		else
			System.out.println(num + " isn't an Armstrong number");
		sc.close();
	}

	static int power(int a, int b) {
		int p = 1;
		for (int c = 1; c <= b; c++) {
			p = p * a;
		}
		return p;
	}
}
