package aufgabe5;


/**
 * @author Tobias
 * Die Klasse MyVector speichert einen Vektor mit beliebig vielen Skalarwerten. Diese werden durch den Konstruktor festgelegt.
 * Mit der Methode skalarprodukt(MyVector b) kann das Skalarprodukt mit einem weiteren Vektor b ausgerechnet werden.
 */
public class MyVector {
	
	private int[] values;
	
	/**
	 * Dem Konstruktor wird ein Integer Array mit den Skalarwerten übergeben.
	 * Diese werden durch die Klasse gespeichert.
	 * @param skalarwerte
	 */
	public MyVector(int[] skalarwerte) {
		//n ist die Anzahl der Skalarwerte
		int n = skalarwerte.length;
		
		values = new int[n];
		
		//Jeder Wert von skalarwerte wird in die entsprchende Stelle von values geschrieben
		for(int i = 0; i < n; i++) {
			values[i] = skalarwerte[i];
		}
	}
	
	/**
	 * Die Methode rechnet das Skalarprodukt von dem Vektor des Objekts auf das die
	 * Methode ausgeführt wurde und dem übergebenen Vektor aus.
	 * @return Sas Skalarprodukt
	 */
	public int skalarprodukt(MyVector b) {
		if (values.length != b.getValues().length) {
			//Sollten die Dimensionen beider Vektoren nicht gleich sein wird 0 zurückgegeben
			return 0;
		}
		else
		{
			int sp = 0;
			
			//Addiert das Produkt aller Skalarwertpaare im Array aus
			//und addiert es zu sp.
			for(int i = 0; i < values.length; i++) {
				sp = sp + (values[i] * b.getValues()[i]);
			}
			
			//sp wird zurückgegeben
			return sp;
		}
	}
	
	/**
	 * Gibt den Array values zurück
	 * @return Integer Array welcher die Skalarwerte enthält
	 */
	public int[] getValues() {
		return values;
	}
}
