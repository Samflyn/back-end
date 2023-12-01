package bubble;

import java.util.Scanner;

public class Bubble {

	public static void main(String[] args) {
		int[] a = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 numbers : ");
		int i, j = 0, temp = 0;
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (i = 0; i < a.length - 1; i++) {
			for (j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println("After Sorting : ");
		for (j = 0; j < a.length; j++) {
			System.out.print(a[j] + " ");
		}
		sc.close();
	}
}