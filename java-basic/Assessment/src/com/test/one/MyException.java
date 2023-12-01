package com.test.one;

public class MyException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;

	public MyException(String string) {
		message = string;
	}

	public String getMessage() {
		return message;
	}
}
