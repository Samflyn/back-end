package typeofargument;

public class Sample {
	public void display() {
		int a = 0;
		float b = 0;
		char c = '\0';
		System.out.println(a + " " + b + " " + c);
	}

	public void display(int x) {
		int a = x;
		float b = 0;
		char c = '\0';
		System.out.println(a + " " + b + " " + c);
	}

	public void display(int x, char y) {
		int a = x;
		char b = y;
		float c = 0;
		System.out.println(a + " " + b + " " + c);
	}

	public void display(int x, float y, char z) {
		int a = x;
		float b = y;
		char c = z;
		System.out.println(a + " " + b + " " + c);
	}
}