package sequence9;

public class Sqnce {
	public static void main(String[] args) {
		int i, j;
		for (i = 5; i >= 1; i--) {
			System.out.println();
			for (j = 5; j > i; j--) {
				System.out.print("  ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
		}
	}
}