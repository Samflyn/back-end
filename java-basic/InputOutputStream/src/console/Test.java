package console;

import java.io.Console;

public class Test {
	public static void main(String[] args) {
		Console c = System.console();// read from console.
		String str = c.readLine();
		char[] ch = c.readPassword();// invisible in console.
		String passwd = String.valueOf(ch);
	}
}
