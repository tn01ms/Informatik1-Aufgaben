package aufgabe12;

public class MeinLog {

	public static void main(String[] args) {
		System.out.println(MeinLog.ln(100));
	}

	/**
	 * Die Methode errechnet den natürlichen Logarithmus des Parameters z.
	 * 
	 * @param z Die Zahl mit der gerechnet werden soll
	 * @return Den natürlichen Logarithmus
	 * @throws IllegalArgumentException wenn z < 0
	 */
	public static double ln(double z) throws IllegalArgumentException {
		try {
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
					double temp = 0.0;
					System.out.println(Math.pow(x, 1) / 1);

					for (int k = 1; Math.abs(Math.pow(x, k) / k) > 0.000001; k++) {
						temp += Math.pow(x, k) / k;
						k++;
						temp -= Math.pow(x, k) / k;
						System.out.println(k);
					}

					return temp;
				} else {
					// Berechne ln rekursiv
					return -ln(1 + (-x / (1 + x)));
				}
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Illegal Argument: z has to be bigger than or equal to 0");
			return 0;
		}
	}
}