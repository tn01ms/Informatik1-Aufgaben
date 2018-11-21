package aufgabe11;

import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
/**
 * @author Gruppe C
 * Die Klasse TaschenrechnerFrame erstellt ein Java AWT Fenster
 *         welches die Funktionen eines simplen Taschenerechners ausführen kann.
 *         Diese sind: - Addition zweier Zahlen - Subtraktion zweier Zahlen -
 *         Multiplikation zweier Zahlen - Division zweier Zahlen - Sinus einer
 *         Zahl
 */
public class TaschenrechnerFrame extends java.awt.Frame implements java.awt.event.ActionListener {

	private Label xLabel = new Label("x:");
	private Label yLabel = new Label("y:");

	private TextField xField = new TextField(10);
	private TextField yField = new TextField(10);

	private Button btnAdd = new Button("Add");
	private Button btnSub = new Button("Sub");
	private Button btnMul = new Button("Mul");
	private Button btnDiv = new Button("Div");
	private Button btnSin = new Button("Sin(x)");

	private Label resLabel = new Label("0");

	/**
	 * Im Konstruktor werden die Methoden generateFrame und fillFrame zur Erstellung
	 * des Fensters aufgerufen
	 */
	public TaschenrechnerFrame() {
		generateFrame();
		fillFrame();
		// pack() passt die Fenstergröße auf die Elemente im Frame an
		pack();
		// Sollte das Fenster aufgrund der Auflösung schlecht erkennbar, z.B. zu klein
		// sein, bitte durch folgende Zeile ersetzen und eventuell die Parameter
		// anpassen:
		// setBounds(100, 100, 500, 500);
	}

	@Override
	/**
	 * Der ActionListener der die Button Eingaben verarbeitet Add: x + y wird im
	 * Ergebnis Label angezeigt Sub: x - y wird im Ergebnis Label angezeigt Mul: x *
	 * y wird im Ergebnis Label angezeigt Div: x / y wird im Ergebnis Label
	 * angezeigt Sin: sin(x) wird im Ergebnis Label angezeigt
	 */
	public void actionPerformed(ActionEvent e) {

		double x = 0.0;
		double y = 0.0;

		// Sollte im Feld für x nichts stehen bleibt der Wert von x auf 0.0
		if (!xField.getText().isEmpty()) {
			x = Double.parseDouble(xField.getText());
		}

		// Sollte im Feld für y nichts stehen bleibt der Wert von y auf 0.0
		if (!yField.getText().isEmpty()) {
			y = Double.parseDouble(yField.getText());
		}

		if (e.getSource() == btnAdd) {
			double res = x + y;
			resLabel.setText("" + res);
		} else if (e.getSource() == btnSub) {
			double res = x - y;
			resLabel.setText("" + res);
		} else if (e.getSource() == btnMul) {
			double res = x * y;
			resLabel.setText("" + res);
		} else if (e.getSource() == btnDiv) {
			double res = x / y;
			resLabel.setText("" + res);
		} else if (e.getSource() == btnSin) {
			double res = Math.sin(x);
			resLabel.setText("" + res);
		}
	}

	/**
	 * Die Meethode platziert ein Component comp im Container ctr an der Stelle
	 * (x|y) mit der Breite w
	 * 
	 * @param ctr  Der Container
	 * @param comp Das zu platzierende Component
	 * @param x    x Position
	 * @param y    y Position
	 * @param w    Breite
	 */
	public void put(Container ctr, Component comp, int x, int y, int w) {
		GridBagLayout g = (GridBagLayout) ctr.getLayout();
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH;
		c.gridx = x;
		c.gridy = y;
		c.gridwidth = w;
		c.gridheight = 1;
		c.weightx = 0.0;
		c.weighty = 0.0;
		ctr.add(comp);
		g.setConstraints(comp, c);
	}

	/**
	 * Die Methode generateFrame setzt die Grundvorraussetzungen für das Fenster,
	 * wie den Fenstertitel, das Layout oder die Sichtbarkeit
	 */
	private void generateFrame() {
		setTitle("Taschenrechner");
		setLayout(new GridBagLayout());
		setBackground(Color.WHITE);
		setVisible(true);
	}

	/**
	 * Die Methode fillFrame füllt das Frame mit den Bedienelementen, passt diese an
	 * und weißt die ActionListener zu
	 */
	private void fillFrame() {
		// Eingabefelder
		put(this, xLabel, 0, 0, 1);
		xLabel.setAlignment(Label.CENTER);
		put(this, yLabel, 1, 0, 1);
		yLabel.setAlignment(Label.CENTER);
		put(this, xField, 0, 1, 1);
		put(this, yField, 1, 1, 1);

		// Buttons
		put(this, btnAdd, 0, 2, 1);
		btnAdd.addActionListener(this);
		put(this, btnSub, 1, 2, 1);
		btnSub.addActionListener(this);
		put(this, btnMul, 0, 3, 1);
		btnMul.addActionListener(this);
		put(this, btnDiv, 1, 3, 1);
		btnDiv.addActionListener(this);
		put(this, btnSin, 0, 4, 2);
		btnSin.addActionListener(this);

		// Ausgabe
		put(this, resLabel, 0, 5, 2);
		resLabel.setAlignment(Label.CENTER);
	}
}