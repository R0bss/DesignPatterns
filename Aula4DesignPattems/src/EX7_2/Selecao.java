package EX7_2;

public class Selecao implements TipoOrd {

	@Override
	public void tipo(String text, int[] v) {
		  int i, j, min, x; 
		  for (i = 0; i < v.length - 1; ++i) {    
			  min = i;    
			  for (j = i + 1; j < v.length; ++j) {     
				  if (v[j] < v[min])      
					  min = j;    
				  }    
			  x = v[i];    
			  v[i] = v[min];    
			  v[min] = x;   
		  }   
		  System.out.println(v);
	}

	@Override
	public void tipo(String text, int[] v, int p, int r) {
		System.out.println("Ordena��o nao possue p ou r");
		
	}

}
