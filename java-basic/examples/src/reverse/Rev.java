package reverse;

import java.util.Scanner;

public class Rev {
	public static void main(String[] args) {
		int num, rev = 0, a;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		num = sc.nextInt();
		while (num != 0) {
			a = num % 10;
			rev = rev * 10 + a;
			num = num / 10;
		}
		System.out.println("rev : " + rev);
		sc.close();
	}
}