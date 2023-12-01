package interfaceuse1;

public class Test {
	public static void main(String[] args) {
		Interface i1 = new Sample(); // Parent reference and child class instance.
		i1.display();
		i1.show();
		// i1.set(); cannot be used as set is not a interface method.
	}
}