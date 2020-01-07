package podstawy;

import java.math.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sIn = new Scanner(System.in);
		
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
		
		System.out.println("Podaj has³o: ");
		String sHaslo = sIn.nextLine();
		if(sHaslo.equalsIgnoreCase("sortowanie")) {
			
			int[] numbers = new int[50];
			for(int q = 0; q < 50; q++) {
				numbers[q] = q + 1;
			}
			int n = 6;
			int[] results = new int[n];
			for(int w = 0; w < n; w++) {
				int r = (int)(Math.random()*50);
				results[w] = numbers[r];
				numbers[r] = numbers[n];
			}
			Arrays.sort(results);
			for(int rs: results)
				System.out.println(rs);
		}
		if(sHaslo.equalsIgnoreCase("haslo")) {
			System.out.println(sLancuch.toLowerCase()+ " " + z);
			System.out.println(iSin);
			System.out.println(dWartosc + "; " + y + "; " + dZmiana);
	
			
			if(bWartoscLogiczna) {
				for(int x :TabelaLiczb ) {
					System.out.print(TabelaLiczb[x] + " ");
				}
			}
		}
	}
}