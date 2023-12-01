package instaconspara;

// To call constructor in same class "this" is used.
public class Inheritance {
	public static void main(String[] args) {
		Grandchild t1 = new Grandchild();
		System.out.println("Default");
		t1.display();
		Grandchild t2 = new Grandchild(1, 2, 3, 4, 5, 6);
		System.out.println("With arguments");
		t2.display();
	}
}