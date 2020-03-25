package EX1_1;

public class MostraConsoleFactory implements AbstractFactory {

	@Override
	public MostraValor getParserInstance(String parserType) {
		
		switch(parserType) {
		case "Console": return new ConsoleMostraValor();
		}
		return null;
	}
}

