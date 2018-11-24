package aufgabe13;

/**
 * Die Klasse Element symbolisiert ein Element vom Datentyp T Es kann z.B. zu
 * einer Box hinzugefügt werden
 * 
 * @author Tobias
 *
 * @param <T> Der Datentyp des Elements, z.B. Integer
 */
public class Element<T> {

	private T value;
	private int size;

	/**
	 * Setzt den Wert und die Größe des Elements
	 * 
	 * @param value (generisch) Wert
	 * @param size  Größe
	 */
	public Element(T value, int size) {
		this.value = value;
		this.size = size;
	}

	/**
	 * Setzt den Wert des Elements Die Größe wird auf 1 gesetzt
	 * 
	 * @param value (generisch) Wert
	 */
	public Element(T value) {
		this.value = value;
		this.size = 1;
	}

	/**
	 * Gibt die Größe des Elements zurück
	 * 
	 * @return Die Größe
	 */
	public int getSize() {
		return size;
	}

	/**
	 * Gibt den Wert des Elements zurück
	 * 
	 * @return Der Wert
	 */
	public T getValue() {
		return value;
	}
	
	@Override
	/**
	 * Gibt den toString-Wert des Elements zurück
	 */
	public String toString() {
		return value.toString();
	}
}
