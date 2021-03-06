package aufgabe16;

import java.util.List;
import java.util.stream.Stream;

/**
 * Die Klasse Produktmanager stellt zwei Methoden bereit die zur Analyse von
 * Mengen von Produkten geeignet sind
 * 
 * @author Tobias
 *
 */
public class ProduktManager {	

	/**
	 * Z�hlt alle Produkte im Stream mit mehr als 50KG Gewicht
	 * 
	 * @param p Der Produkt-Stream
	 * @return Anzahl der schweren Produkte
	 */
	public long getAnzahlSchwereProdukte(List<Produkt> products) {
		Stream<Produkt> p = products.parallelStream();
		return p.filter(i -> i.getGewichtInGramm() >= 50000).count();
	}

	/**
	 * Errechnet ob der LKW lkw genug Platz und Gewichtskapazit�ten bietet ist um
	 * alle Produkte der Liste products zu verstauen
	 * 
	 * @param lkw      Der LKW
	 * @param products Liste der Produkte
	 * @return true -> LKW kann Produkte aufnehmen | false -> LKW kann Produkte
	 *         nicht aufnehmen
	 */
	public boolean passtAufLKW(LKW lkw, List<Produkt> products) {
		// Stream �ffnen
		Stream<Produkt> p = products.parallelStream();
		// Gramm summieren und in KG umrechnen
		double curKG = p.mapToDouble(i -> i.getGewichtInGramm()).sum() / 1000;
		
		// Stream erneut �ffnen
		p = products.parallelStream();
		// Volumen summieren und passend umrechnen
		double curVol = p.mapToDouble(i -> i.getVolumenCM3()).sum() / 1000000;

		// Maximalwerte
		double maxKG = (double) lkw.getMaxGewichtInKG();
		double maxVol = lkw.getMaxM3Volumen();

		return (curKG <= maxKG && curVol <= maxVol);
	}
}
