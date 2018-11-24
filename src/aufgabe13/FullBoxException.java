package aufgabe13;

@SuppressWarnings("serial")
/**
 * Ein Fehler der geworfen wird wenn ein Element einer Box hinzugefügt werden
 * soll, aber nicht mehr genug Platz ist
 * 
 * @author Tobias
 */
public class FullBoxException extends java.lang.Exception {

	public FullBoxException() {
		super("FullBoxException: Box is full!");
	}
}