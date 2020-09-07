package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.System.*;


public class Fakultet {

	public static void main(String[] args) {
		
long heltall = parseInt(showInputDialog("Angi et heltall"));
long resultat = 1;
if (heltall > 0) {
	for (int i=1; i <= heltall; i++) {
		resultat *= i;
		out.println(resultat);}
}
else {showMessageDialog(null, "Tast inn et heltall som er høyere enn 0!"); }
showMessageDialog(null, "Fakultetet av " + heltall + " er " + resultat);
}
}
