package com.test.one;

public class Three {
	public static void main(String[] args) {
		String s1 = "Buffer";
		String s2 = "Buider";
		StringBuffer s3 = new StringBuffer();
		StringBuffer s4 = new StringBuffer();
		for (int i = 0; i < s1.length(); i++) {
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);
			if (c1 == c2) {
				s3.append(c1);
			} else {
				s4.append(c2);
			}
		}
		System.out.println(s3);
		System.out.println(s4);
	}
}