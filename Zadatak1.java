package zadaca;

import javax.swing.JOptionPane;

public class Zadatak1 {

	public static void main(String[] args) {
		// U programu omoguæite unos dva broja, broj sati i minuta. Ispišite koliko taj broj sati i minuta iznosi u sekundama.
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj sati"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj minuta"));
		
		System.out.println("Uneseni broj sati i minuta u sekundama iznosi: " + ((b*60)+((a*60)*60)));

	}

}
