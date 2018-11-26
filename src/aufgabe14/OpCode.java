package aufgabe14;

public enum OpCode {
	PUSH(1,1), ADD(2,1), SUB(2,1), JUMP(1,0), STOP(0,0);
	
	private int consumes;
	private int produces;
	
	private OpCode(int c, int p) {
		this.consumes = c;
		this.produces = p;
	}

	public int getConsumes() {	
		return consumes;
	}

	public int getProduces() {	
		return produces;
	}
}
