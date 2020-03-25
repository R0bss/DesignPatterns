package EX1_2;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class Cliente {
	public static void main(String args[]) throws ParseException{
		String datas;
		String msg = "";

		// Rotina para converte a data para dia da semana
		try (Scanner data = new Scanner(System.in)) {
			datas = data.next();
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date ontem = sdf.parse(datas);
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(ontem);
        int diaDaSemana = gc.get(GregorianCalendar.DAY_OF_WEEK);

        
        // Usando as interfaces declaradas pelas classes AbstractFactory e AbstractProduct
        if (diaDaSemana == 1){ // Domingo
        	System.out.println("Pizzaria fechada nesta data");
        	
        }else if (diaDaSemana == 2){ // Segunda
        	AbstractFactory Funcionario = new Pizzaiolo1();
        	Pizzaria ingredientes = Funcionario.getParserInstance("Ingredientes1");
        	Pizzaria pizza = Funcionario.getParserInstance("TipoPizza1");
        	msg = ingredientes.valor() + pizza.valor();
        	System.out.println(msg);
        	
        }else if (diaDaSemana == 3){ // Terça
        	AbstractFactory Funcionario = new Pizzaiolo2();
        	Pizzaria ingredientes = Funcionario.getParserInstance("Ingredientes2");
        	Pizzaria pizza = Funcionario.getParserInstance("TipoPizza2");
        	msg = ingredientes.valor() + pizza.valor();
        	System.out.println(msg);
        	
        }else if (diaDaSemana == 4){ // Quarta
        	AbstractFactory Funcionario = new Pizzaiolo1();
        	Pizzaria ingredientes = Funcionario.getParserInstance("Ingredientes1");
        	Pizzaria pizza = Funcionario.getParserInstance("TipoPizza1");
        	msg = ingredientes.valor() + pizza.valor();
        	System.out.println(msg);
        	
        }else if (diaDaSemana == 5){ // Quinta
        	AbstractFactory Funcionario = new Pizzaiolo2();
        	Pizzaria ingredientes = Funcionario.getParserInstance("Ingredientes2");
        	Pizzaria pizza = Funcionario.getParserInstance("TipoPizza2");
        	msg = ingredientes.valor() + pizza.valor();
        	System.out.println(msg);
        }else if (diaDaSemana == 6){ // Sexta
        	AbstractFactory Funcionario = new Pizzaiolo1();
        	Pizzaria ingredientes = Funcionario.getParserInstance("Ingredientes1");
        	Pizzaria pizza = Funcionario.getParserInstance("TipoPizza1");
        	msg = ingredientes.valor() + pizza.valor();
        	System.out.println(msg);
        }else { //(diaDaSemana == 7) // Sabado
        	AbstractFactory Funcionario = new Pizzaiolo2();
        	Pizzaria ingredientes = Funcionario.getParserInstance("Ingredientes2");
        	Pizzaria pizza = Funcionario.getParserInstance("TipoPizza2");
        	msg = ingredientes.valor() + pizza.valor();
        	System.out.println(msg);
        }
  
	}




	
}
