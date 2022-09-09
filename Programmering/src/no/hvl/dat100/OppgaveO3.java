package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class OppgaveO3 {
    public static void main(String[] args) {
		
    	String nTxt = showInputDialog("Oppgi et positivt tall:");
    	int n = parseInt(nTxt);
    int i,fact=1;
    String feil = "Ugylig tall";
    
    //om n er negativt:
    if (n<=0) {
    	  showMessageDialog(null, feil);
  }
    else {
    	
    for (i=1;i<= n; i++) {
    	fact = fact*i;
    }
    String hei = " Fakultet av ";
    String ho = " er ";
    showMessageDialog(null, hei + n + ho + fact);
    
    	}
	}

}