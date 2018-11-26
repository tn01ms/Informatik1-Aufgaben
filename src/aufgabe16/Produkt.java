package aufgabe16;

/**
 * Klasse die ein Produkt repräsentiert.
 *
 */
public class Produkt {

	//Gewicht in Gramm von diesem Produkt.
	private final int gewichtInGramm;
	
	//Preis in Cent von diesem Produkt
	private final int preis;
	
	//Volumen in Kubikcentimeter von diesem Produkt.
	private final double volumenCM3;
	
	/**
	 * Erstellt ein neues Produkt mit den gegebenen Werten.
	 * @param preis
	 * @param gewichtInGramm
	 * @param volumenCM3
	 */
	public Produkt(int preis, int gewichtInGramm, double volumenCM3) {
		this.preis = preis;
		this.gewichtInGramm = gewichtInGramm;
		this.volumenCM3 = volumenCM3;
	}
	
	public int getPreis() {
		return preis;
	}
	public int getGewichtInGramm() {
		return gewichtInGramm;
	}
	public double getVolumenCM3() {
		return volumenCM3;
	}
}

