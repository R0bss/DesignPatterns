package EX6_1;

public class MensagSelecionada {
	
	private final DiaSemana diaSemana;
	
	public MensagSelecionada(DiaSemana diaSemana) {
		this.diaSemana = diaSemana;
	}
	public void MensagTela(String text) {
		diaSemana.mensagem(text);
	}
}
