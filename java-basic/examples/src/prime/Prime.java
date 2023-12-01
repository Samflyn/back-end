package prime;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		boolean flag = true;
		System.out.println("enter a num");
		num = sc.nextInt();
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = false;
			}
		}
		if (flag == true) {
			System.out.println("prime");
		} else {
			System.out.println("not");
		}
		sc.close();
	}
}