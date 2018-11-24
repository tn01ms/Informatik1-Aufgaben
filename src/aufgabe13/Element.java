package aufgabe13;

/**
 * Die Klasse Element symbolisiert ein Element vom Datentyp T Es kann z.B. zu
 * einer Box hinzugef�gt werden
 * 
 * @author Tobias
 *
 * @param <T> Der Datentyp des Elements, z.B. Integer
 */
public class Element<T> {

	private T value;
	private int size;

	/**
	 * Setzt den Wert und die Gr��e des Elements
	 * 
	 * @param value (generisch) Wert
	 * @param size  Gr��e
	 */
	public Element(T value, int size) {
		this.value = value;
		this.size = size;
	}

	/**
	 * Setzt den Wert des Elements Die Gr��e wird auf 1 gesetzt
	 * 
	 * @param value (generisch) Wert
	 */
	public Element(T value) {
		this.value = value;
		this.size = 1;
	}

	/**
	 * Gibt die Gr��e des Elements zur�ck
	 * 
	 * @return Die Gr��e
	 */
	public int getSize() {
		return size;
	}

	/**
	 * Gibt den Wert des Elements zur�ck
	 * 
	 * @return Der Wert
	 */
	public T getValue() {
		return value;
	}
	
	@Override
	/**
	 * Gibt den toString-Wert des Elements zur�ck
	 */
	public String toString() {
		return value.toString();
	}
}
