package userdefined;

public class Test {
	public static void main(String[] args) {
		System.out.println("running code");
		try {
			System.out.println("try start");
			int a = 10;
			int b = args.length;
			if (b == 0) {
				throw new SampleException("divide by zero");
			}
			int c = a / b;
			System.out.println(c);
		} catch (SampleException e) {
			System.out.println("Arithmetic exception");
			System.out.println(e.getMessage());// makes call to method in SampleException.
			System.out.println(e);// makes call to toString() in SampleException.
		}
		System.out.println("end of code");
	}
}
