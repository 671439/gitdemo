package no.hvl.dat100;

import static javax.swing.JOptionPane.*; 
import static java.lang.Integer. *;

public class OppgaveB4 {
	public static void main(String[] args) { 
		
		
		String svar = " ";
		
		String bruttotxt = showInputDialog("Oppogi bruttolønn: ");
	
		int brutto = parseInt(bruttotxt);
		double prosent = 0;
		double etterSkatt = (brutto * (1 - prosent));
		
		
		if (brutto <= 164100) {
			svar = "Du trenger ikke skatte.";
		
		}
		else if (164100 < brutto) {
			prosent = 0.0093;
			etterSkatt = (brutto * (1 - prosent));
			svar = ("Du må skatte 0.93% og sitter igjen med; " + etterSkatt);
			
		}
	    else if (230950<brutto) {
			prosent = 0.0241;
			etterSkatt = (brutto * (1 - prosent));
			svar = ("Du må skatte 02.14% og sitter igjen med; " + etterSkatt);
			
		}
		 else if (580650<brutto) {
		     prosent = 0.1152;
		     etterSkatt = (brutto * (1 - prosent));
			 svar = ("Du må skatte 11.52% og sitter igjen med; " + etterSkatt);
		 }
		 else if (934060<brutto) {
				 prosent = 0.1452;
				 etterSkatt = (brutto * (1 - prosent));
			 svar = ("Du må skatte 14.52% og sitter igjen med; " + etterSkatt);
		 }
	 showMessageDialog(null,svar);
	 }
			 
	}
 