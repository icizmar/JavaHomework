package zadaca;

import javax.swing.JOptionPane;

public class Zadatak2 {

	public static void main(String[] args) {
		// U programu omoguæite unos dvije stranice pravokutnika i izraèunajte njegovu površinu i opseg.
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvu stranicu pravokutnika"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugu stranicu pravokutnika"));
		
		System.out.println("Opseg pravokutnika iznosi: " + ((a*2)+(b*2)));
		System.out.println("Površina pravokutnika iznosi: " + (a*b));

	}

}
