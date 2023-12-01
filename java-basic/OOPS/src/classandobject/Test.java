package classandobject;

public class Test {
	public static void main(String[] args) {
		Sample s1 = new Sample();
		Sample s2 = new Sample();
		Sample s3 = new Sample();
		s1.setData(10, 20);
		s2.setData(30, 40);
		s3.setData(50, 60);

		s1.Display();
		s2.Display();
		s3.Display();
	}
}