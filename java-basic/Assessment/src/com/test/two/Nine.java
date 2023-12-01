package com.test.two;

import java.util.Arrays;

public class Nine {
	public static void main(String[] args) {
		int[] i = { 5, 34, 78, 2, 45, 1, 99, 23 };
		Arrays.sort(i);
		System.out.println("Two maximum numbers are : " + i[i.length - 2] + "," + i[i.length - 1]);
	}
}
