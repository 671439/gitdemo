package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class OppgaveB5 {
    public static void main(String[] args) {
		
	
		
    	for (int elev =1; elev <=10; elev++) {
    		
    	String poengTxt = showInputDialog("Oppgi karakter: ");
    	int poeng = parseInt(poengTxt);
		String karakter = " ";
		
		
		
		if (100>= poeng && poeng > 89) {
			karakter = "Karakter: A";
		} 
		else 
			if (89>= poeng && poeng >79) {
			karakter = "Karakter: B";
		} 
		else 
			if (79>= poeng && 59 < poeng) {
			karakter = "Karakter: C";
		} 
		else 
			if (59>= poeng && 49 < poeng) {
			karakter = "Karakter: D";
		} 
		else 
			if (49>= poeng && 39 < poeng) {
			karakter = "Karakter: E";
		} 
		else 
			if (39>= poeng && poeng >0) {
			karakter = "Karakter: F";
		}
		else {
			karakter = "Ugyldig poengsum";
		
		}
		poengTxt = showInputDialog("Feil, prøv igjen. ");
		poeng = parseInt(poengTxt);

        showMessageDialog(null, karakter);
	}

  


	}

	
	}

