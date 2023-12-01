package arrayfunc;

import java.util.Arrays;
import java.util.Scanner;

public class Fun {
	public static void main(String[] args) {
		int[] a = new int[5];
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 numbers : ");
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("After Sorting : ");
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		sc.close();
	}
}