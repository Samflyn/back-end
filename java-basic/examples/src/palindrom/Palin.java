package palindrom;

import java.util.Scanner;

public class Palin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, rev = 0, num, temp = 0;
		System.out.println("enter a number : ");
		num = sc.nextInt();
		temp = num;
		while (num != 0) {
			a = num % 10;
			rev = rev * 10 + a;
			num = num / 10;
		}
		if (temp == rev) {
			System.out.println("Palindrom");
		} else {
			System.out.println("not palindrom");
		}
		sc.close();
	}
}