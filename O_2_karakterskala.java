package no.hvl.dat100;

import static java.lang.Math.*;
import static javax.swing.JOptionPane.*;
import java.lang.Integer.*;


public class O_2_karakterskala {

	public static void main(String[] args) {
		

		        
		for(int i = 0; i < 10; i++) {
		
				int poengsum = Integer.parseInt(showInputDialog("Skriv inn poengsummen din"));
		        String karakter = "Ugyldig poengsum"; // original meaning 

		        if (poengsum <= 39) 
		        	karakter = "F"; // endrer "karakter" definisjonen underveis som vi får definerte poengsummer

		        if (poengsum >= 40 && poengsum <= 49) 
		        	karakter = "E";

		        if (poengsum >= 50 && poengsum <= 59) 
		        	karakter = "D";

		        if (poengsum >= 60 && poengsum <= 79) 
		        	karakter = "C";

		        if (poengsum >= 80 && poengsum <= 89) 
		        	karakter = "B";
		        		
		        if (poengsum >= 90 && poengsum <= 100) 
		        	karakter = "A";
		        
		        if((karakter).equals("Ugyldig poengsum"))//om ingen gyldige verdier --> orginal deklarasjon og verdi
		        	i = i - 1; // decrementer loopen med 1, om du taster inn en ugyldig verdi

		        showMessageDialog(null,"Karakteren din ble: "+karakter);
		        
		}




		    }

		


	
}
