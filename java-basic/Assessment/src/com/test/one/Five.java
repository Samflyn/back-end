package com.test.one;

import java.util.Arrays;

public class Five {
	public static void main(String[] args) {
		String str = "Training";
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		StringBuffer sb = new StringBuffer();
		sb.append(ch);
		System.out.println("String : " + sb);
	}
}
