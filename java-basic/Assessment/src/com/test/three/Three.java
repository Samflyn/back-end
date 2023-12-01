package com.test.three;

import java.util.Scanner;

public class Three {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		char[] chs = str.toCharArray();
		for (int i = 0; i < chs.length; i++) {
			for (int j = 0; j < chs.length; j++) {
				if (chs[j] > chs[i]) {
					char temp = chs[i];
					chs[i] = chs[j];
					chs[j] = temp;
				}
			}
		}
		System.out.println(chs);
		sc.close();
	}
}
