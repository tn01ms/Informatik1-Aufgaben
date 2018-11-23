package aufgabe15;

import java.util.Arrays;

public class Scan {

	public static final int[] a = { 42, 17, 56, 98, 76, 33, 24, 15, 15, 29 };

	public static int[] scan(int[] a, IntOperation op) {
		int[] erg = new int[a.length];

		erg[0] = a[0];

		for (int b = 1; b < a.length; b++) {
			int temp = 0;

			for (int i = 0; i <= b; i++) {
				temp = op.evaluate(temp, a[i]);
			}

			erg[b] = temp;
		}

		return erg;
	}

	public static int[] scanAdd(int[] a) {
		return scan(a, (i,y) -> (i + y));
	}

	public static int[] scanMul(int[] a) {
		return scan(a, (i, y) -> (i * y)); //TODO, NOT WORKING YET
	}

	public static int[] scanMax(int[] a) {
		return scan(a, (i, y) -> (Math.max(i, y)));
	}

	public static void main(String[] args) {
		int[] aAdd = scanAdd(a);
		int[] aMul = scanMul(a);
		int[] aMax = scanMax(a);

		final String s = "\t(%s) Scan mit %s auf: %s = %s\n";
		System.out.printf(String.format(s, "i", "Addition", Arrays.toString(a), Arrays.toString(aAdd)));
		System.out.printf(String.format(s, "ii", "Multiplikation", Arrays.toString(a), Arrays.toString(aMul)));
		System.out.printf(String.format(s, "iii", "Maximum", Arrays.toString(a), Arrays.toString(aMax)));
	}

}
