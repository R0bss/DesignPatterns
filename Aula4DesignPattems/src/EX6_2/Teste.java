package EX6_2;

public class Teste {
	public static void main(String[] args) {
		int[] v = {1,4,3,2,5,6};
		SortContext sc = new SortContext(new BubbleSort());
		for (int i: v) {
			System.out.println(i+", ");
		}
		System.out.println("");
		//System.out.println("---");
		sc.sort(v);
		for(int i: v) {
			System.out.println(i+", ");
		}
		
	}
}
