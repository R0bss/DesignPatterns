package EX1_1;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BlocoMostraValor implements MostraValor {

	@Override
	public String valor() throws IOException {
		FileWriter arq = new FileWriter("d:\\teste.txt");
		PrintWriter gravarArq = new PrintWriter(arq);
		gravarArq.printf("Hello, World");
		arq.close();
		System.out.println("Bloco de Notas Selecionado");
		return "Arquivo TxT gerado com sucesso";
	}

}
