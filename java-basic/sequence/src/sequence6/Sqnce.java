package sequence6;

public class Sqnce {
	public static void main(String[] args) {
		int a = 5;
		for (int i = 1; i <= 5; i++) {
			System.out.println();
			for (int j = a; j <= 5; j++) {
				System.out.print(j + "\t");
			}
			--a;
		}
	}
}