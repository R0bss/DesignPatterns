package EX1_2;

public class Pizzaiolo2 implements AbstractFactory {

	@Override
	public Pizzaria getParserInstance(String type) {

		switch (type) {
		case "TipoPizza2": return new TipoPizza2Data();
		case "Ingredientes2": return new Ingredientes2Data();
		}
		return null;
	}
}
