import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
public class Oppgave6 {

	public static void main(String[] args) {
		
		String ledetekst = "Program for å finne karakteren din";
		showMessageDialog(null, ledetekst);
		int elev = 1;
		do {
		
		String tallTxt = showInputDialog("Oppgi poengsum");
		int sum = parseInt(tallTxt);
		
		String ugyldig = "Ugyldig sum, prøv igjen";
		
		String karakter = "";
		
		if (sum > 100 || sum < 0) {
			karakter = ugyldig;
		}
		else if ( sum <= 39) {
			karakter = "Din karakter er F";
		}
		else if(sum <= 49) {
			karakter = "Din karakter er E";
		}
		else if(sum  <= 59) {
			karakter = "Din karakter er D";
		}
		else if(sum <= 79) {
			karakter = "Din karakter er C";
		}
		else if(sum <= 89) {
			karakter = "Din karakter er B";
		}
		else if(sum <= 100) {
			karakter = "Din karakter er A";
		}
		showMessageDialog(null, karakter);
		elev = elev + 1;
	} while (elev <=10);
}
	}
