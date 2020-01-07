package podstawy;

import java.math.*;

public class Main {

	public static void main(String[] args) {
		
														// \u0001 unicode w javie
		boolean bWartoscLogiczna = true; 
		int[] TabelaLiczb = {1,1,2};  					// klamry przy typie 
		String sLancuch = "Dowolny ci¹g znaków";		// typ String nie jest typem podstawowym
		int z = 1;
		double dWartosc = 3.14;
		
		int y = (int)dWartosc;							//rzutowanie
		double dZmiana = z;
		
		int iSin = (int)Math.asin(Math.PI);
		
		z = sLancuch.length();
		
		
		System.out.println(sLancuch+ " " + z);
		System.out.println(iSin);
		System.out.println(dWartosc + "; " + y + "; " + dZmiana);

		
		if(bWartoscLogiczna) {
			for(int x :TabelaLiczb ) {
				System.out.print(TabelaLiczb[x] + " ");
			}
		}
	}
}