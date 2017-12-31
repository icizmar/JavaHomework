package zadaca;

import javax.swing.JOptionPane;

public class Zadatak5 {

	public static void main(String[] args) {
		// Prikazati korištenje switch
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi ocijenu"));
		
		switch(a) {
		case 1:
			System.out.println("Nedovoljan");
			break;
		case 2:
			System.out.println("Dovoljan");
			break;
		case 3:
			System.out.println("Dobar");
			break;
		case 4:
			System.out.println("Vrlo dobar");
			break;
		case 5:
			System.out.println("Izvrstan");
			break;
		default:
			System.out.println("Krivi unos ocijene!");
		}
		
	}

}
