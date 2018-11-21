package aufgabe13;

public class Box {

	Element<?>[] elements;
	int index;

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

	public void addElement(Element<?> e) throws FullBoxException {
		try {
			if (e.getSize() + index <= elements.length) {
				elements[index] = e;
				index += e.getSize();
			} else {
				throw new FullBoxException();
			}
		} catch (FullBoxException ex) {
			System.out.println("FullBoxException: Box is full!");
		}
	}
}
