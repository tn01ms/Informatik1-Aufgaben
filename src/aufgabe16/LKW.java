package aufgabe16;



/**
 * Klasse die ein LKW repräsentiert.
 */
public class LKW {

	/**
	 * Maximalgewicht für die Ladekapazität von diesem LKW in Kilogramm.
	 */
	private final int maxGewichtInKG;
	/**
	 * Maximales Ladevolumen von diesem LKW in Kubikmeter.
	 */
	private final double maxM3Volumen;
	
	/**
	 * Erstellt einen neuen LKW.
	 * @param maxGewichtInKG
	 * @param maxM3Volumen
	 */
	public LKW(int maxGewichtInKG, double maxM3Volumen) {
		this.maxGewichtInKG = maxGewichtInKG;
		this.maxM3Volumen = maxM3Volumen;
	}
	
	public int getMaxGewichtInKG() {
		return this.maxGewichtInKG;
	}
	public double getMaxM3Volumen() {
		return this.maxM3Volumen;
	}
}
 
