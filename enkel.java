import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
public class enkel {
	
	public static void main(String[] args) {

		String ledetekst = "Vekselautomat";
		showMessageDialog(null,ledetekst);
		String tallTxt = showInputDialog("Oppgi beløp");
		 int pris = parseInt(tallTxt);
		 
		String belopTxt = showInputDialog("Betalt beløp");
		int belop = parseInt(belopTxt);
		
		int veksel = belop - pris;
		int ant20kr = (veksel / 20);
		int sum20kr = (ant20kr * 20);
		int ant10kr = ((veksel - sum20kr) / 10);
		//int sum10kr = (ant10kr * 10);
		int ant1kr = (veksel % 10);
		
		showMessageDialog(null, "Antall 20kr er "+ ant20kr + "\n" +
		"Antall 10kr er "+ ant10kr + "\n" +
		"Antall 1r er "+ ant1kr);
	}

}
