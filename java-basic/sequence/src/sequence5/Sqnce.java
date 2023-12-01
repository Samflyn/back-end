package sequence5;

public class Sqnce {
	public static void main(String[] args) {
		int a = 1;
		for (int i = 1; i <= 5; i++) {
			System.out.println();
			for (int j = a; j >= 1; j--) {
				System.out.print(j + "\t");
			}
			a++;
		}
	}
}