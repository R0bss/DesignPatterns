package EX1_1;

public class ConsoleMostraValor implements MostraValor {

	@Override
	public String valor() {
		System.out.println("Console Selecionado");
		return "Hello, World";
	}

}
