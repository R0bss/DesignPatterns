package EX3_1;

public class Incremental {
	private static int count = 0;
	private int numero;
	private static Incremental incremental = null;
	
	public Incremental() {
		numero = ++count;
	}
	
	public static synchronized Incremental getInstance() {
		if(incremental ==null) {
			incremental = new Incremental();
		}
		return incremental;
	}
	
	public String toString() {
		return "Incremental " + numero;
	}
}
