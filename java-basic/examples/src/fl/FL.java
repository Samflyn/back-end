package fl;

import java.util.Scanner;

public class FL {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a, b = 0, c;
		int num = sc.nextInt();
		a = num % 10;
		System.out.println("the last one : " + a);
		while (num != 0) {
			b = num % 10;
			num = num / 10;
		}
		System.out.println("the first digit : " + b);
		c = a + b;
		System.out.println("the sum = " + c);
		sc.close();
	}
}