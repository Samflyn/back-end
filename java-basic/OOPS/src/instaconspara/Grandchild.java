package instaconspara;

public class Grandchild extends Child {
	int i;
	int j;

	public Grandchild() {
		i = 0;
		j = 0;
	}

	public Grandchild(int x, int y, int z, int k, int l, int m) {
		super(x, y, z, k);
		i = l;
		j = m;
	}

	public void display() {
		super.display();
		System.out.println(i + "\t" + j);
	}
}