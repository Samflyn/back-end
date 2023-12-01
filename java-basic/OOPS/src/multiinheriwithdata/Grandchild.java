package multiinheriwithdata;

public class Grandchild extends Child {
	int e;
	int f;

	public void setData(int x, int y, int z, int k, int l, int m) {
		setData(x, y, z, k);
		e = l;
		f = m;
	}

	public void display() {
		super.display();
		System.out.println(e + "\t" + f);
	}
}