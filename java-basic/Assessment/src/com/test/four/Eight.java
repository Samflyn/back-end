package com.test.four;

public class Eight {
	public static void main(String[] args) {
		int[] a = new int[] { 134, 234, 23, 123, 121, 233, 45, 44, 36, 754, 54 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int tmp = 0;
				if (a[i] > a[j]) {
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}