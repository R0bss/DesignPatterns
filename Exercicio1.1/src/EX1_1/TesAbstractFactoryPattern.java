package EX1_1;

import java.io.IOException;
import java.util.Random;

public class TesAbstractFactoryPattern {

	public static void main(String[] args) throws IOException {
		Random gerador = new Random();
		int x = gerador.nextInt();
		String string = "Console";
		switch (x % 2) {
		case 0:
			string = "Bloco de Notas";
			break;
		}
		if (string == "Bloco de Notas") {
			AbstractFactory parserFactory = new MostraBlocoFactory();
			MostraValor parser = parserFactory.getParserInstance("BlocoNotas");
			String msg = "";
			msg = parser.valor();
			System.out.println(msg);
		}
		if (string == "Console") {
			AbstractFactory parserFactory = new MostraConsoleFactory();
			MostraValor parser = parserFactory.getParserInstance("Console");
			String msg = "";
			msg = parser.valor();
			System.out.println(msg);
		}

	}

}
