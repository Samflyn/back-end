package instaconspara;

public class Parent {
	int a;
	int b;

	public Parent() {
		a = 0;
		b = 0;
	}

	public Parent(int x, int y) {
		a = x;
		b = y;
	}

	public void display() {
		System.out.println(a + "\t" + b);
	}
}