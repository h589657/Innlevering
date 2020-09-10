package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

public class KaraktererBC {

	public static void main(String[] args) {
		
 int p;
 int f = 39;
 int e = 49;
 int d = 59;
 int c = 79;
 int b = 89;
  String karakter = "Du fikk karakteren: ";
	for (int i=1; i<=10; i++) {
			 p = Integer.parseInt(showInputDialog("Antall poeng? (Elev nr : "+ i +")"));
		if (p<0 || p>100) {
				 showMessageDialog(null, "Feil: Tast inn et tall mellom 0 og 100!");
				 i--;
		 } else if (p<=f) {
				 showMessageDialog(null, karakter + "F");
		 } else if (p<=e) {
				 showMessageDialog(null, karakter + "E");
		 } else if (p<=d) {
				 showMessageDialog(null, karakter + "D");
		 } else if (p<=c) {
				 showMessageDialog(null, karakter + "C");
		 } else if (p<=b) {
				 showMessageDialog(null, karakter + "B");
		 } else {
				 showMessageDialog(null, karakter + "A");
		 }
	}

	}
}
