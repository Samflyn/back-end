package com.test.two;

public class Seven {
	public static void main(String[] args) {
		int i = 0, j = 1, k;
		int n = 0;
		while (n <= 10) {
			k = i + j;
			System.out.println(k);
			i = j;
			j = k;
			n++;
		}
	}
}