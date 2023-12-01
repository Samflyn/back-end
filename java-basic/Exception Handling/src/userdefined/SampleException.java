package userdefined;

public class SampleException extends Exception {
	String message;

	public SampleException() {
		message = null;
	}

	public SampleException(String e) {
		message = e;
	}

	public String getMessage() {
		return message;
	}

	public String toString() {
		return message;
	}
}
