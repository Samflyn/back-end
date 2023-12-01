package binarysearch;

import java.util.Scanner;

public class Binary {
	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 4, 6, 8, 9, 10, 11, 13, 14, 15, 18, 22, 24, 26, 29, 31, 33, 36, 38, 40 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to search for : ");
		int num = sc.nextInt();
		int l = 0;
		int h = a.length - 1;
		boolean flag = false;
		while (l < h) {
			int m = (l + h) / 2;
			if (num == a[m]) {
				flag = true;
				System.out.println("Number is at a[" + m + "]");
				break;
			} else if (num > a[m]) {
				l = m + 1;
			} else {
				h = m - 1;
			}
		}
		if (flag == false) {
			System.out.println("Number not found");
		}
		sc.close();
	}
}