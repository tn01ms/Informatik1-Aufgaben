package aufgabe10;

/**
 * @author Tobias
 * Die abstrakte Klasse Ger�t ist eine Oberklasse f�r alle Ger�te (z.B. Herd, Waschmaschine, etc.)
 */
public abstract class Geraet {
	
	protected double kaufpreis;

	/**
	 * Im Konstruktor wird der Kaufpreis gesetzt
	 * @param kaufpreis
	 */
	public Geraet(double kaufpreis) {
		this.kaufpreis = kaufpreis;
	}
	
	/**
	 * abstract
	 * Die Methode soll den Restwert berechnen
	 * @param n Der Zeitpunkt zu dem der Restwert berechnet werden soll
	 * @return der Restwert
	 */
	public abstract double getRestwert(int n);
}
