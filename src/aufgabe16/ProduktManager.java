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
	 * Zählt alle Produkte im Stream mit mehr als 50KG Gewicht
	 * 
	 * @param p Der Produkt-Stream
	 * @return Anzahl der schweren Produkte
	 */
	public long getAnzahlSchwereProdukte(Stream<Produkt> p) {
		return p.filter(i -> i.getGewichtInGramm() >= 50000).count();
	}

	/**
	 * Errechnet ob der LKW lkw genug Platz und Gewichtskapazitäten bietet ist um
	 * alle Produkte der Liste products zu verstauen
	 * 
	 * @param lkw      Der LKW
	 * @param products Liste der Produkte
	 * @return true -> LKW kann Produkte aufnehmen | false -> LKW kann Produkte
	 *         nicht aufnehmen
	 */
	public boolean passtAufLKW(LKW lkw, List<Produkt> products) {
		// Stream öffnen
		Stream<Produkt> p = products.parallelStream();
		// KG summieren
		int curKG = p.mapToInt(i -> i.getGewichtInGramm()).sum();
		// Stream erneut öffnen
		p = products.parallelStream();
		// Volumen summieren
		double curVol = p.mapToDouble(i -> i.getVolumenCM3()).sum();

		// Maximalwerte
		int maxKG = lkw.getMaxGewichtInKG();
		double maxVol = lkw.getMaxM3Volumen();

		return (curKG <= maxKG && curVol <= maxVol);
	}
}
