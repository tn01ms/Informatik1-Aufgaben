package aufgabe12;

/**
 * Die Klasse MeinLog enth�lt eine statische Methode welche den nat�rlichen
 * Logarithmus einer Gleitkommazahl mithilfe der Potenzreihe n�herungsweise
 * berechnet
 * 
 * @author Tobias
 */
public class MeinLog {
	public static void main(String[] args) {
		MeinLog.ln(-1);
	}

	/**
	 * Die Methode errechnet den nat�rlichen Logarithmus des Parameters z.
	 * 
	 * @param z Die Zahl mit der gerechnet werden soll
	 * @return Den nat�rlichen Logarithmus
	 * @throws IllegalArgumentException wenn z < 0
	 */
	public static double ln(double z) throws IllegalArgumentException {
		// Sonderfallbehandlung
		if (z == Double.POSITIVE_INFINITY) {
			return Double.POSITIVE_INFINITY;
		} else if (z == 0) {
			return Double.NEGATIVE_INFINITY;
		} else if (z < 0) {
			throw new IllegalArgumentException();
		} else {
			double x = z - 1.0;

			if (x <= 1.0) {
				double sum = 0.0;

				for (int k = 1; Math.abs(Math.pow(x, k) / k) > 0.000001; k++) {
					sum += Math.pow(x, k) / k;
					k++;
					sum -= Math.pow(x, k) / k;
				}

				return sum;
			} else {
				// Berechne ln rekursiv
				return -ln(1 + (-x / (1 + x)));
			}
		}
	}
}