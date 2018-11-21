package aufgabe3;
/**
 * @author Tobias
 * Die Klasse Rechteck kann die Laenge und die Breite eines Rechtecks speichern und
 * zurueckgeben. Desweiteren kann geprueft werden ob das Rechteck ein Quadrat ist und
 * die Flaeche berechnet werden.
 */
public class Rechteck {
	private int laenge;
	private int breite;

	/**
	 * Der Konstruktor setzt die Laenge und die Breite des Rechtecks fest.
	 * @param l Die Laenge des Recktecks
	 * @param b Die Breite des Recktecks
	 */
	public Rechteck(int l, int b) {
		laenge = l;
		breite = b;
	}
	
	/**
	 * Diese Methode gibt die Laenge des Rechtecks zurueck
	 * @return Laenge des Rechtecks
	 */
	public int getLaenge() {
		return laenge;
	}
	
	/**
	 * Diese Methode gibt die Breite des Rechtecks zurueck
	 * @return Breite des Rechtecks
	 */
	public int getBreite() {
		return breite;
	}
	
	/**
	 * Diese Methode ueberprueft ob das Rechteck ein Quadrat ist.
	 * @return Der Wahrheitswert der Ueberpruefung
	 */
	public boolean isQuadrat() {
		return laenge == breite;
	}
	
	/**
	 * Diese Methode berechnet die Flaeche des Rechtecks
	 * @return Die Flaeche
	 */
	public int getFlaeche() {
		return laenge * breite;
	}
}
