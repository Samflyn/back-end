package sequence913;

public class Sqnce {
	public static void main(String[] args) {
		int i, j;
		for (i = 5; i >= 1; i--) {
			System.out.println();
			for (j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			for (j = 5; j > i; j--) {
				System.out.print("  ");
			}
			for (j = 5; j > i; j--) {
				if (j == 5) {
					continue;
				}
				System.out.print("  ");
			}
			for (j = i; j >= 1; j--) {
				if (j == 5) {
					continue;
				}
				System.out.print(j + " ");
			}
		}
		for (i = i + 2; i <= 5; i++) {
			System.out.println();
			for (j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			for (j = 5; j > i; j--) {
				System.out.print("  ");
			}
			for (j = 5; j > i; j--) {
				if (j == 5) {
					continue;
				}
				System.out.print("  ");
			}
			for (j = i; j >= 1; j--) {
				if (j == 5) {
					continue;
				}
				System.out.print(j + " ");
			}
		}
	}
}