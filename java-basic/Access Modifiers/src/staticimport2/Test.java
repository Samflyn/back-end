package staticimport2;

//import static staticimport1.Sample.*;  This is used to import only static members.
import staticimport1.Sample; // This is used to import all the members available.

public class Test {
	public static void main(String[] args) {
		System.out.println(Sample.a); // To call a static member Class name is used.
		Sample s1 = new Sample();
		System.out.println(s1.b);
		/*
		 * To call a non-static member object should be created first, then called by
		 * using that object.
		 */
	}
}