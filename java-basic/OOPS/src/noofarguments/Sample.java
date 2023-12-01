package noofarguments;

public class Sample {
	int a, b, c;

	public void display() {
		a = 0;
		b = 0;
		c = 0;
		System.out.println("No arguments");
	}

	public void display(int x) {
		a = x;
		b = 0;
		c = 0;
		System.out.println("1 argument");
	}

	public void display(int x, int y) {
		a = x;
		b = y;
		c = 0;
		System.out.println("2 arguments");
	}

	public void display(int x, int y, int z) {
		a = x;
		b = y;
		c = z;
		System.out.println("3 arguments");
	}
}