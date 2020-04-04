package EX7_2;

public class ComparadorD extends Number implements Comparable<ComparadorD> {
	private static final long serialVersionUID = 1L;
	
	private Double value;
	
	public ComparadorD(Double value) {
		this.value = value;
	}
	@Override
	public int intValue() {
		return value.intValue();
	}

	@Override
	public long longValue() {
		return value.longValue();
	}

	@Override
	public float floatValue() {
		return value.floatValue();
	}

	@Override
	public double doubleValue() {
		return value.doubleValue();
	}

	@Override
	public int compareTo(ComparadorD obj) {
		if (this == obj)
			return 0;
		if (obj == null)
			return 1;
		//ficando apenas com as casas decimais
		double decimais = value - value.intValue();
		double objDecimais = obj.doubleValue() - obj.intValue();
		if (decimais < objDecimais) {
			return -1;
		} else if (decimais == objDecimais) {
			return 0;
		} else {
			return 1;
		}
	}
	
	@Override
	public String toString() {
		return ""+value;
	}
	
}