package dimensional;

import java.util.Scanner;

public class Dimension {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("how many rows");
		int r = sc.nextInt();
		int[][] a = new int[r][];
		int i;
		int j = 0;
		for (i = 0; i < a.length; i++) {
			System.out.println("no of columns for row " + (i + 1));
			int c = sc.nextInt();
			a[i] = new int[c];
		}
		for (i = 0; i < r; i++) {
			System.out.println("enter " + a[i].length + " elements for row " + (i + 1));
			for (j = 0; j < a[i].length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (i = 0; i < a.length; i++) {
			System.out.println();
			for (j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
		}
		sc.close();
	}
}