package instaconspara;

public class Child extends Parent {
	int c;
	int d;

	public Child() {
		c = 0;
		d = 0;
	}

	public Child(int x, int y, int z, int k) {
		super(x, y);
		c = z;
		d = k;
	}

	public void display() {
		super.display();
		System.out.println(c + "\t" + d);
	}
}