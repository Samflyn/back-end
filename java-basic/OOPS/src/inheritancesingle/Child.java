package inheritancesingle;

public class Child extends Parent {
	private int a = 30;
	private int b = 40;

	public void display() {
		System.out.println("Child a = " + a + "\t b = " + b);
	}

	public void show() {
		super.display();
		display();
		System.out.println("Process Stop");
	}
}