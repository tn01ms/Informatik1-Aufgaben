package aufgabe15;

import java.util.Arrays;

/**
 * Die Klasse Scan stellt eine Methode scan bereit die auf alle vorangehenden
 * Stellen in einem Array a eine übergebene Operation anwendet und diese an der
 * Stelle im Array speichert
 * 
 * @author Tobias
 *
 */
public class Scan {

	public static final int[] a = { 42, 17, 56, 98, 76, 33, 24, 15, 15, 29 };

	/**
	 * Scan ersetzt alle Elemente in a durch das Ergebnis der in op angegebenen
	 * Operation von allen vorangestellten Arrayindizies
	 * 
	 * @param a  Das zu bearbeitende Array
	 * @param op Die Operation
	 * @return Der bearbeitete Array
	 */
	public static int[] scan(int[] a, IntOperation op) {
		int[] erg = new int[a.length];

		erg[0] = a[0];

		for (int b = 1; b < a.length; b++) {
			int temp = a[0];

			for (int i = 1; i <= b; i++) {
				temp = op.evaluate(temp, a[i]);
			}

			erg[b] = temp;
		}

		return erg;
	}

	/**
	 * Jede Stelle x in a wird durch die Summe der Stellen 0 bis x ersetzt
	 * 
	 * @param a
	 * @return
	 */
	public static int[] scanAdd(int[] a) {
		return scan(a, (i, y) -> (i + y));
	}

	/**
	 * Jede Stelle x in a wird durch die Subtraktion der Stellen 0 bis x ersetzt
	 * 
	 * @param a
	 * @return
	 */
	public static int[] scanMul(int[] a) {
		return scan(a, (i, y) -> (i * y));
	}

	/**
	 * Jede Stelle x in a wird durch das Maximum der Stellen 0 bis x ersetzt
	 * 
	 * @param a
	 * @return
	 */
	public static int[] scanMax(int[] a) {
		return scan(a, (i, y) -> (Math.max(i, y)));
	}

	/**
	 * Gibt die Ergebnisse des Tests von scanAdd, scanMul und scanMax aus.
	 * 
	 * @param args
	 */
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
