package com.test.three;

public class Ten {
	public static void main(String[] args) {
		char[] ch = { 'A', 'B', 'C', 'D' };
		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {
				if (j == i) {
					System.out.print(ch[j - 1]);
				} else {
					System.out.print(" ");
				}
			}
			if (i > 1) {
				for (int j = 1; j < i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j < i - 1; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= 1; j++) {
					System.out.print(ch[i - 1]);
				}
			}
			System.out.println();
		}
		for (int i = 4; i >= 1; i--) {
			if (i == 4) {
				continue;
			}
			for (int j = 4; j >= i; j--) {
				if (i == j) {
					if (j != 0) {
						System.out.print(ch[j - 1]);
					}
				} else {
					System.out.print(" ");
				}
			}
			for (int j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 2; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 1; j++) {
				if (i != 1) {
					System.out.print(ch[i - 1]);
				}
			}
			System.out.println();
		}
	}
}