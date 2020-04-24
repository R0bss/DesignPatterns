package Ex8_1e8_2;
/*
 * Classe que implementa Observer para divulgar not�cias
 */
public class NoticiarioAssina extends Noticiario {
	ConsomeNoticia consumidor;
	public NoticiarioAssina(ConsomeNoticia consumidor) {
		this.consumidor = consumidor;
	}
	@Override
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
//		System.out.println("Noticiario: Produzimos uma nova noticia");
//		System.out.println(dia + "/" + mes + ": " + topico + "->" + textoNoticia);
		consumidor.consomeNoticia(textoNoticia, dia, mes, topico);
	}

}