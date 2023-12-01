package minmax;

public class MINMAX {

	public static void main(String[] args) {
		int a[] = new int[] { 432523, 235, 435235, 34523543, 235353254, 345325 };
		int max = a[0];
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Max : " + max + "\t Min : " + min);
	}
}