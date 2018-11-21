package aufgabe10;

/**
 * @author Tobias
 * Die Klasse symbolisiert einen Herd mit einer festgelegten Anzahl an Kochfeldern
 * Sie erbt von Geraet
 */
public class Herd extends Geraet {

	private int anzahlKochfelder;

	/**
	 * Im Konstruktor wird der Kaufpreis (super) und die Anzahl der Kochfelder festgelegt
	 * @param kaufpreis Der Kaufpreis
	 * @param kochfelder Die Anzahl der Kochfelder
	 */
	public Herd(double kaufpreis, int kochfelder) {
		super(kaufpreis);
		this.anzahlKochfelder = kochfelder;
	}

	/**
	 * Gibt die Anzahl der Kochfelder zurück
	 * @return Anzahl der Kochfelder
	 */
	public int getAnzahlKochfelder() {
		return this.anzahlKochfelder;
	}

	@Override
	/**
	 * Gibt den Restwert des Herdes zum Zeitpunkt n zurück
	 * @param n Der Zeitpunkt
	 * @return Der Restwert
	 */
	public double getRestwert(int n) {
		if (n <= 10) {
			return kaufpreis * (1.0 - 0.1 * n);
		} else {
			return 0.0;
		}
	}
}
