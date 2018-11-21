package aufgabe3;
/**
 * @author Tobias
 * Die Klasse Kreis kann den Radius eines Kreises speichern und
 * zurueckgeben. Desweiteren kann der Durchmesser berechnet werden sowie ueberprueft werden
 * ob der Kreis in ein Rechteck passen wuerde.
 */
public class Kreis {
	private int radius;
	
	/**
	 * Der Konstruktor setzt den Radius des Kreises fest.
	 * @param r Der Radius des Kreises
	 */
	public Kreis(int r) {
		radius = r;
	}
	
	/**
	 * Diese Methode gibt den Radius des Kreises zurueck
	 * @return Radius des Kreises
	 */
	public int getRadius() {
		return radius;
	}
	
	/**
	 * Diese Methode gibt den Durchmesser des Kreises zurieck (Doppelter Radius)
	 * @return Durchmesser des Kreises
	 */
	public int getDurchmesser() {
		return radius * 2;
	}
	
	/**
	 * Diese Methode ueberprueft ob der Kreis in ein uebergebenes Rechteck passen wuerde
	 * @param rechteck Das Rechteck
	 * @return Der Wahrheitswert der Ueberpruefung
	 */
	public boolean passtInRechteck(Rechteck rechteck) {
		if(rechteck.getBreite() >= getDurchmesser() && rechteck.getLaenge() >= getDurchmesser()) {
			return true;
		} else {
			return false;
		}
	}
}
