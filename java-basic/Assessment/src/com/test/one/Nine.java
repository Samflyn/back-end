package com.test.one;

public class Nine {
	public static void main(String[] args) {
		Object obj = null;
		try {
			if (obj == null) {
				throw new MyException("Any custom exception");
			}
			System.out.println(obj.hashCode());
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}
}