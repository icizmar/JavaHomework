package zadaca;

import javax.swing.JOptionPane;

public class Zadatak4 {

	public static void main(String[] args) {
		// Prikazati korištenje if
		
		float a = Float.parseFloat(JOptionPane.showInputDialog("Unesi prvi broj"));
		float b = Float.parseFloat(JOptionPane.showInputDialog("Unesi drugi broj"));
		float c = Float.parseFloat(JOptionPane.showInputDialog("Unesi treæi broj"));
		float najveci = a;
		
		if(b>a) {
			najveci = b;
		}else if(c>a) {
			najveci = c;
		}
		System.out.println("Najveci broj od 3 unesena je: " + najveci);

	}

}
