package EX7_2;

public class Bolha implements TipoOrd {
	@Override
	public void tipo(String text, int[] v) {
		for (int i = v.length - 1; i > 0; i--) {    
			for (int j = 0; j <= i - 1; j++) {     
				if (v[j] > v[j + 1]) {      
					int aux = v[j + 1];      
					v[j + 1] = v[j];      
					v[j] = aux;     
				}    
			}   
		}   
		System.out.println(v);  
	}

	@Override
	public void tipo(String text, int[] v, int p, int r) {
		System.out.println("Ordenação nao possue p ou r");
		
	}


}
