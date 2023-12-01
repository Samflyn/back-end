package interfaceuse;

// extends should be used before implements.
public class Child extends Parent implements Interface, Interface1 {
	public void display() {
		System.out.println("x = " + super.x + "\ty = " + super.y);
		System.out.println("A = " + A + "\tB = " + B);
	}

	public void setData(int x, int y) {
		this.x = x;
		this.y = y;
	}
}