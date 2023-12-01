package optionalsub;

import java.util.Scanner;

public class Sub {
	public static void main(String[] args) {
		int s1, s2, s3, s4;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sub1 marks");
		s1 = sc.nextInt();
		System.out.println("enter sub 2 marks");
		s2 = sc.nextInt();
		System.out.println("enter the sub3");
		s3 = sc.nextInt();
		System.out.println("enter sub4 marks");
		s4 = sc.nextInt();
		if (s1 >= 40) {
			if (s2 >= 40) {
				if (s3 >= 40) {
					System.out.println("PASS");
				} else if (s4 >= 40) {
					System.out.println("PASS");
				} else {
					System.out.println("FAIL");
				}
			} else if (s3 >= 40) {
				if (s4 >= 40) {
					System.out.println("PASS");
				}
			} else {
				System.out.println("FAIL");
			}
		} else if (s2 >= 40) {
			if (s3 >= 40) {
				System.out.println("PASS");
			} else {
				System.out.println("FAIL");
			}
		} else {
			System.out.println("FAIL");
		}
		sc.close();
	}
}