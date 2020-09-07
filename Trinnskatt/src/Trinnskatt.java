import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;


public class Trinnskatt {

	public static void main(String[] args) {
	
double inntekt = parseInt(showInputDialog(null, "Skriv din inntekt her: "));
double skatt = 0;

if (inntekt >= 934051){
	skatt += (inntekt - 934051) * 0.145; 
inntekt = 934051;}
if (inntekt >= 580651){
	skatt += (inntekt - 580651) *0.1152; 
inntekt = 580651;}
if (inntekt >= 230951){
	skatt += (inntekt - 230951) *0.0241;
inntekt = 230951;}
if (inntekt >= 164101){
	skatt += (inntekt - 164101) *0.0093; 
inntekt = 164101; }
if (inntekt <= 164100) {
	skatt += 0.0;}


showMessageDialog(null, "Din trinnskatt blir " + skatt + " kr");
	
}

}
