package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class KaraktererB {

	public static void main(String[] args) {
		
int poeng = parseInt(showInputDialog(null,"Elev nr. " + i + ", oppgi poengsum:"));
		while (feil==0) {

		if (poeng < 0) {
			showMessageDialog(null, "Poengsummen kan ikke være negativ!");}
		else if (poeng < 39) {
			showMessageDialog(null, "Karakteren din er F");}
		else if (poeng < 49) {
			showMessageDialog(null, "Karakteren din er E");}
		else if (poeng < 59) {
			showMessageDialog(null, "Karakteren din er D");}
		else if (poeng < 79) {
			showMessageDialog(null, "Karakteren din er C");}
		else if (poeng < 89) {
			showMessageDialog(null, "Karakteren din er B");}
		else if (poeng < 100) {
			showMessageDialog(null, "Karakteren din er A");}
		else if (poeng > 100) {
			showMessageDialog(null, "Ugyldig poengsum! (maks 100)");}
		}

				
			



	}
	


