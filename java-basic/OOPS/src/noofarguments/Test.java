package noofarguments;

public class Test {
	public static void main(String[] args) {
		Sample s1 = new Sample();
		s1.display();
		s1.display(1);
		s1.display(2, 3, 4);
		s1.display(3, 5);
		s1.display(3, 5, 3);
	}
}