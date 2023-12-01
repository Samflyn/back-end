package sumofoddeven;

public class Sum {
	public static void main(String[] args) {
		int i, esum = 0, osum = 0;
		for (i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				esum = esum + i;
			} else {
				osum = osum + i;
			}
		}
		System.out.println(esum + "\n" + osum);
	}
}