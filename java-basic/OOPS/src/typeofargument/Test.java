package typeofargument;

public class Test {
	public static void main(String[] args) {
		Sample s1 = new Sample();
		s1.display();
		s1.display(1);
		s1.display(2, 4.5f, 'q');
		s1.display(3, 'v');
		s1.display(3, 3.6f, 't');
	}
}