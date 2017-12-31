package zadaca;

import javax.swing.JOptionPane;

public class Zadatak7 {

	public static void main(String[] args) {
		// Kreirati program koji unosi 24 broja, ispisuje njihov zbroj, najmanji i
		// najveæi uneseni broj.

		int[] a = new int[24];

		for (int i = 0; i < 24; i++) {
			a[i] = Integer.parseInt(JOptionPane.showInputDialog("Unesi " + (i + 1) + ". broj"));
		}

		int zbroj = 0;
		int najveci = a[0];
		int najmanji = a[0];

		for (int i = 0; i < 24; i++) {
			zbroj = zbroj + a[i];
			if (a[i] > najveci) {
				najveci = a[i];
			}
			if (a[i] < najmanji) {
				najmanji = a[i];
			}
		}

		System.out.println("Zbroj svih brojeva je: " + zbroj);
		System.out.println("Najveæi broj je: " + najveci);
		System.out.println("Najmanji broj je: " + najmanji);

	}

}
