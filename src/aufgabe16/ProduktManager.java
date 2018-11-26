package aufgabe16;

import java.util.List;
import java.util.stream.Stream;

public class ProduktManager {

	public long getAnzahlSchwereProdukte(Stream<Produkt> p) {
		return 0;
		// TODO
	}
	
	public boolean passtAufLKW(LKW lkw, List<Produkt> products) {
		Stream<Produkt> p = products.parallelStream();
		// TODO
		return false;
	}
	
}
