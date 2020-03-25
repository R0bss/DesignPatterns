package EX1_2;

public class Pizzaiolo1 implements AbstractFactory{
	
	@Override
	public Pizzaria getParserInstance(String type) {
	
		switch(type) {
			case "TipoPizza1": return new TipoPizza1Data();
			case "Ingredientes1": return new Ingredientes1Data();
		}
		return null;
	}
}
