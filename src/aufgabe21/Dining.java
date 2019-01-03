package aufgabe21;

public class Dining {
	private static final int n = 5; // #Philosophen
	protected Staebchen stab[] = new Staebchen[n];

	private class Staebchen {
		private boolean verfuegbar = true;

		public synchronized void nehmen() {
			try {
				while (!verfuegbar)
					wait();
				verfuegbar = false;
			} catch (Exception e) {
				System.out.println("Abbruch");
			}
		}

		public synchronized void ablegen() {
			verfuegbar = true;
			notify();
		}
	}

	private class Philosoph implements Runnable {
		private int nr;

		public Philosoph(int i) {
			nr = i;
		}

		public void essen() {
			/*
			 * Anstatt das jeder ein zugewiesenes Stäbchen und das 'links' von sich nimmt
			 * nimmt der erste Philosoph das 'links' von sich und das zweite 'rechts' von sich
			 * So entsteht kein Deadlock mehr
			 */
			if (nr == 0) {
				stab[n - 1].nehmen();
			} else {
				stab[nr].nehmen();
			}
			stab[(nr + n - 1) % n].nehmen();
			System.out.println("Philosoph " + nr + " isst");
		}

		public void denken() {
			stab[nr].ablegen();
			stab[(nr + n - 1) % n].ablegen();
			System.out.println("Philosoph " + nr + " denkt");
		}

		public void run() {
			while (true) {
				essen();
				denken();
			}
		}
	}

	public Dining() {
		for (int i = 0; i < n; i++)
			stab[i] = new Staebchen();
		for (int i = 0; i < n; i++)
			new Thread(new Philosoph(i)).start();
	}

	public static void main(String[] args) {
		new Dining();
	}
}
