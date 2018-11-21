package aufgabe6;

/**
 * @author Tobias Die Klasse Dual speichert eine Zahl als Dualzahl ab.
 */
public class Dual {
	// AN DIESER STELLE HABE ICH ALLGEMEINER PROGRAMMIERT, DIE ANZAHL DER BITS DER
	// DUALZAHL KANN VERÄNDERT WERDEN

	// DUALLENGTH gibt die Anzahl der Stellen der Dualzahl an, gezählt ab 0
	private final static int DUALLENGTH = 31;
	private final static int MAXVALUE = (int) Math.pow(2, DUALLENGTH);

	private static boolean[] values = new boolean[DUALLENGTH + 1];

	/**
	 * Im Kostruktor werden alle Stellen von values auf false gesetzt
	 */
	public Dual() {
		// Setze alle Werte von Values auf false
		for (int i = 0; i < values.length; i++) {
			values[i] = false;
		}
	}

	/**
	 * get gibt den Booleanwert an der Stelle index zurück. Sollte index nicht im
	 * gültigen Bereich liegen wird false zurückgegeben.
	 * 
	 * @param index Die Stelle auf die zugegriffen werden soll.
	 * @return Der Booleanwert der Stelle
	 */
	public boolean get(int index) {
		if (index >= 0 && index <= DUALLENGTH) {
			return values[index];
		} else {
			return false;
		}
	}

	/**
	 * set setzt den Booleanwert an der Stelle index auf value Sollte index nicht im
	 * gültigen Bereich liegen passiert garnichts
	 * 
	 * @param index der Index an dessen Stelle der Booleanwert bearbeitet werden
	 *              soll
	 * @param value Der Booleanwert der an der Stelle index gesetzt werden soll
	 */
	public void set(int index, boolean value) {
		if (index >= 0 && index <= DUALLENGTH) {
			values[index] = value;
		}
	}

	/**
	 * fromDecimal speichert die übergebene Zahl in die Dualzahl ab.
	 * 
	 * @param decimal Die Zahl die gespeichert werden soll
	 */
	public void fromDecimal(int decimal) {

		// Wenn decimal zu groß oder zu klein ist wird hier abgebrochen
		if (decimal >= -(MAXVALUE) && decimal <= MAXVALUE) {

			// Wird verwendet um die einzelnen Booleanwerte bei einer negativen Zahl zu
			// invertieren
			boolean decPositive = decimal >= 0;

			if (decPositive) {
				values[DUALLENGTH] = false;
			} else {
				values[DUALLENGTH] = true;

				// Entfernt das - und rechnet -1 da im negativen bei 1 und nicht bei 0
				// angefangen wird zu rechnen.
				decimal = (decimal * (-1)) - 1;
			}

			for (int i = 0; i < DUALLENGTH; i++) {
				if ((decimal & 1) == 1) {
					values[i] = decPositive;
				} else {
					values[i] = !decPositive;
				}

				decimal = decimal >> 1;
			}
		}
	}

	/**
	 * toDecimal rechnet den Dualwert der Dualzahl aus
	 * 
	 * @return Der Dualwert als Integer
	 */
	public int toDecimal() {
		// decimal ist eine Hilfsvariable die den Dualwert während der Berechnung
		// zwischenspeichert
		int decimal = 0;

		for (int c = 0; c < DUALLENGTH; c++) {
			if (values[c]) {
				decimal += Math.pow(2, c);
			}
		}

		// Sollte values[31] true sein muss decimal in eine negative Zahl umgerechnet
		// werden
		if (values[DUALLENGTH]) {
			decimal = ((MAXVALUE - decimal) * -1) - 1;
		}

		return decimal;
	}
}
