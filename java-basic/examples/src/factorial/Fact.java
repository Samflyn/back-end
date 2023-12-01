package factorial;

import java.util.Scanner;

public class Fact {
	public static void main(String[] args) {
		long n, fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value");
		n = sc.nextInt();
		while (n >= 1) {
			fact = fact * n;
			n--;
		}
		System.out.println("fact " + fact);
		sc.close();
	}
}