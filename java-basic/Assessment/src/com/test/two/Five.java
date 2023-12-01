package com.test.two;

import java.util.Scanner;
import java.util.TreeSet;

public class Five {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		StringBuffer sb = new StringBuffer();
		char[] chs = str.toCharArray();
		TreeSet<String> ts = new TreeSet<String>();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (chs[i] == chs[j]) {
					sb.append(chs[i]);
					break;
				}
			}
			ts.add(Character.toString(str.charAt(i)));
		}
		for (int i = 0; i < sb.length(); i++) {
			ts.remove(Character.toString(sb.charAt(i)));
		}
		System.out.println("First repeating char : " + sb.charAt(0));
		System.out.println("First non repeating char : " + ts.first());
		sc.close();
	}
}
