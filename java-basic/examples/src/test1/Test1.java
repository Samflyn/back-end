package test1;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner something = new Scanner(System.in);
		System.out.println("Enter something");
		String name = something.nextLine();
		System.out.println("now for the other one:");
		String name1 = something.nextLine();
		System.out.println("the third one:");
		String name2 = something.nextLine();
		System.out.println("First : " + name + "\nSecond : " + name1 + "\nThird : " + name2);
		something.close();
	}
}