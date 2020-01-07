package podstawy;

public class Main {

	public static void main(String[] args) {
		
														// \u0001 unicode w javie
		boolean bWartoscLogiczna = true; 
		int[] TabelaLiczb = {1,1,2};  					// klamry przy typie 
		String sLancuch = "Dowolny ci¹g znaków";		// typ String nie jest typem podstawowym
		int z = 1;
		double dWartosc = 3.14;
		
		int y = (int)dWartosc;							//zmiana typu
		double dZmiana = z;
		
		
		System.out.println("Hello World");
		System.out.println(dWartosc + "; " + y + "; " + dZmiana);

		
		if(bWartoscLogiczna) {
			for(int x :TabelaLiczb ) {
				System.out.print(TabelaLiczb[x] + " ");
			}
		}
	}
}