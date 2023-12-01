package objectinit;

/*Object can be initialized in three ways:
    1) Class Level
    2) Initialize block
    3) Constructor
Static > initialize > Constructor
Method can be  a recursive but  constructor can not be called recursively.
To call the Constructor in the same class "this()" is used.
It should be the first statement inside the constructor*/
public class Sample {
	// Class level
	private int a = 10;
	private float b = 15.5f;
	// Static Block
	static {
		System.out.println("First static block only once");
	}
	// Initialize Block
	{
		System.out.println("Initialized block for every object");
	}

	public Sample() {
		System.out.println("default constructor");
		System.out.println("Class level : " + a + "\t" + b);
	}

	public Sample(int x, int y) {
		System.out.println("two args");
	}

	public Sample(int x, int y, int z) {
		this(10, 20);
		System.out.println("three args");
	}
}