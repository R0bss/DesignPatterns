package EX7_1;

public class Teste {

	public static void main(String[] args){
		DiaSemana mensagem = new Segunda();
		MensagSelecionada selecionada = new MensagSelecionada(mensagem);
		selecionada.MensagTela("Segunda");
		
	}
}
