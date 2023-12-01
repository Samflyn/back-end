package finaluse;

/* It is used to int values and cannot be changed.
	Should always be in CAPS for example "MODULE_NAME"
	It should only be used for constants. It can also be used as static. */
public class Sample {
	// Local variable
	public void display() {
		final int A = 10;
	}

	// Data member
	final int B = 20;
	// using initialize block
	final int c;
	{
		c = 30;
	}
	// using static block
	final static int d;
	static {
		d = 40;
	}
	// using constructor
	final int e;

	public Sample() {
		e = 50;
	}
}