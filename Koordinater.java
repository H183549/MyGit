package no.hvl.dat100;
import static java.lang.Math.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Koordinater {

	public static void main(String[] args) {
		int x2 = 30;
		int x1 = 20;
		int y2 = 40;
		int y1 = 20;
		double avstand = sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		String utTxt = "Avstand er" +  avstand;
		showMessageDialog(null,utTxt);
	}

}
