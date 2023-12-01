package test2;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter an int");
		int num1 = sc.nextInt();
		System.out.println("enter a long");
		long num2 = sc.nextLong();
		System.out.println("enter a float");
		float flat1 = sc.nextFloat();
		System.out.println("enter a double");
		double flat2 = sc.nextDouble();
		System.out.println("enter a string");
		String name = sc.next();
		sc.close();
		System.out.println("int : " + num1 + "\nlong : " + num2 + "\nfloat : " + flat1 + "\ndouble : " + flat2
				+ "\nstring : " + name);
	}
}
