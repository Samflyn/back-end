package sequence2;

public class Sqnce {
	public static void main(String[] args) {
		for (int i = 5; i > 0; i--) {
			System.out.println();
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "\t");
			}
		}
	}
}