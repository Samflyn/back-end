package interfaceuse;

public class Test {
	public static void main(String[] args) {
		Child p1 = new Child();
		Child p2 = new Child();
		p1.setData(50, 100);
		p1.display();
		p2.setData(100, 200);
		p2.display();
		System.out.println(Interface.COMMOM); // for common variables
		System.out.println(Interface1.COMMOM);// should be called by class name
	}
}