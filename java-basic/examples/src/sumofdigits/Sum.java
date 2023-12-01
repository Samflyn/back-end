package sumofdigits;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		int n, a;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		n = sc.nextInt();
		while (n != 0) {
			a = n % 10;
			sum = sum + a;
			n = n / 10;
		}
		System.out.println("sum = " + sum);
		sc.close();
	}
}