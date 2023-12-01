package throwkeyword;

public class Test {
	public static void main(String[] args) {
		System.out.println("running code");
		try {
			System.out.println("try start");
			int a = 10;
			int b = args.length;
			if (b == 0) {
				throw new ArithmeticException("divide by zero");
			}
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("end of code");
	}
}
