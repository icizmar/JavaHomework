package zadaca;

import javax.swing.JOptionPane;

public class Zadatak3 {

	public static void main(String[] args) {
		// U programu omoguæite unos broja sekundi i ispišite odgovarajuæe vrijeme u
		// satima, minutama i sekundama.

		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj sekundi"));
		int sat;
		int t;
		int min;
		int r;

		sat = a / 3600;
		if (sat != 0) {
			t = sat * 3600;
			a = a - t;
		}
		min = a / 60;
		if (min != 0) {
			r = min * 60;
			a = a - r;
		}

		System.out.println("Vrijeme je: " + sat + " h " + min + " min " + a + " s");

	}

}
