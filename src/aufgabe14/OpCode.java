package aufgabe14;

public enum OpCode {
	PUSH, ADD, SUB, JUMP, STOP;

	public int getConsumes() {	
		switch (this) {
		case STOP:
			return 0;
		case PUSH:
		case JUMP:
			return 1;
		case ADD:
		case SUB:
			return 2;
		default:
			return -1;
		}
	}

	public int getProduces() {	
		switch (this) {
		case STOP:
		case JUMP:
			return 0;
		case PUSH:
		case ADD:
		case SUB:
			return 1;
		default:
			return -1;
		}
	}
}
