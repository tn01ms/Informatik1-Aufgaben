package aufgabe9;

public class Hanoi {

	/**
	 * Die Methode stapelt alle Scheiben rückwärts aufeinander, 1 auf 2, 1&2 auf 3,
	 * usw. Danach wird der gesamte Stapel auf c verschoben
	 * 
	 * @param a Stab a
	 * @param b Stab b
	 * @param c Stab c
	 */
	public void loese(Stab a, Stab b, Stab c) {
		int anzahlScheiben = a.size() + b.size() + c.size();

		for (int i = 1; i < anzahlScheiben; i++) {
			Stab stabVon = sucheScheibe(a, b, c, i);
			Stab stabZu = sucheScheibe(a, b, c, i + 1);

			Stab stabUebrig = getUebrigenStab(stabVon, stabZu, a, b, c);

			if (stabUebrig != null) {
				bewege(i, stabVon, stabUebrig, stabZu);
			}
		}

		// Wenn die Scheiben auf a oder b liegen werden sie auf c geschoben
		if (a.size() > 0) {
			bewege(anzahlScheiben, a, b, c);
		}
		if (b.size() > 0) {
			bewege(anzahlScheiben, b, a, c);
		}
	}

	/**
	 * Die Methode ermittelt auf den Stäben a,b,c den, der nicht in {stab1, stab2}
	 * gegeben ist.
	 * 
	 * @return Der entsprechende Stab, sonst null
	 */
	private Stab getUebrigenStab(Stab stab1, Stab stab2, Stab a, Stab b, Stab c) {
		Stab[] staebe = { a, b, c };
		for (int i = 0; i < staebe.length; ++i) {
			if (stab1 != staebe[i] && stab2 != staebe[i])
				return staebe[i];
		}

		return null;
	}

	/**
	 * Die Methode durchsucht die Stäbe a,b,c nach der Scheibe mit der Größe groesse
	 * und gibt diese zurück, sonst null
	 * 
	 * @param a       Stab a
	 * @param b       Stab b
	 * @param c       Stab c
	 * @param groesse Die Größe der Scheibe die gesucht wird
	 * @return Die gefundene Scheibe
	 */
	private Stab sucheScheibe(Stab a, Stab b, Stab c, int groesse) {

		// Überprüfe Stab a
		if (a.size() > 0) {
			for (int i = 0; i < a.size(); i++) {
				if (a.get(i).getGroesse() == groesse) {
					return a;
				}
			}
		}
		// Überprüfe Stab b
		if (b.size() > 0) {
			for (int i = 0; i < b.size(); i++) {
				if (b.get(i).getGroesse() == groesse) {
					return b;
				}
			}
		}
		// Überprüfe Stab c
		if (c.size() > 0) {
			for (int i = 0; i < c.size(); i++) {
				if (c.get(i).getGroesse() == groesse) {
					return c;
				}
			}
		}

		// Wenn kein Stab gefunden wurde wird null zurückgegeben
		return null;
	}

	/**
	 * Bewegt <code>n</code> Scheiben von dem Stab <code>start</code> zum Stab
	 * <code>ziel</code>.
	 * 
	 * @param n     > 0 Anzahl der Scheiben die bewegt werden sollen
	 * @param start Start Stab
	 * @param hilf  Hilfsstab
	 * @param ziel  Ziel Stab
	 */
	public void bewege(int n, Stab start, Stab hilf, Stab ziel) {
		if (n == 1) {
			System.out.println(start + " -> " + ziel);
			ziel.push(start.pop());
		} else {
			bewege(n - 1, start, ziel, hilf);
			System.out.println(start + " -> " + ziel);
			ziel.push(start.pop());
			bewege(n - 1, hilf, start, ziel);
		}
	}

	/**
	 * Start vom Programm.
	 */
	public static void main(String[] args) {
		Stab a = new Stab("A");
		Stab b = new Stab("B");
		Stab c = new Stab("C");

		a.push(new Scheibe(4));
		a.push(new Scheibe(3));
		b.push(new Scheibe(5));
		b.push(new Scheibe(1));
		c.push(new Scheibe(2));

		new Hanoi().loese(a, b, c);
	}
}
