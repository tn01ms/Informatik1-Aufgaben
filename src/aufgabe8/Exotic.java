package aufgabe8;

/**
 * Die Klasse repräsentiert eine Pflanze wie in der Aufgabenstellung beschrieben
 * @author Tobias
 */
public class Exotic {
	
	public static void main(String[] args) {
		Exotic e = new Exotic();
		
		System.out.println(e.getVolumenRekursiv(1, 2));
	}

	/**
	 * Die Methode errechnet das Gesamtvolumen der Pflanze n Zeitpunkte nach dem
	 * Wachstumsstart mit einer Startlaenge von m cm.
	 * 
	 * @param n Anzahl der Zeitpunkte
	 * @param m Startlange
	 * @return Das Volumen
	 */
	public double getVolumenRekursiv(int n, double m) {
		if (n > 0) {
			//Das Volumen des mittleren Würfels und die Volumen der drei Zusatzwürfel werden berechnet
			double volumenMitte = Math.pow(m, 3);
			double volumenLinks = getVolumenRekursiv(n - 1, m / 2);
			double volumenOben = getVolumenRekursiv(n - 1, m / 2);
			double volumenRechts = getVolumenRekursiv(n - 1, m / 2);

			return volumenMitte + volumenLinks + volumenOben + volumenRechts;
		} else {
			// Sollte n = 0 sein werden keine weiteren Zusatzwürfen errechnet sondern nur
			// das Volumen des aktuell betrachteten Würfels
			return Math.pow(m, 3);
		}
	}
}
