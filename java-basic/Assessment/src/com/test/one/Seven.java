package com.test.one;

import java.util.ArrayList;

public class Seven {
	public static void main(String[] args) {
		int counter = 1;
		ArrayList<Integer> al = new ArrayList<Integer>();
		while (counter < 100) {
			int num = counter;
			boolean flag = true;
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					flag = false;
				}
			}
			if (flag == true) {
				al.add(num);
			}
			counter++;
		}
		System.out.println("Prime numbers from 1 to 100 are : ");
		System.out.println(al);
	}
}
