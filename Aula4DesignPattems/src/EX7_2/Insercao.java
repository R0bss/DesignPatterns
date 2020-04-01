package EX7_2;

public class Insercao implements TipoOrd {

	@Override
	public void tipo(String text, int[] v) {
		int i, j, x; 
		for (j = 1; j < v.length; ++j) {    
			x = v[j];    
			for (i = j - 1; i >= 0 && v[i] > x; --i) {     
				v[i + 1] = v[i];    
			}    
			v[i + 1] = x;   
		}   
		System.out.println(v); 
	}

	@Override
	public void tipo(String text, int[] v, int p, int r) {
		System.out.println("Ordenação nao possue p ou r");
		
	}

}
