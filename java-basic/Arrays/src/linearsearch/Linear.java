package linearsearch;

import java.util.Scanner;

public class Linear {
	public static void main(String[] args) {
		int[] a = new int[] { 13, 123, 123, 314, 1243, 1354, 3154, 345, 46, 657, 756, 86, 99 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to search for : ");
		int num = sc.nextInt();
		boolean flag = false;
		int counter = 0;
		for (int i = 0; i < a.length; i++) {
			if (num == a[i]) {
				flag = true;
				System.out.println("Number forund at a[" + i + "]");
				counter++;
			}
		}
		if (flag == false) {
			System.out.println("Number not found");
		}
		System.out.println("No. of times found : " + counter);
		sc.close();
	}
}