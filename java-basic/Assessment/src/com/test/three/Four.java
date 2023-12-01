package com.test.three;

import java.util.Scanner;

public class Four {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("adsfgdf");
		String str = sc.nextLine();
		perm(str, "");
		sc.close();
	}

	private static void perm(String str, String string) {
		if (str.length() == 0) {
			System.out.print(string + " ");
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);
			perm(ros, string + ch);
		}
	}
}
