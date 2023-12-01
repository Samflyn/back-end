package throwskeyword;

public class SomeException extends Exception {
	String message;

	public SomeException() {
		message = null;
	}

	public SomeException(String string) {
		message = string;
	}

}
