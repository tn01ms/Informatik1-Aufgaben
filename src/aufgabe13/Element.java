package aufgabe13;

public class Element<T> {

	private T value;
	private int size;

	public Element(T value, int size) {
		this.value = value;
		this.size = size;
	}

	public Element(T value) {
		this.value = value;
		this.size = 1;
	}

	public int getSize() {
		return size;
	}

	public T getValue() {
		return value;
	}
}
