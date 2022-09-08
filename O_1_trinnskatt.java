package no.hvl.dat100;

import static java.lang.Math.*;
import static javax.swing.JOptionPane.*;
import java.lang.Integer.*;

public class O_1_trinnskatt {

	public static void main(String[] args) {
		
		String inntekt = showInputDialog("Skriv inn bruttoårsinntekt");
		
		double intk = Double.parseDouble(inntekt);
		
		double sk_sats1 = 0.0093;
		double sk_sats2 = 0.0241;
		double sk_sats3 = 0.1152;
		double sk_sats4 = 0.1452;
		
		
		
		if((intk <= 164100) && (intk > 0)) {
			showMessageDialog(null,"Du har ingen trinnskatt!");
		}
		else if((intk>= 164101) && (intk<= 230950)) {
			showMessageDialog(null,"trinnskatten din er: "+(intk)*(sk_sats1));
		
		}
		else if((intk>= 290951)&& (intk<= 580650)) {
			showMessageDialog(null,"trinnskatten din er: "+(intk)*(sk_sats2));
			
		}
		else if((intk>= 580651)&& (intk<= 934050)) {
			showMessageDialog(null,"trinnskatten din er: "+(intk)*(sk_sats3));
			
		}
		else if(intk>= 934051) {
			showMessageDialog(null,"trinnskatten din er: "+(intk)*(sk_sats4));
		}
		
		else {
			showMessageDialog(null,"Skriv inn en positiv inntekt");
		}
		
		
		

	}

}
