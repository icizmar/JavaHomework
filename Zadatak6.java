package zadaca;

import javax.swing.JOptionPane;

public class Zadatak6 {

	public static void main(String[] args) {
		// Prikazati korištenje if + switch

		System.out.println("Izaberi radnju nad trokutom");
		System.out.println("1 za površinu");
		System.out.println("2 za opseg");

		int t = Integer.parseInt(JOptionPane.showInputDialog("Odaberi radnju nad trokutom"));
		float a = Float.parseFloat(JOptionPane.showInputDialog("Duljina a stranice"));
		float b = Float.parseFloat(JOptionPane.showInputDialog("Duljina b stranice"));
		float c = Float.parseFloat(JOptionPane.showInputDialog("Duljina c stranice"));
		float va = Float.parseFloat(JOptionPane.showInputDialog("Unesi visinu na stranicu a"));
		float vb = Float.parseFloat(JOptionPane.showInputDialog("Unesi visinu na stranicu b"));
		float vc = Float.parseFloat(JOptionPane.showInputDialog("Unesi visinu na stranicu c"));

		if ((a + b > c) || (a + c > b) || (b + c > a)) {
			System.out.println("Ispravno ste unjeli stranice trokuta");

			switch (t) {

			case 1:
				if (va > 0) {
					System.out.println("Površina trokuta je: " + ((a * va) / 2));
				} else if (vb > 0) {
					System.out.println("Površina trokuta je: " + ((b * vb) / 2));
				} else if (vc > 0) {
					System.out.println("Površina trokuta je: " + ((c * vc) / 2));
				}
				break;
			case 2:
				System.out.println("Opseg trokuta je: " + (a + b + c));
				break;
			}
		} else {
			System.out.println("Niste ispravno unjeli stranice trokuta");
		}

	}

}
