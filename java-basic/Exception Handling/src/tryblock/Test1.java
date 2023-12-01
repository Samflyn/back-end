package tryblock;

//default catch must be last.
public class Test1 {
	public static void main(String[] args) {
		System.out.println("Running code");
		try {
			System.out.println("outer try");
			int a = 10;
			int b = args.length;
			int c = a / b;
			System.out.println(c);
			try {
				System.out.println("inner try");
				System.out.println("first one " + args[0]);
				System.out.println("second one " + args[1]);
				System.out.println("third one " + args[2]);
				System.out.println("end of inner try");
			} finally {
				System.out.println("inner finally");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("array index exception");
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.err.println("divide by zero");
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println("default exception");
			e.printStackTrace();
		} finally {
			System.out.println("end of code");
		}
	}
}