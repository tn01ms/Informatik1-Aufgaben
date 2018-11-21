package aufgabe10;

/**
 * @author Tobias
 * Die Klasse symbolisiert eine Waschmaschine
 * Sie erbt von Geraet und implementiert die Klasse Wasserverbraucher
 */
public class Waschmaschine extends Geraet implements Wasserverbraucher {
	
	private int upm;
	private double verbrauch;

	/**
	 * Im Kostruktor werden der Kaufpreis (super) und die Umdrehungen pro Minute festgelegt 
	 * @param kaufpreis Der Kaufpreis
	 * @param upm Die Umdrehungen pro Minute
	 */
	public Waschmaschine(double kaufpreis, int upm) {
		super(kaufpreis);
		this.upm = upm;
	}
	
	/**
	 * Gibt die Umdrehungen pro Minute zurück
	 * @return UPM
	 */
	public int getUpm() {
		return upm;
	}
	
	/**
	 * Setzt den Verbrauch
	 * @param verbrauch
	 */
	public void setVerbrauch(double verbrauch) {
		this.verbrauch = verbrauch;
	}

	@Override
	/**
	 * Gibt den Restwert der Waschmaschine zum Zeitpunkt n zurück
	 * @param n Der Zeitpunkt
	 * @return Der Restwert
	 */
	public double getRestwert(int n) {
		if (n <= 5) {
			return kaufpreis * (1.0 - 0.2 * n);
		} else {
			return 0.0;
		}
	}

	@Override
	/**
	 * Gibt den Wasserverbrauch zurück
	 * @return Wasserverbrauch
	 */
	public double getWasserverbrauch() {
		return verbrauch;
	}
}
