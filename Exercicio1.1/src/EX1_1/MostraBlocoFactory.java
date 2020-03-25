package EX1_1;

public class MostraBlocoFactory implements AbstractFactory {

	@Override
	public MostraValor getParserInstance(String parserType) {
		
		switch(parserType) {
		case "BlocoNotas": return new BlocoMostraValor();
		}
		return null;
	}
}
