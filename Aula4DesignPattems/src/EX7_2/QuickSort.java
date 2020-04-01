package EX7_2;

public class QuickSort implements TipoOrd {

	@Override
	public void tipo(String text, int[] v) {
		System.out.println("Ordenação nao possue p ou r");

	}

	@Override
	public void tipo(String text, int[] v, int p, int r) {
		  int j;   
		  if (p < r) {    
			  j = separa(v, p, r); 
			  tipo(text, v, p, j - 1);    
			  tipo(text, v, j + 1, r);   } 

	}

	private int separa(int[] v, int p, int r) {
		int c = v[p + ((int) (Math.random() * (1 + r - p) * 1000) % (1 + r - p))];   
		int i = p + 1, j = r, t;   
		while (true) {    
			while (i <= r && v[i] <= c)     
				++i;    
			while (c < v[j])     
				--j;    
			if (i >= j)     
				break;    
			t = v[i];    
			v[i] = v[j];    
			v[j] = t;    
			++i;    
			--j;   
		}   
		v[p] = v[j];   
		v[j] = c;   
		return j;  
	}
}