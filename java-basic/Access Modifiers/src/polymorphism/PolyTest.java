package polymorphism;

// same method for different use in different classes.
public class PolyTest {
	public static void main(String[] args) {
		Interface i1;
		i1 = new Rectangle();
		i1.display();
		i1 = new Square();
		i1.display();
		i1 = new Triangle();
		i1.display();
	}
}