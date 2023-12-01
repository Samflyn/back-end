package sequence4;

public class Sqnc {
	public static void main(String[] args) {
		int a = 1;
		for (int i = 5; i >= 1; i--) {
			System.out.println();
			for (int j = a; j <= 5; j++) {
				System.out.print(j + "\t");
			}
			a++;
		}
	}
}