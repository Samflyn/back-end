package com.test.three;

import java.util.Arrays;

public class Eight {
	public static void main(String[] args) {
		int[] a = { 2, 1, 5, 0, 4, 3, 0, 7, 6, 8, 9 };
		Arrays.sort(a);
		int count = 0;
		System.out.println("Before sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		for (int i = 0; i < a.length; i++) {
			int k = 0;
			if (a[k] == 0) {
				for (int j = 0; j < a.length - 1; j++) {
					a[j] = a[j + 1];
				}
				count++;
			}
			k++;
		}
		while (!(count == 0)) {
			a[a.length - count] = 0;
			count--;
		}
		System.out.println("After sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}
}
