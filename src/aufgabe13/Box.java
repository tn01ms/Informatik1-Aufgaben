package aufgabe13;

/**
 * Die Klasse Box symbolisiert eine Box welche Elemente beliebigen Datentyps
 * speichern kann. Sie hat eine festgelegte Gr��e.
 * 
 * @author Tobias
 */
public class Box {

	Element<?>[] elements;

	// Wird verwendet um die F�llmenge der Box zu bestimmen
	int index;

	/**
	 * Der Konstruktor erzeugt eine neue Box mit der Fassungsgr��e n
	 * 
	 * @param n Gesamtgr��e aller Elemente die in die Box k�nnen bevor diese voll
	 *          ist.
	 * @throws IllegalArgumentException wenn n < 0
	 */
	public Box(int n) throws IllegalArgumentException {
		try {
			if (n <= 0) {
				throw new IllegalArgumentException();
			} else {
				elements = new Element[n];
				index = 0;
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Illegal Argument: n has to be bigger than 0");
		}
	}

	/**
	 * Die Methode f�gt ein Element der Box hinzu.
	 * 
	 * @param e Das hinzuzuf�gende Element
	 * @throws FullBoxException Wenn das Element nicht mehr in die Box passt
	 */
	public void addElement(Element<?> e) throws FullBoxException {
		try {
			if (e.getSize() + index <= elements.length) {
				elements[index] = e;
				index += e.getSize();
			} else {
				throw new FullBoxException();
			}
		} catch (FullBoxException ex) {
			ex.printStackTrace();
		}
	}
	
	/**
	 * Gibt das Array elements zur�ck
	 * @return Das Array
	 */
	public Element<?>[] getElements() {
		return elements;
	}
}
