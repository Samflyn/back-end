package wrapperclass;

//to convert basic to object object wrapper class are used. These are immutable and final.
public class Wrapper extends Object {
	public static void main(String[] args) {
		int a = 10;
		// basic to object.
		Integer i1 = new Integer(a);// Don't use this way.
		Integer i2 = Integer.valueOf(a);
		// object to basic.
		Integer i3 = Integer.valueOf(20);
		int b = i3.intValue();
		Integer i4 = 50;// Auto boxing.
		int c = i2;// Auto unboxing.
		Object d = new Wrapper();// object to object. Implicit process.
		Wrapper e = (Wrapper) d;// object to object explicit process.
		// Object class is parent to every class created.
		// Object class toString() returns address ( reference ) of the object.
		Wrapper ss = new Wrapper();
		System.out.println(ss);// here toString() executes.
		// To get the values in ss toStringn() should be overridden.
		String str = "01";
		int i = Integer.parseInt(str);// to convert string to basic.
		String str1 = String.valueOf(a);// to covert basic to String.
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}