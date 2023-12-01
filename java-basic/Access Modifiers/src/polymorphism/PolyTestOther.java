package polymorphism;

public class PolyTestOther {
	public static void main(String[] args) {
		display(new Rectangle());
		display(new Triangle());
		display(new Square());
	}

	public static void display(Interface x) {
		x.display();
	}
}