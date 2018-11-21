package aufgabe7;

/**
 * Die Klasse kann die Population einer Vogelart auf einer Insel nach einer
 * vorgegebenen Anzahl an Monaten errechnen, bzw den Populationsbestand zum
 * Zeitpunkt m mit n <= m fixen Anfangsmonaten bestimmen
 * 
 * @author Tobias
 */
public class Population {

	public static void main(String[] args) {
		Population p = new Population();

		System.out.println(p.population(3, 6));
		System.out.println(p.population(6));
	}

	/**
	 * Die Methode errechnet die Population nach m Monaten
	 * 
	 * @param m Anzahl der Monate
	 * @return Die Anzahl der Vögel
	 */
	public int population(int m) {
		if (m <= 0) {
			// Wenn m <= 0 ist sind es 0 Vögel (bzw vor Aufzeichnungsbeginn)
			return 0;
		} else if (m > 0 && m <= 2) {
			// Wenn 0 < m < 2 ist es nur ein Vogel
			return 1;
		} else {
			// Die Anzahl der Vögel nach mehr als 2 Monaten wird rekursiv berechnet
			return population(m - 1) + population(m - 2);
		}
	}

	/**
	 * Die Methode errechnet den Populationsbestand zum Zeitpunkt m mit n <= m fixen
	 * Anfangsmonaten
	 * @param n Anzahl der Anfangsmonate
	 * @param m Zahl des Monats zu dem der Populationbestand betrachtet wird
	 * @return Der Populationsbestand
	 */
	public int population(int n, int m) {
		//Hab ich nicht mehr geschafft, würde aber mit mehreren for Schleifen gemacht werden
		return -1;
	}
}
