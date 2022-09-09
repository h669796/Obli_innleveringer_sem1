package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.*;
import java.lang.Math;

public class O_3_2 {

	public static void main(String[] args) {
		
	int n = parseInt(showInputDialog("Skriv inn et n"));
	
	int fakulitet = n;
	System.out.println(n+"! = "+n);
	
	do {
		fakulitet = fakulitet - 1; // fakulitet mister en i verdi for hver loop som gjøres
		n = n * fakulitet; // ganger n med (fakulitet-1)
		System.out.print("*"+fakulitet);
		}while((fakulitet != 1)||(fakulitet > 1));
	System.out.println("= " + n);
	
	}

}
